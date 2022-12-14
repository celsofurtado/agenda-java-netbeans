package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Operacoes;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelEspecialidades extends javax.swing.JPanel {

    public final String TITULO_MENSAGEM = "Cadastro de Especialidades";
    private EspecialidadeDAO dao = new EspecialidadeDAO();

    public PanelEspecialidades() {
        initComponents();
        setVisible(true);

        //EspecialidadeDAO.criarEspecialidadesTeste();
        //dao.getEspecialidades();
        carregarEspecialidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de especialidades:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 0, 17), new java.awt.Color(153, 0, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 370));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollEspecialidades.setViewportView(tableEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 30, 880, 260);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/delete.png"))); // NOI18N
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(660, 300, 70, 50);

        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/add.png"))); // NOI18N
        buttonNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(820, 300, 70, 50);

        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/edit-button.png"))); // NOI18N
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(740, 300, 70, 50);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 310, 102, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadeActionPerformed
        EspecialidadeForm operadoraForm = new EspecialidadeForm(null, true, Operacoes.NOVO);
        operadoraForm.setVisible(true);
        carregarEspecialidades();
    }//GEN-LAST:event_buttonNovaEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed
        int linha = tableEspecialidades.getSelectedRow();
        abrirCadastroDeEspecialidades(linha);
        carregarEspecialidades();
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
        int linha = tableEspecialidades.getSelectedRow();

        if (linha != -1) {

            excluirEspecialidade(linha);

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Nenhuma especialidade selecionada.\n\nPor favor selecione uma especialidade para excluir.\n\n",
                    TITULO_MENSAGEM,
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarEspecialidades();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void carregarEspecialidades() {

        System.out.println("Atualizando lista de especialidades...");
        
        dao.getEspecialidades();
        
        tableEspecialidades.setModel(dao.tableEspecialidadeModel());

        // Desativar o redimensionamento atuomatico da JTable
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Impedir a edi????o do conte??do das c??lulas da JTable
        tableEspecialidades.setDefaultEditor(Object.class, null);

        // Impedir a movimenta????o das colunas da JTable
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        // Definir a largura de cada coluna na JTable
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(550);

        tableEspecialidades.setRowHeight(20);

    }

    private void abrirCadastroDeEspecialidades(int linha) {

        if (linha != -1) {
            int codigo = Integer.parseInt(tableEspecialidades.getValueAt(linha, 0).toString());
            Especialidade especialidade = dao.getEspecialidade(codigo);

            EspecialidadeForm operadoraForm = new EspecialidadeForm(null,
                    true,
                    especialidade,
                    Operacoes.EDITAR);

            operadoraForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Nenhuma especialidade selecionada.\n\nPor favor selecione uma especialidade\npara exibir os seus detalhes.\n\n",
                    TITULO_MENSAGEM,
                    JOptionPane.WARNING_MESSAGE);
        }

    }

    private void excluirEspecialidade(int linha) {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Voc?? confirma a exclus??o da especialidade selecionada?",
                TITULO_MENSAGEM,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        System.out.println(resposta);

        if (resposta == 0) {

            int codigo = Integer.parseInt(tableEspecialidades.getValueAt(linha, 0).toString());
            dao.excluir(codigo);

            carregarEspecialidades();

            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade exclu??da com sucesso!",
                    TITULO_MENSAGEM,
                    JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
