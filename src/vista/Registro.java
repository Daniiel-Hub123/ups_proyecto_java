/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JTextField;
import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.passwordField.PasswordField;
import org.edisoncor.gui.textField.TextField;

/**
 *
 * @author danie
 */
public class Registro extends javax.swing.JDialog {

    private Login login;
    
    /**
     * Creates new form Registro
     */
    public Registro(Login login) {
        initComponents();
        this.login = login;
    }

    public JButton getBtnSalirR() {
        return btnSalirR;
    }

    public void setBtnSalirR(JButton btnSalirR) {
        this.btnSalirR = btnSalirR;
    }

    public ButtonAqua getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(ButtonAqua btnRegister) {
        this.btnRegister = btnRegister;
    }

    public TextField getTxtCed() {
        return txtCed;
    }

    public void setTxtCed(TextField txtCed) {
        this.txtCed = txtCed;
    }

    public PasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(PasswordField txtPass) {
        this.txtPass = txtPass;
    }

    public TextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(TextField txtUser) {
        this.txtUser = txtUser;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        txtCed = new org.edisoncor.gui.textField.TextField();
        txtUser = new org.edisoncor.gui.textField.TextField();
        txtPass = new org.edisoncor.gui.passwordField.PasswordField();
        btnRegister = new org.edisoncor.gui.button.ButtonAqua();
        btnSalirR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        panelRectTranslucido1.setColorPrimario(new java.awt.Color(204, 255, 204));
        panelRectTranslucido1.setColorSecundario(new java.awt.Color(0, 153, 255));

        title.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("REGISTRO DE USUARIO");

        title2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Cédula:");

        title3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Usuario:");

        title1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Contraseña:");

        btnRegister.setBackground(new java.awt.Color(0, 102, 255));
        btnRegister.setText("Registrarse");
        btnRegister.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        btnSalirR.setText("X");
        btnSalirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnSalirR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalirR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRActionPerformed
        
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirRActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAqua btnRegister;
    private javax.swing.JButton btnSalirR;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private org.edisoncor.gui.textField.TextField txtCed;
    private org.edisoncor.gui.passwordField.PasswordField txtPass;
    private org.edisoncor.gui.textField.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
