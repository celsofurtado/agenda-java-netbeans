package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Operacoes;
import javax.swing.JOptionPane;

public class EspecialidadeForm extends javax.swing.JDialog {
    
    private Especialidade especialidade;
    private Operacoes operacao;

    public EspecialidadeForm(java.awt.Frame parent, boolean modal, Operacoes operacao) {
        
        super(parent, modal);
        initComponents();
        
        this.operacao = operacao;
        
        this.setLocationRelativeTo(parent);
        this.labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/add.png")));
        
    }
    
    public EspecialidadeForm(java.awt.Frame parent, 
            boolean modal, 
            Especialidade especialidade,
            Operacoes operacao) {
        
        super(parent, modal);
        initComponents();
        
        this.operacao = operacao;
        
        this.setLocationRelativeTo(parent);
        this.labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/edit-button.png")));
        this.formEspecialidadeTitulo.setText("Especialidades - " + operacao.toString());
        
        this.especialidade = especialidade;
        
        preencherFormulario();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGravar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        formEspecialidadeTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textFieldDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        buttonGravar.setBackground(new java.awt.Color(0, 204, 51));
        buttonGravar.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        buttonGravar.setForeground(new java.awt.Color(255, 255, 255));
        buttonGravar.setText("Gravar");
        buttonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGravar);
        buttonGravar.setBounds(450, 360, 140, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        formEspecialidadeTitulo.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        formEspecialidadeTitulo.setText("Especialidades - NOVO");
        jPanel1.add(formEspecialidadeTitulo);
        formEspecialidadeTitulo.setBounds(50, 9, 390, 22);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/edit-button.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(10, 5, 35, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 40);

        buttonCancelar.setBackground(new java.awt.Color(255, 204, 0));
        buttonCancelar.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(600, 360, 140, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        labelNome.setText("Nome da especialidade:");
        jPanel2.add(labelNome);
        labelNome.setBounds(20, 110, 260, 17);
        jPanel2.add(textFieldNome);
        textFieldNome.setBounds(20, 130, 690, 30);

        labelDescricao.setText("Descrição da especialidade:");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(20, 170, 270, 17);
        jPanel2.add(textFieldDescricao);
        textFieldDescricao.setBounds(20, 190, 690, 30);

        jLabel1.setText("Código:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 40, 80, 17);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 255, 204));
        textFieldCodigo.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        textFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 60, 80, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 50, 730, 290);

        setSize(new java.awt.Dimension(766, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
        
        String mensagem = "";
        Especialidade e = new Especialidade();
        
        e.setNome(textFieldNome.getText());
        e.setDescricao(textFieldDescricao.getText());
        
        if(operacao == Operacoes.EDITAR) {
            e.setCodigo(this.especialidade.getCodigo());
            EspecialidadeDAO.atualizar(e);
            mensagem = "Especialidade atualizada com sucesso!";
        } else {
            EspecialidadeDAO.gravar(e);
            mensagem = "Especialidade criada com sucesso!";
        }
        
        JOptionPane.showMessageDialog(
                this, 
                mensagem, 
                "Especialidade", 
                JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
        
    }//GEN-LAST:event_buttonGravarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JLabel formEspecialidadeTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

    private void preencherFormulario() {
        this.textFieldCodigo.setEditable(false);
        this.textFieldCodigo.setText(especialidade.getCodigo().toString());
        this.textFieldDescricao.setText(especialidade.getDescricao());
        this.textFieldNome.setText(especialidade.getNome());
    }
}
