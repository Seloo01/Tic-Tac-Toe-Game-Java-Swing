
import java.awt.Color;
import java.util.Random;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setBounds(450, 50, getWidth(), getHeight());
        setTitle("Tic-Tac-Toc Game");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        lblPuan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        lblPuan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuan.setText("Puan:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblPuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    char player = 'X';
    Random rand = new Random();
    int puanCounter = 0;
   
    public void changePlayer(){
       if(player=='X'){
           player = 'O';     
       }
       else if(player=='O'){
           player = 'X';     
       }   
    }
    boolean btn1Null = false;
    boolean btn2Null = false;
    boolean btn3Null = false;
    boolean btn4Null = false;
    boolean btn5Null = false;
    boolean btn6Null = false;
    boolean btn7Null = false;
    boolean btn8Null = false;
    boolean btn9Null = false;
    
    
    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
             
        if(btn1Null==false){
            btn1.setText(String.valueOf(player));
            changePlayer();
            btn1Null = true;

        if(btn1.getText().equals("X")){
            if(btn2.getText().equals("O")){
                if(btn3.getText().equals("X")){
                    btn1.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);
                    btn3.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn1.getText().equals("X")){
            if(btn4.getText().equals("O")){
                if(btn7.getText().equals("X")){
                    btn1.setBackground(Color.RED);
                    btn4.setBackground(Color.RED);
                    btn7.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
             }
          }
       }
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
         if(btn2Null==false){
             btn2.setText(String.valueOf(player));
            changePlayer();
            btn2Null = true;
         }        
         if(btn2.getText().equals("X")){
            if(btn5.getText().equals("O")){
                if(btn8.getText().equals("X")){
                    btn2.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn2.getText().equals("O")){
            if(btn1.getText().equals("X")){
                if(btn3.getText().equals("X")){
                    btn1.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);
                    btn3.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        if(btn3Null==false){
            btn3.setText(String.valueOf(player));
            changePlayer();
            btn3Null = true;
        }
        
        if(btn3.getText().equals("X")){
            if(btn6.getText().equals("O")){
                if(btn9.getText().equals("X")){
                    btn3.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn3.getText().equals("X")){
            if(btn2.getText().equals("O")){
                if(btn1.getText().equals("X")){
                    btn3.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);
                    btn1.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        if(btn4Null==false){
             btn4.setText(String.valueOf(player));
            changePlayer();
            btn4Null = true;
         }        
         if(btn4.getText().equals("X")){
            if(btn5.getText().equals("O")){
                if(btn6.getText().equals("X")){
                    btn4.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn4.getText().equals("O")){
            if(btn1.getText().equals("X")){
                if(btn7.getText().equals("X")){
                    btn4.setBackground(Color.RED);
                    btn1.setBackground(Color.RED);
                    btn7.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        if(btn5Null==false){
             btn5.setText(String.valueOf(player));
            changePlayer();
            btn5Null = true;
         }        
         if(btn5.getText().equals("O")){
            if(btn2.getText().equals("X")){
                if(btn8.getText().equals("X")){
                    btn5.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn4.getText().equals("X")){
            if(btn5.getText().equals("O")){
                if(btn6.getText().equals("X")){
                    btn4.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        if(btn6Null==false){
             btn6.setText(String.valueOf(player));
            changePlayer();
            btn6Null = true;
         }        
         if(btn6.getText().equals("X")){
            if(btn5.getText().equals("O")){
                if(btn4.getText().equals("X")){
                    btn6.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn4.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn3.getText().equals("X")){
            if(btn6.getText().equals("O")){
                if(btn9.getText().equals("X")){
                    btn3.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
       if(btn7Null==false){
             btn7.setText(String.valueOf(player));
            changePlayer();
            btn7Null = true;
         }        
         if(btn7.getText().equals("X")){
            if(btn4.getText().equals("O")){
                if(btn1.getText().equals("X")){
                    btn7.setBackground(Color.RED);
                    btn4.setBackground(Color.RED);
                    btn1.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn7.getText().equals("X")){
            if(btn8.getText().equals("O")){
                if(btn9.getText().equals("X")){
                    btn7.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        if(btn8Null==false){
             btn8.setText(String.valueOf(player));
            changePlayer();
            btn8Null = true;
         }        
         if(btn8.getText().equals("X")){
            if(btn5.getText().equals("O")){
                if(btn2.getText().equals("X")){
                    btn8.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn8.getText().equals("O")){
            if(btn7.getText().equals("X")){
                if(btn9.getText().equals("X")){
                    btn8.setBackground(Color.RED);
                    btn7.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        if(btn9Null==false){
            btn9.setText(String.valueOf(player));
            changePlayer();
            btn9Null = true;
         }        
         if(btn9.getText().equals("X")){
            if(btn8.getText().equals("O")){
                if(btn7.getText().equals("X")){
                    btn9.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    btn7.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        }
        if(btn9.getText().equals("X")){
            if(btn6.getText().equals("O")){
                if(btn3.getText().equals("X")){
                    btn9.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    btn3.setBackground(Color.RED);
                    puanCounter++;
                    lblPuan.setText("Puan: " + String.valueOf(puanCounter));
                }
            }
        } 
    }//GEN-LAST:event_btn9MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel lblPuan;
    // End of variables declaration//GEN-END:variables
}
