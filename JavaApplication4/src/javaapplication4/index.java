
package javaapplication4;

public class index extends javax.swing.JFrame {

   double Number1;
   double Number2;
   double Result;
   String op;
    public index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtDigitMul = new javax.swing.JButton();
        jbtDigit3 = new javax.swing.JButton();
        jbtDigit2 = new javax.swing.JButton();
        jbtDigit1 = new javax.swing.JButton();
        jbtPlus = new javax.swing.JButton();
        jbtDigit9 = new javax.swing.JButton();
        jbtDigit8 = new javax.swing.JButton();
        jbtDigit7 = new javax.swing.JButton();
        jbtDigitMin = new javax.swing.JButton();
        jbtDigit6 = new javax.swing.JButton();
        jbtDigit5 = new javax.swing.JButton();
        jbtDigit4 = new javax.swing.JButton();
        jbtDigitDiv = new javax.swing.JButton();
        jbtDigitEqul = new javax.swing.JButton();
        jbtDigitDeci = new javax.swing.JButton();
        jbtDigit0 = new javax.swing.JButton();
        jbtPM = new javax.swing.JButton();
        jbtC = new javax.swing.JButton();
        jbtCE = new javax.swing.JButton();
        jbtBS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 380, 70));

        jbtDigitMul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigitMul.setText("*");
        jbtDigitMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigitMulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigitMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 80, 80));

        jbtDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit3.setText("3");
        jbtDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 80, 80));

        jbtDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit2.setText("2");
        jbtDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 80, 80));

        jbtDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit1.setText("1");
        jbtDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 80));

        jbtPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtPlus.setText("+");
        jbtPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, 80));

        jbtDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit9.setText("9");
        jbtDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, 80));

        jbtDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit8.setText("8");
        jbtDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 80, 80));

        jbtDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit7.setText("7");
        jbtDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 80));

        jbtDigitMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigitMin.setText("-");
        jbtDigitMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigitMinActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigitMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, 80));

        jbtDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit6.setText("6");
        jbtDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 80, 80));

        jbtDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit5.setText("5");
        jbtDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 80, 80));

        jbtDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit4.setText("4");
        jbtDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 80));

        jbtDigitDiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigitDiv.setText("/");
        jbtDigitDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigitDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigitDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 80));

        jbtDigitEqul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigitEqul.setText("=");
        jbtDigitEqul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigitEqulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigitEqul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 80, 80));

        jbtDigitDeci.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigitDeci.setText(".");
        jbtDigitDeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigitDeciActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigitDeci, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 80, 80));

        jbtDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtDigit0.setText("0");
        jbtDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 80));

        jbtPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtPM.setText("+/-");
        jbtPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 80, 80));

        jbtC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtC.setText("C");
        jbtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 80, 80));

        jbtCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtCE.setText("CE");
        jbtCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, 80));

        jbtBS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtBS.setText("<-");
        jbtBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtDigit7ActionPerformed

    private void jbtDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit8ActionPerformed
        // TODO add your handling code here:
          EnterNumbers("8");
    }//GEN-LAST:event_jbtDigit8ActionPerformed

    private void jbtDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit9ActionPerformed
        // TODO add your handling code here:
          EnterNumbers("9");
    }//GEN-LAST:event_jbtDigit9ActionPerformed

    private void jbtDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit4ActionPerformed
        // TODO add your handling code here:
          EnterNumbers("4");
    }//GEN-LAST:event_jbtDigit4ActionPerformed

    private void jbtDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit5ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("5");
    }//GEN-LAST:event_jbtDigit5ActionPerformed

    private void jbtDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit6ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("6");
    }//GEN-LAST:event_jbtDigit6ActionPerformed

    private void jbtDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit1ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("1");
    }//GEN-LAST:event_jbtDigit1ActionPerformed

    private void jbtDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit2ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("2");
    }//GEN-LAST:event_jbtDigit2ActionPerformed

    private void jbtDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit3ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("3");
    }//GEN-LAST:event_jbtDigit3ActionPerformed

    private void jbtDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigit0ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("0");
    }//GEN-LAST:event_jbtDigit0ActionPerformed

    private void jbtDigitDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigitDivActionPerformed
        // TODO add your handling code here:
        Number1=Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="/";
    }//GEN-LAST:event_jbtDigitDivActionPerformed

    private void jbtDigitMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigitMulActionPerformed
        // TODO add your handling code here:
          Number1=Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="*";
        
    }//GEN-LAST:event_jbtDigitMulActionPerformed

    private void jbtDigitMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigitMinActionPerformed
        // TODO add your handling code here:
          Number1=Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="-";
    }//GEN-LAST:event_jbtDigitMinActionPerformed

    private void jbtPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPlusActionPerformed
        // TODO add your handling code here:
          Number1=Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op="+";
    }//GEN-LAST:event_jbtPlusActionPerformed

    private void jbtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCActionPerformed
        // TODO add your handling code here:
         
        jtxtResult.setText("");
  
    }//GEN-LAST:event_jbtCActionPerformed

    private void jbtCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCEActionPerformed
        // TODO add your handling code here:
         jtxtResult.setText("");
         String Fn,Sn;
         Fn =String.valueOf("Number1");
         Sn=String.valueOf("Number2");   
         Fn="";
         Sn="";
                 
    }//GEN-LAST:event_jbtCEActionPerformed

    private void jbtPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPMActionPerformed
        // TODO add your handling code here:
        double nums;
       nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
       nums=nums*(-1);
       jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtPMActionPerformed

    private void jbtBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBSActionPerformed
        // TODO add your handling code here:
        String backsp=null;
        if(jtxtResult.getText().length()>0)
        {
            StringBuilder sb= new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() - 1);
            backsp=sb.toString();
            jtxtResult.setText(backsp);
        }
    }//GEN-LAST:event_jbtBSActionPerformed

    private void jbtDigitDeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigitDeciActionPerformed
        // TODO add your handling code here:
        if(!jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText()+jbtDigitDeci.getText());
        }
    }//GEN-LAST:event_jbtDigitDeciActionPerformed

    private void jbtDigitEqulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDigitEqulActionPerformed
        // TODO add your handling code here:
        Number2=Double.parseDouble(jtxtResult.getText());
        if(op=="+"){
             Result=Number1+Number2;
             jtxtResult.setText(String.valueOf(Result));
        }
        else if(op=="-"){
             Result=Number1-Number2;
             jtxtResult.setText(String.valueOf(Result));
        } 
        else if(op=="*"){
             Result=Number1*Number2;
             jtxtResult.setText(String.valueOf(Result));
        }
        
        else if(op=="/"){
             Result=Number1/Number2;
             jtxtResult.setText(String.valueOf(Result));
        }
           
        
    }//GEN-LAST:event_jbtDigitEqulActionPerformed
    private void EnterNumbers(String q)
    {
        String Nums=jtxtResult.getText()+q;
        jtxtResult.setText(Nums);
    }
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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtBS;
    private javax.swing.JButton jbtC;
    private javax.swing.JButton jbtCE;
    private javax.swing.JButton jbtDigit0;
    private javax.swing.JButton jbtDigit1;
    private javax.swing.JButton jbtDigit2;
    private javax.swing.JButton jbtDigit3;
    private javax.swing.JButton jbtDigit4;
    private javax.swing.JButton jbtDigit5;
    private javax.swing.JButton jbtDigit6;
    private javax.swing.JButton jbtDigit7;
    private javax.swing.JButton jbtDigit8;
    private javax.swing.JButton jbtDigit9;
    private javax.swing.JButton jbtDigitDeci;
    private javax.swing.JButton jbtDigitDiv;
    private javax.swing.JButton jbtDigitEqul;
    private javax.swing.JButton jbtDigitMin;
    private javax.swing.JButton jbtDigitMul;
    private javax.swing.JButton jbtPM;
    private javax.swing.JButton jbtPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
