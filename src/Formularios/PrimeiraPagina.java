/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JFrame;

/**
 *
 * @author larissa
 */
public class PrimeiraPagina extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiraPagina
     */
    public PrimeiraPagina() {
        initComponents();
    }

    PrimeiraPagina(Cad_Login aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livraria Dom Casmurro versão 0.0.1");

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/imagemc.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_0.png")); // NOI18N
        jMenu1.setText("Cadastrar        ");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_3.png")); // NOI18N
        jMenuItem2.setText("Funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem10.setText("Fornecedor");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_2.png")); // NOI18N
        jMenuItem4.setText("Livros");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu6.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_9.png")); // NOI18N
        jMenu6.setText("Consultar         ");

        jMenuItem9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem9.setText("Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_3.png")); // NOI18N
        jMenuItem7.setText("Funcionário");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem12.setText("Fornecedor");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_2.png")); // NOI18N
        jMenuItem11.setText("Livros");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_1.png")); // NOI18N
        jMenu2.setText("Editar       ");
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem5.setText("Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_3.png")); // NOI18N
        jMenuItem6.setText("Funcionário");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem13.setText("Fornecedor");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_2.png")); // NOI18N
        jMenuItem8.setText("Livros");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu7.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_11.png")); // NOI18N
        jMenu7.setText("Deletar     ");

        jMenuItem14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem14.setText("Cliente");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_3.png")); // NOI18N
        jMenuItem15.setText("Funcionário");
        jMenu7.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_4.png")); // NOI18N
        jMenuItem16.setText("Fornecedor");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_2.png")); // NOI18N
        jMenuItem17.setText("Livro");
        jMenu7.add(jMenuItem17);

        jMenuBar1.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_6.png")); // NOI18N
        jMenu5.setText("Sobre      ");
        jMenu5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/larissa/NetBeansProjects/Livraria/imagens/icones personalizados/freeiconmaker_5.png")); // NOI18N
        jMenuItem3.setText("Sobre o Programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(611, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    // editar Cliente
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Edit_Cliente editarCliente = new Edit_Cliente(this, true);
        editarCliente.setLocationRelativeTo(null);
        editarCliente.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Editar funcionario
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Edit_Funcionario editarFuncio = new Edit_Funcionario(this,true);
        editarFuncio.setLocationRelativeTo(null);
        editarFuncio.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    
    
    
  // QUANDO A PESSOA CLICAR EM FUNCIONÁRIO ELE IRA CADASTRAR   
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Cads_Funcionario cadastroFuncionario = new Cads_Funcionario (this, true);
        cadastroFuncionario.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   // QUANDO A PESSOA CLICAR EM CLIENTE ELE IRA CADASTRAR  
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Cads_Cliente cadastroCliente = new Cads_Cliente (this, true);
        cadastroCliente.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         Cads_Sobre sobre= new Cads_Sobre (this, true);
         sobre.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Cads_Livros cadastroLivros = new Cads_Livros (this, true);
        cadastroLivros.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        cadastroLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    
    // CONSULTAR CLIENTE
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        
        Consulta_Cliente consulta = new Consulta_Cliente(this,true);        
        consulta.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    
    // Consultar Funcionario
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
        Consulta_Funcionario consultafu = new Consulta_Funcionario(this, true);
        consultafu.setLocationRelativeTo(null);
        consultafu.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
      
        Cads_Fornecedor novoForn = new Cads_Fornecedor(this, true);
        novoForn.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        novoForn.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    
    
    
    
    
    // Deletar Cleinte
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
       Deletar_Cliente delCliente = new Deletar_Cliente(this, true);
        delCliente.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        delCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    
    // Consultar Fornecedor
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Consulta_Fornecedor consfor = new Consulta_Fornecedor(this, true);
        consfor .setLocationRelativeTo(null); // faz com que a tela apareça no meio
        consfor .setVisible(true);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    
    // Editar Fornecedor
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Edit_Fornecedor editFor = new Edit_Fornecedor(this, true);
        editFor .setLocationRelativeTo(null); // faz com que a tela apareça no meio
        editFor .setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Consulta_Livros consLivros = new Consulta_Livros (this, true);
        consLivros.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        consLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Deletar_Fornecedor detetarfor = new  Deletar_Fornecedor (this, true);
        detetarfor.setLocationRelativeTo(null); // faz com que a tela apareça no meio
        detetarfor.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    
    
    
    
    
    
    
    
    
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrimeiraPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiraPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiraPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrimeiraPagina pag = new PrimeiraPagina();
                pag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pag.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
