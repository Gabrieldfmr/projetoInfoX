/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.infox.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author Cliente
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /** Creates new form TelaPrincipal */
    public TelaPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenCadastro = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadOs = new javax.swing.JMenuItem();
        MenCadUsu = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        MenRelSer = new javax.swing.JMenuItem();
        MenAju = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("x Sistema para Controle de Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(640, 540));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblUsuario.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Harlow Solid Italic", 1, 18)); // NOI18N
        lblData.setText("Data");

        MenCadastro.setText("Cadastro");
        MenCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadastroActionPerformed(evt);
            }
        });

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenCadCli.setText("Cliente");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        MenCadastro.add(MenCadCli);

        MenCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenCadOs.setText("OS");
        MenCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadOsActionPerformed(evt);
            }
        });
        MenCadastro.add(MenCadOs);

        MenCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        MenCadUsu.setText("Usuários");
        MenCadUsu.setEnabled(false);
        MenCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadUsuActionPerformed(evt);
            }
        });
        MenCadastro.add(MenCadUsu);

        Menu.add(MenCadastro);

        MenRel.setText("Relatório");
        MenRel.setEnabled(false);

        MenRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenRelSer.setText("Serviços");
        MenRel.add(MenRelSer);

        Menu.add(MenRel);

        MenAju.setText("Ajuda");

        MenAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenAjuSob.setText("Sobre");
        MenAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuSob);

        Menu.add(MenAju);

        MenOpc.setText("Opções");

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenOpcSai.setText("Sair");
        MenOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSaiActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcSai);

        Menu.add(MenOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(984, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas abaixo substituem a lblData pela data atual do sistema
        
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcSaiActionPerformed
        // EXIBE UMA CAIXA DE DIALOGO
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenOpcSaiActionPerformed

    private void MenAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobActionPerformed
        // chamandoa tela sobre 
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenAjuSobActionPerformed

    private void MenCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadastroActionPerformed
       
        
    }//GEN-LAST:event_MenCadastroActionPerformed

    private void MenCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadUsuActionPerformed
        // as linhas abaixo vão abri o form Tela usuario dentro do desktop pane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        Desktop.add(usuario);
    }//GEN-LAST:event_MenCadUsuActionPerformed

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed
        // chamando a tela cliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        Desktop.add(cliente);
    }//GEN-LAST:event_MenCadCliActionPerformed

    private void MenCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadOsActionPerformed
        // Chamando a tela Os
        TelaOs os = new TelaOs();
        os.setVisible(true);
        Desktop.add(os);
    }//GEN-LAST:event_MenCadOsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadOs;
    public static javax.swing.JMenuItem MenCadUsu;
    private javax.swing.JMenu MenCadastro;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcSai;
    public static javax.swing.JMenu MenRel;
    private javax.swing.JMenuItem MenRelSer;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

}