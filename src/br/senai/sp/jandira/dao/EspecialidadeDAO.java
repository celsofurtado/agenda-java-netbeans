package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.Especialidade;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private static final ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }
    
    public static void excluir(int codigo) {
        
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                System.out.println("Excluindo especialidade...");
                break;
            }
        }
        
    }
    
    public static ArrayList<Especialidade> listar() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(int codigo) {
        Especialidade especialidade = new Especialidade();
        
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
        
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) {
        
        for(Especialidade e : especialidades) {
            if(Objects.equals(e.getCodigo(), especialidadeAtualizada.getCodigo())) {
                int i = especialidades.indexOf(e);
                especialidades.set(i, especialidadeAtualizada);
                break;
            }
        }
        
    }
    
    public static DefaultTableModel tableEspecialidadeModel() {
        
        Object[][] dadosEspecialidades = new Object[especialidades.size()][3];
        
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
    
    public static void criarEspecialidadesTeste() {
        
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
