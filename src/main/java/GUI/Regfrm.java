/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author GAMER
 */
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JComboBox;

public class Regfrm extends javax.swing.JFrame {

    
    public Regfrm() {
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

        btnG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCPass = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        btnReg = new javax.swing.JButton();
        lblAlert = new javax.swing.JLabel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        rbtnNon = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cboxC = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx1 = new javax.swing.JCheckBox();
        cbx2 = new javax.swing.JCheckBox();
        cbx3 = new javax.swing.JCheckBox();
        cbx4 = new javax.swing.JCheckBox();
        cbx5 = new javax.swing.JCheckBox();
        cbx6 = new javax.swing.JCheckBox();
        cboxY = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEST STORE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("It's quick and easy");

        txtFname.setText("First name");
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtLname.setText("Last name");
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
        });

        txtEmail.setText("Email");
        txtEmail.setPreferredSize(new java.awt.Dimension(112, 22));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCPass.setText("Confirm password");
        txtCPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPassFocusGained(evt);
            }
        });
        txtCPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPassActionPerformed(evt);
            }
        });

        txtPass.setText("Password");
        txtPass.setPreferredSize(new java.awt.Dimension(112, 22));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        btnReg.setBackground(new java.awt.Color(0, 0, 0));
        btnReg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("REGISTER");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        lblAlert.setForeground(new java.awt.Color(255, 0, 0));

        btnG.add(rbtnM);
        rbtnM.setText("Male");
        rbtnM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbtnMFocusGained(evt);
            }
        });

        btnG.add(rbtnF);
        rbtnF.setText("Female");
        rbtnF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbtnFFocusGained(evt);
            }
        });

        btnG.add(rbtnNon);
        rbtnNon.setText("Non-binary");
        rbtnNon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbtnNonFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gender:");

        cboxC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COURSE", "BSIT", "BSBA", "BSOA", "BSCRIM", "BSED" }));
        cboxC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboxCFocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Course:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Hobbies:");

        cbx1.setText("Watching anime");
        cbx1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx1FocusGained(evt);
            }
        });

        cbx2.setText("Playing online games");
        cbx2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx2FocusGained(evt);
            }
        });
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        cbx3.setText("Eating");
        cbx3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx3FocusGained(evt);
            }
        });

        cbx4.setText("Swimming");
        cbx4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx4FocusGained(evt);
            }
        });

        cbx5.setText("Playing Outside");
        cbx5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx5FocusGained(evt);
            }
        });
        cbx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx5ActionPerformed(evt);
            }
        });

        cbx6.setText("Sleeping");
        cbx6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx6FocusGained(evt);
            }
        });

        cboxY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YEAR", "1st year", "2nd year", "3rd year", "4th year" }));
        cboxY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboxYFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnM, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(rbtnF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnNon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboxC, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxY, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnReg)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx1)
                            .addComponent(cbx4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx2)
                            .addComponent(cbx5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cbx3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx6)))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnF, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx1)
                    .addComponent(cbx2)
                    .addComponent(cbx3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx4)
                    .addComponent(cbx5)
                    .addComponent(cbx6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPassActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        // TODO add your handling code here:
        txtFname.setBackground(Color.white);
        if(txtFname.getText().equalsIgnoreCase("First name")){
            txtFname.setText("");
        }
        
    }//GEN-LAST:event_txtFnameFocusGained

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        if(txtFname.getText().equalsIgnoreCase("")||txtFname.getText().equalsIgnoreCase("First name")&&
                txtLname.getText().equalsIgnoreCase("")||txtLname.getText().equalsIgnoreCase("Last name")&&
                txtPass.getText().equalsIgnoreCase("")||txtPass.getText().equalsIgnoreCase("Password")&&
                txtCPass.getText().equalsIgnoreCase("")||txtCPass.getText().equalsIgnoreCase("Confrim Password")&&
                txtEmail.getText().equalsIgnoreCase("")||txtEmail.getText().equalsIgnoreCase("Email")){
            txtFname.setBackground(Color.red);
            txtLname.setBackground(Color.red); 
            txtPass.setBackground(Color.red);
            txtCPass.setBackground(Color.red);
            txtEmail.setBackground(Color.red); 
            
        }else if(txtFname.getText().equalsIgnoreCase("")||txtFname.getText().equalsIgnoreCase("First name")){
            txtFname.setBackground(Color.red);
        }else if(txtLname.getText().equalsIgnoreCase("")||txtLname.getText().equalsIgnoreCase("Last name")){
            txtLname.setBackground(Color.red);           
        }else if(txtPass.getText().equalsIgnoreCase("")||txtPass.getText().equalsIgnoreCase("Password")){
            txtPass.setBackground(Color.red);
        }else if (txtCPass.getText().equalsIgnoreCase("") || txtCPass.getText().equalsIgnoreCase("Confirm password") || !txtCPass.getText().equals(txtPass.getText())){
            txtCPass.setBackground(Color.red);
            lblAlert.setText("Confirm password not match");
        }else if(txtEmail.getText().equalsIgnoreCase("")||txtEmail.getText().equalsIgnoreCase("Email")||!txtEmail.getText().toLowerCase().contains("@gmail.com")){
            txtEmail.setBackground(Color.red);  
            lblAlert.setText("Incorrect email");
        }else if(cboxC.getSelectedItem() == null||cboxC.getSelectedItem()=="COURSE"){
            lblAlert.setText("Please select your course");
        }else if(cboxY.getSelectedItem() == null||cboxY.getSelectedItem() == "YEAR"){
            lblAlert.setText("Please select what year");
        }else if(!rbtnM.isSelected()&&!rbtnF.isSelected()&&!rbtnNon.isSelected()){
            lblAlert.setText("Please select your gender");
        }else if(!cbx1.isSelected()&&!cbx2.isSelected()&&!cbx3.isSelected()&&!cbx4.isSelected()&&!cbx5.isSelected()&&!cbx6.isSelected()){
            lblAlert.setText("Please select atlest one hobby");
        }else{
            String Fname = txtFname.getText()+" "+txtLname.getText();
            String Email = txtEmail.getText();
            String Pass = txtPass.getText();
            String CPass = txtCPass.getText();
            String Course = (String) cboxC.getSelectedItem()+"-"+(String) cboxY.getSelectedItem();
            String Gender;
                if (rbtnM.isSelected()) {
                    Gender = rbtnM.getText();
                } else if (rbtnF.isSelected()) {
                    Gender = rbtnF.getText();
                } else {
                    Gender = rbtnNon.getText();
                }
            String Hobby = "";
                if(cbx1.isSelected()){
                     Hobby += cbx1.getText() + ",";
                }
                if(cbx2.isSelected()){
                     Hobby += cbx2.getText() + ",";
                 }
                if(cbx3.isSelected()){
                    Hobby += cbx3.getText() + ",";
                }
                if(cbx4.isSelected()){
                    Hobby += cbx4.getText() + ",";
                }
                if(cbx5.isSelected()){
                    Hobby += cbx5.getText() + ",";
                }
                if(cbx6.isSelected()){
                    Hobby += cbx6.getText() + ",";
                }
                
            
        
        String filePath = "C:\\Users\\WS\\Music\\REG-main\\GUILOGIN\\DATA\\" + txtEmail.getText() + ".txt";

        if (Files.exists(Paths.get(filePath))) {
            lblAlert.setText("Email already exist");
            
        }else{
            
        
            
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\WS\\Music\\REG-main\\GUILOGIN\\DATA\\"+txtEmail.getText()+".txt"));
                
                writer.write(Fname);
                writer.newLine();
                writer.write(Gender);
                writer.newLine();
                writer.write(Course);
                writer.newLine();
                writer.write(Hobby);
                writer.newLine();
                writer.write(Email);
                writer.newLine();
                writer.write(Pass);
                writer.newLine();
                writer.write(CPass);
                writer.newLine();
                
                writer.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            DoneRegister x  = new DoneRegister();
            x.show();
            this.hide();
            
        } 
      }
            
    }//GEN-LAST:event_btnRegActionPerformed

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        // TODO add your handling code here:
        txtLname.setBackground(Color.white);
        if(txtLname.getText().equalsIgnoreCase("Last name")){
        txtLname.setText("");
        }
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        txtEmail.setBackground(Color.white);
        lblAlert.setText("");
        if(txtEmail.getText().equalsIgnoreCase("Email")){
        txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:
        txtPass.setBackground(Color.white);
        lblAlert.setText("");
        if(txtPass.getText().equalsIgnoreCase("Password")){
        txtPass.setText("");
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtCPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPassFocusGained
        // TODO add your handling code here:
        txtCPass.setBackground(Color.white);
        lblAlert.setText("");
        if(txtCPass.getText().equalsIgnoreCase("Confirm password")){
        txtCPass.setText("");
        }
    }//GEN-LAST:event_txtCPassFocusGained

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx5ActionPerformed

    private void rbtnMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbtnMFocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_rbtnMFocusGained

    private void cboxCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboxCFocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cboxCFocusGained

    private void cboxYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboxYFocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cboxYFocusGained

    private void rbtnFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbtnFFocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_rbtnFFocusGained

    private void rbtnNonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbtnNonFocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_rbtnNonFocusGained

    private void cbx1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx1FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx1FocusGained

    private void cbx2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx2FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx2FocusGained

    private void cbx3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx3FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx3FocusGained

    private void cbx4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx4FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx4FocusGained

    private void cbx5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx5FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx5FocusGained

    private void cbx6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx6FocusGained
        // TODO add your handling code here:
        lblAlert.setText("");
    }//GEN-LAST:event_cbx6FocusGained

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
            java.util.logging.Logger.getLogger(Regfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cboxC;
    private javax.swing.JComboBox<String> cboxY;
    private javax.swing.JCheckBox cbx1;
    private javax.swing.JCheckBox cbx2;
    private javax.swing.JCheckBox cbx3;
    private javax.swing.JCheckBox cbx4;
    private javax.swing.JCheckBox cbx5;
    private javax.swing.JCheckBox cbx6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JRadioButton rbtnNon;
    private javax.swing.JTextField txtCPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
