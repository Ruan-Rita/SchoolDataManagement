/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Telas;

import java.awt.Frame;

/**
 *
 * @author Ruan Fagundes
 */
public class Equipamento extends javax.swing.JFrame {

    /**
     * Creates new form Equipamento
     */
    public Equipamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Desevolvedores : Pedro Neto e Ruan Rita  ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, 40));

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("© All rights reserved 2019");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 860, 200, 40));

        jLabel12.setBackground(new java.awt.Color(51, 204, 0));
        jLabel12.setForeground(new java.awt.Color(102, 255, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/preto rodape.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 1610, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Patrimônio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, -1));

        jButton13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jButton13.setText("Voltar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 110, 42));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel3.setText("Editar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 206, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setText("Equipamentos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 206, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setText("Sendo Utilizado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Estoque");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 206, 30));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 206, 30));

        jButton12.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jButton12.setText("Remover");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 100, 44));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 206, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Equipamento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, -1, -1));

        jButton11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jButton11.setText("Adicionar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 100, 44));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Equipamento", "Patrimonio", "Quantidade", "Em Estoque", "Sendo Utilizado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(19);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 588, 389));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton9.setText("Home");
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));
        jButton9.setBackground(new java.awt.Color(0, 0, 0,0));

        jButton1.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton1.setText("Cliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton2.setText("Produto");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 130, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton3.setText("Equipamento");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 210, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton4.setText("Venda");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 120, 30));

        jButton5.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton5.setText("Turma");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, 30));

        jButton6.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton6.setText("Relatório");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 140, 30));

        jButton10.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/perfil-Preto.png"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 11, 70, 70));

        jButton7.setBackground(new java.awt.Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jButton7.setText("-");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 11, -1, 70));

        jButton8.setBackground(new java.awt.Color(0,0,0,0));
        jButton8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton8.setText("X");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 11, 50, 70));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 153));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1610, 10));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 255, 255));
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jButton9.setForeground(new java.awt.Color(246, 7, 7));
        jButton9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        jButton9.setForeground(new java.awt.Color(0, 0, 7));
        jButton9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(new java.awt.Color(246, 7, 7));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(new java.awt.Color(0, 0, 7));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClienteMenu CM = new ClienteMenu();
        CM.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setForeground(new java.awt.Color(246, 7, 7));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setForeground(new java.awt.Color(0, 0, 7));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProdutoMenu PM = new ProdutoMenu();
        PM.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setForeground(new java.awt.Color(246, 7, 7));
        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setForeground(new java.awt.Color(0, 0, 7));
        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Equipamento EP = new Equipamento();
        EP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setForeground(new java.awt.Color(246, 7, 7));
        jButton4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setForeground(new java.awt.Color(0, 0, 7));
        jButton4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        RealizarVenda rv = new RealizarVenda();
        rv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setForeground(new java.awt.Color(246, 7, 7));
        jButton5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setForeground(new java.awt.Color(0, 0, 7));
        jButton5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Turma t = new Turma();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        jButton6.setForeground(new java.awt.Color(246, 7, 7));
        jButton6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        jButton6.setForeground(new java.awt.Color(0, 0, 7));
        jButton6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Relatorio R = new Relatorio();
        R.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/perfil-hover.png")));
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/perfil-Preto.png")));
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setForeground(new java.awt.Color(246, 7, 7));
        jButton7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 46));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        jButton7.setForeground(new java.awt.Color(0, 0, 7));
        jButton7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setState ( Frame.ICONIFIED );
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setForeground(new java.awt.Color(246, 7, 7));
        jButton8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        jButton8.setForeground(new java.awt.Color(0, 0, 7));
        jButton8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14));
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
