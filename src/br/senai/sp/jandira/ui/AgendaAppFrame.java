/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaAppFrame extends javax.swing.JFrame {
    
    private PanelMedico panelMedico;
    private PanelEspecialidades panelEspecialidades;
    
    public final String TITULO_MENSAGEM = "Cadastro de Especialidades";

    public AgendaAppFrame() {

        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/images/calendar.png")));
        
        panelMedico = new PanelMedico();
        panelEspecialidades = new PanelEspecialidades();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelIconeTitulo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de consultas");
        setPreferredSize(new java.awt.Dimension(935, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(153, 0, 102));
        panelTitulo.setLayout(null);

        labelIconeTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/calendar.png"))); // NOI18N
        panelTitulo.add(labelIconeTitulo);
        labelIconeTitulo.setBounds(10, 4, 64, 70);

        labelTitulo.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Agenda de Consultas");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(80, 30, 410, 30);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 940, 80);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/exit.png"))); // NOI18N
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(790, 100, 110, 60);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/schedule.png"))); // NOI18N
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(150, 100, 110, 60);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/cough.png"))); // NOI18N
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(270, 100, 110, 60);

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/medical-team.png"))); // NOI18N
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(390, 100, 110, 60);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/member-card.png"))); // NOI18N
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(510, 100, 110, 60);

        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(20, 60, 820, 40);

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel2.setText("Suporte:");
        panelHome.add(jLabel2);
        jLabel2.setBounds(30, 200, 160, 17);

        jLabel3.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        jLabel3.setText("Telefone:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(30, 270, 100, 16);

        jLabel4.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        jLabel4.setText("E-mail:");
        panelHome.add(jLabel4);
        jLabel4.setBounds(30, 240, 44, 16);

        jLabel5.setText("+55 (11)96636-9966");
        panelHome.add(jLabel5);
        jLabel5.setBounds(110, 270, 220, 17);

        jLabel6.setText("suporte@dezsoft.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(110, 240, 220, 17);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        panelHome.add(jPanel1);
        jPanel1.setBounds(20, 150, 840, 2);

        jLabel7.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Sistema de agendamento de consultas");
        panelHome.add(jLabel7);
        jLabel7.setBounds(20, 100, 820, 40);

        getContentPane().add(panelHome);
        panelHome.setBounds(20, 180, 890, 360);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/home32.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(30, 100, 110, 60);

        setSize(new java.awt.Dimension(933, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Confirma a saída do sistema?", "Sair do sistema", JOptionPane.YES_NO_OPTION);

        if(resposta == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed

        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelMedico.setBounds(20, 170, 900, 370);
        getContentPane().add(panelMedico);
        panelMedico.setVisible(true);
        
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed

        panelHome.setVisible(false);
        panelMedico.setVisible(false);
        panelEspecialidades.setBounds(20, 170, 900, 370);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(true);
        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelMedico.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIconeTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables

    
}
