/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package look;

import java.awt.Point;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author Dell
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    double num1;
    double num2;
    char operator;
    String first_display;
    
    
    
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        seven_btn = new javax.swing.JButton();
        answer_txt = new javax.swing.JTextField();
        clear_btn = new javax.swing.JButton();
        eight_btn = new javax.swing.JButton();
        nine_btn = new javax.swing.JButton();
        four_btn = new javax.swing.JButton();
        five_btn = new javax.swing.JButton();
        six_btn = new javax.swing.JButton();
        three_btn = new javax.swing.JButton();
        two_btn = new javax.swing.JButton();
        one_btn = new javax.swing.JButton();
        multiply_btn = new javax.swing.JButton();
        divide_btn = new javax.swing.JButton();
        subtract_btn = new javax.swing.JButton();
        equals_btn = new javax.swing.JButton();
        zero_btn = new javax.swing.JButton();
        dzero_btn = new javax.swing.JButton();
        point_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        stored_op = new javax.swing.JLabel();
        storedNumber = new javax.swing.JLabel();
        storedNumber2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        seven_btn.setBackground(new java.awt.Color(0, 0, 255));
        seven_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        seven_btn.setForeground(new java.awt.Color(255, 255, 255));
        seven_btn.setText("7");
        seven_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_btnActionPerformed(evt);
            }
        });

        answer_txt.setEditable(false);
        answer_txt.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        answer_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        clear_btn.setBackground(new java.awt.Color(153, 0, 0));
        clear_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("C");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        eight_btn.setBackground(new java.awt.Color(0, 0, 255));
        eight_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        eight_btn.setForeground(new java.awt.Color(255, 255, 255));
        eight_btn.setText("8");
        eight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_btnActionPerformed(evt);
            }
        });

        nine_btn.setBackground(new java.awt.Color(0, 0, 255));
        nine_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nine_btn.setForeground(new java.awt.Color(255, 255, 255));
        nine_btn.setText("9");
        nine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_btnActionPerformed(evt);
            }
        });

        four_btn.setBackground(new java.awt.Color(0, 0, 255));
        four_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        four_btn.setForeground(new java.awt.Color(255, 255, 255));
        four_btn.setText("4");
        four_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_btnActionPerformed(evt);
            }
        });

        five_btn.setBackground(new java.awt.Color(0, 0, 255));
        five_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        five_btn.setForeground(new java.awt.Color(255, 255, 255));
        five_btn.setText("5");
        five_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_btnActionPerformed(evt);
            }
        });

        six_btn.setBackground(new java.awt.Color(0, 0, 255));
        six_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        six_btn.setForeground(new java.awt.Color(255, 255, 255));
        six_btn.setText("6");
        six_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_btnActionPerformed(evt);
            }
        });

        three_btn.setBackground(new java.awt.Color(0, 0, 255));
        three_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        three_btn.setForeground(new java.awt.Color(255, 255, 255));
        three_btn.setText("3");
        three_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_btnActionPerformed(evt);
            }
        });

        two_btn.setBackground(new java.awt.Color(0, 0, 255));
        two_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        two_btn.setForeground(new java.awt.Color(255, 255, 255));
        two_btn.setText("2");
        two_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_btnActionPerformed(evt);
            }
        });

        one_btn.setBackground(new java.awt.Color(0, 0, 255));
        one_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        one_btn.setForeground(new java.awt.Color(255, 255, 255));
        one_btn.setText("1");
        one_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_btnActionPerformed(evt);
            }
        });

        multiply_btn.setBackground(new java.awt.Color(0, 153, 153));
        multiply_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        multiply_btn.setForeground(new java.awt.Color(255, 255, 255));
        multiply_btn.setText("*");
        multiply_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiply_btnActionPerformed(evt);
            }
        });

        divide_btn.setBackground(new java.awt.Color(0, 153, 153));
        divide_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        divide_btn.setForeground(new java.awt.Color(255, 255, 255));
        divide_btn.setText("/");
        divide_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divide_btnActionPerformed(evt);
            }
        });

        subtract_btn.setBackground(new java.awt.Color(0, 153, 153));
        subtract_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        subtract_btn.setForeground(new java.awt.Color(255, 255, 255));
        subtract_btn.setText("-");
        subtract_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtract_btnActionPerformed(evt);
            }
        });

        equals_btn.setBackground(new java.awt.Color(0, 51, 51));
        equals_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        equals_btn.setForeground(new java.awt.Color(255, 255, 255));
        equals_btn.setText("=");
        equals_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equals_btnActionPerformed(evt);
            }
        });

        zero_btn.setBackground(new java.awt.Color(0, 0, 255));
        zero_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        zero_btn.setForeground(new java.awt.Color(255, 255, 255));
        zero_btn.setText("0");
        zero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_btnActionPerformed(evt);
            }
        });

        dzero_btn.setBackground(new java.awt.Color(0, 0, 255));
        dzero_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        dzero_btn.setForeground(new java.awt.Color(255, 255, 255));
        dzero_btn.setText("00");
        dzero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dzero_btnActionPerformed(evt);
            }
        });

        point_btn.setBackground(new java.awt.Color(0, 0, 255));
        point_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        point_btn.setForeground(new java.awt.Color(255, 255, 255));
        point_btn.setText(".");
        point_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point_btnActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(0, 153, 153));
        add_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("+");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        stored_op.setBackground(new java.awt.Color(0, 204, 204));
        stored_op.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        stored_op.setForeground(new java.awt.Color(255, 255, 255));

        storedNumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        storedNumber.setForeground(new java.awt.Color(255, 255, 255));

        storedNumber2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        storedNumber2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dzero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(point_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(equals_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtract_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(storedNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stored_op)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storedNumber2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(divide_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storedNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(storedNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(stored_op, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(point_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dzero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtract_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void one_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_btnActionPerformed
        first_display = answer_txt.getText();
        answer_txt.setText(first_display+"1");
    }//GEN-LAST:event_one_btnActionPerformed

    private void equals_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equals_btnActionPerformed
        calculation();
    }//GEN-LAST:event_equals_btnActionPerformed

    private void seven_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"7");
    }//GEN-LAST:event_seven_btnActionPerformed

    private void eight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"8");
    }//GEN-LAST:event_eight_btnActionPerformed

    private void nine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"9");
    }//GEN-LAST:event_nine_btnActionPerformed

    private void four_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"4");
    }//GEN-LAST:event_four_btnActionPerformed

    private void five_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"5");
    }//GEN-LAST:event_five_btnActionPerformed

    private void six_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"6");
    }//GEN-LAST:event_six_btnActionPerformed

    private void two_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"2");
    }//GEN-LAST:event_two_btnActionPerformed

    private void three_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_btnActionPerformed
        first_display = answer_txt.getText();
        answer_txt.setText(first_display+"3");
    }//GEN-LAST:event_three_btnActionPerformed

    private void zero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_btnActionPerformed
       first_display = answer_txt.getText();
        answer_txt.setText(first_display+"0");
    }//GEN-LAST:event_zero_btnActionPerformed

    private void dzero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dzero_btnActionPerformed
      first_display = answer_txt.getText();
        answer_txt.setText(first_display+"00");
    }//GEN-LAST:event_dzero_btnActionPerformed

    private void point_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point_btnActionPerformed
        first_display = answer_txt.getText();
        answer_txt.setText(first_display+".");
    }//GEN-LAST:event_point_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
       answer_txt.setText("");
       storedNumber.setText("");
       storedNumber2.setText("");
       stored_op.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void divide_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divide_btnActionPerformed
        if(Double.parseDouble(answer_txt.getText())<=0){
            
        }else{
            storedNumber.setText(answer_txt.getText());
            stored_op.setText("/");
            answer_txt.setText("");
        }
        
    }//GEN-LAST:event_divide_btnActionPerformed

    private void multiply_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiply_btnActionPerformed
        storedNumber.setText(answer_txt.getText());
        stored_op.setText("*");
        answer_txt.setText("");
    }//GEN-LAST:event_multiply_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        storedNumber.setText(answer_txt.getText());
        stored_op.setText("+");
        answer_txt.setText("");
    }//GEN-LAST:event_add_btnActionPerformed

    private void subtract_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtract_btnActionPerformed
        storedNumber.setText(answer_txt.getText());
        stored_op.setText("-");
        answer_txt.setText("");
    }//GEN-LAST:event_subtract_btnActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField answer_txt;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton divide_btn;
    private javax.swing.JButton dzero_btn;
    private javax.swing.JButton eight_btn;
    private javax.swing.JButton equals_btn;
    private javax.swing.JButton five_btn;
    private javax.swing.JButton four_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiply_btn;
    private javax.swing.JButton nine_btn;
    private javax.swing.JButton one_btn;
    private javax.swing.JButton point_btn;
    private javax.swing.JButton seven_btn;
    private javax.swing.JButton six_btn;
    private javax.swing.JLabel storedNumber;
    private javax.swing.JLabel storedNumber2;
    private javax.swing.JLabel stored_op;
    private javax.swing.JButton subtract_btn;
    private javax.swing.JButton three_btn;
    private javax.swing.JButton two_btn;
    private javax.swing.JButton zero_btn;
    // End of variables declaration//GEN-END:variables

    private void calculation() {
       num1 = Double.parseDouble(storedNumber.getText());
       num2 = Double.parseDouble(answer_txt.getText());
       //converting String type to char type
       String s_char = stored_op.getText();
       operator = s_char.charAt(0);// returns a char type value
       double result;
      int int_results;
       // Switch statement for the calculation operations!
       storedNumber2.setText(answer_txt.getText());
     
       switch(operator){
           case '/':    
           result = num1 / num2;          
           answer_txt.setText(String.valueOf(result));  
           break;
           case '*':
               result = num1 * num2;
               answer_txt.setText(String.valueOf(result));
               break;
               case '+':
                 result = num1 + num2;
                 answer_txt.setText(String.valueOf(result));
           break;
           case '-':
               result = num1 - num2;
               answer_txt.setText(String.valueOf(result));
               break;        
              }       
    }
}
