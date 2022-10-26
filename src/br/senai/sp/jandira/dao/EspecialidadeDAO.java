package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private Path path = Paths.get("/home/celsofurtado/java/especialidade.txt");
    private final String ARQUIVO_ATUAL = "/home/celsofurtado/java/especialidade.txt";
    private final String ARQUIVO_TEMP = "/home/celsofurtado/java/especialidade_temp";
    
    public void gravar(Especialidade especialidade) {
        
        // Escrever o objeto no arquivo
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    path, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            bw.write(
                    especialidade.getCodigo() 
                            + ";" + especialidade.getNome() 
                            + ";" + especialidade.getDescricao());
            
            bw.newLine();
            bw.close();
            
            especialidades.add(especialidade);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na gravação do registro...");
        }
        
        // Forma antiga, utilizando o db falso
        //especialidades.add(especialidade);
    }
    
    public void excluir(Integer codigo) {
        
        System.out.println(codigo);
        
        File arquivoAtual = new File(ARQUIVO_ATUAL);
        File arquivoTemp = new File(ARQUIVO_TEMP);
        
        Path pathArquivoAtual = Paths.get(arquivoAtual.getAbsolutePath());
        Path pathArquivoTemp = Paths.get(arquivoTemp.getAbsolutePath());
        
        String linhaAtual = "";
        String[] especialidade;
        
        try {
            // Criar o arquivo temporário que será utilizado para a troca
            arquivoTemp.createNewFile();
            
            // Abrir o arquivo atual para leitura
            BufferedReader brAtual = Files.newBufferedReader(pathArquivoAtual);
            
            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    pathArquivoTemp, 
                    Charset.forName("UTF-8"),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            // Iterar no arquivo atual e mover todos os registros para
            // o arquivo temporário, exceto o registro escolhido para remoção
            linhaAtual = brAtual.readLine();
            
            while(linhaAtual != null) {
                especialidade = linhaAtual.split(";");
                
                if(!(especialidade[0].equals(codigo.toString()))) {
                    bwTemp.write(convertArrayToString(especialidade));
                    bwTemp.newLine();
                }
                
                linhaAtual = brAtual.readLine();
            }
            
            // Fechar o arquivo temporário e fechar
            bwTemp.flush();
            bwTemp.close();
            brAtual.close();
            
            // Excluir o arquivo atual e renomear o arquivo temporário
            // com o mesmo nome do arquivo atual
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
                
    }
    
    public String convertArrayToString(String[] especialidade) {
        return especialidade[0] + ";" + especialidade[1] + ";" + especialidade[2];
    }
    
    public ArrayList<Especialidade> listar() {
        return especialidades;
    }
    
    public Especialidade getEspecialidade(int codigo) {
        
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
        
    }
    
    public void atualizar(Especialidade especialidadeAtualizada) {
        
        for(Especialidade e : especialidades) {
            if(Objects.equals(e.getCodigo(), especialidadeAtualizada.getCodigo())) {
                int i = especialidades.indexOf(e);
                especialidades.set(i, especialidadeAtualizada);
                break;
            }
        }
        
    }
    
    public ArrayList<Especialidade> getEspecialidades() {
        
        especialidades.clear();
        
        String line = "";
        
        try {
            BufferedReader br = Files.newBufferedReader(path);
            line = br.readLine();
            
            while(line != null) {
                String[] especialidade = line.split(";");
                
                Especialidade e = new Especialidade(
                        Integer.valueOf(especialidade[0]), 
                        especialidade[1], 
                        especialidade[2]);
                
                especialidades.add(e);
                
                Especialidade.contador = e.getCodigo() + 1;
                
                line = br.readLine();
            }
            
            br.close();
            
            return especialidades;
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler o arquivo...");
        }
        
        return null;
    }
    
    public DefaultTableModel tableEspecialidadeModel() {
        
        //especialidades.clear();
        
        //Object[][] dadosEspecialidades = new Object[especialidades.size()][3];
        Object[][] dadosEspecialidades = new Object[especialidades.size()][3];
        System.out.println(especialidades.size());
        
        int linha = 0;
        for(Especialidade e : especialidades) {
            dadosEspecialidades[linha][0] = e.getCodigo().toString();
            dadosEspecialidades[linha][1] = e.getNome();
            dadosEspecialidades[linha][2] = e.getDescricao();
            linha++;
        }
        
        String[] colunas = {"Código", "Nome", "Descrição"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dadosEspecialidades, colunas);
        
        return tableModel;
        
    }
    
    public void criarEspecialidadesTeste() {
        
        Especialidade e0 = new Especialidade(
                "Cardiologia", 
                "Aborda as doenças relacionadas com o coração e sistema vascular.");
        especialidades.add(e0);
        
        Especialidade e1 = new Especialidade(
                "Dermatologia", 
                "É o estudo da pele anexos (pelos, glândulas), tratamento e prevenção das doenças.");
        especialidades.add(e1);
        
        Especialidade e2 = new Especialidade(""
                + "Angiologia", 
                "É a área da medicina que estuda o tratamento das doenças do aparelho circulatório.");
        especialidades.add(e2);
        
        Especialidade e3 = new Especialidade(
                "Nefrologia", 
                "É a parte da medicina que estuda e trata clinicamente as doenças do rim, como insuficiência renal.");
        especialidades.add(e3);
        
        Especialidade e4 = new Especialidade(
                "Neurologia", 
                "É a parte da medicina que estuda e trata o sistema nervoso.");
        especialidades.add(e4);
        
    }
    
}
