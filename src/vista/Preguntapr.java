/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author LENOVO
 */
public class Preguntapr extends javax.swing.JInternalFrame {

    /**
     * Creates new form Preguntapr
     */
    public Preguntapr() {
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

        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        txtDescripcion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnOp1 = new javax.swing.JButton();
        btnOp2 = new javax.swing.JButton();
        btnOp3 = new javax.swing.JButton();
        btnOp4 = new javax.swing.JButton();
        btnSiguiente = new org.edisoncor.gui.button.ButtonNice();
        imagenPregunta = new org.edisoncor.gui.panel.PanelImage();
        txtRegion = new org.edisoncor.gui.button.ButtonAero();
        barraProgreso = new org.edisoncor.gui.progressBar.ProgressBarRect();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelRectTranslucido1.setColorPrimario(new java.awt.Color(102, 102, 255));
        panelRectTranslucido1.setColorSecundario(new java.awt.Color(0, 51, 255));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        txtDescripcion.setText("1. ¿En donde esta ubicado la provincia de Santa Elena? ");

        jLabel2.setText("a.");

        jLabel3.setText("b.");

        jLabel4.setText("c.");

        jLabel5.setText("d.");

        btnOp1.setBackground(new java.awt.Color(102, 255, 255));
        btnOp1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnOp1.setText("Sur del Ecuador");

        btnOp2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnOp2.setText("Noreste del Ecuador");

        btnOp3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnOp3.setText("Oeste del Ecuador");

        btnOp4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnOp4.setText("Este del Ecuador");

        btnSiguiente.setBackground(new java.awt.Color(51, 255, 51));
        btnSiguiente.setText("SIGUIENTE ");
        btnSiguiente.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        imagenPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/santa.jpeg"))); // NOI18N

        javax.swing.GroupLayout imagenPreguntaLayout = new javax.swing.GroupLayout(imagenPregunta);
        imagenPregunta.setLayout(imagenPreguntaLayout);
        imagenPreguntaLayout.setHorizontalGroup(
            imagenPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        imagenPreguntaLayout.setVerticalGroup(
            imagenPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        txtRegion.setText("Sur del Ecuador");
        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOp2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(btnOp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagenPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                                .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGap(86, 86, 86))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDescripcion))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnOp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnOp3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnOp4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(panelRectTranslucido1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(imagenPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelRectTranslucido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.progressBar.ProgressBarRect barraProgreso;
    private javax.swing.JButton btnOp1;
    private javax.swing.JButton btnOp2;
    private javax.swing.JButton btnOp3;
    private javax.swing.JButton btnOp4;
    private org.edisoncor.gui.button.ButtonNice btnSiguiente;
    private org.edisoncor.gui.panel.PanelImage imagenPregunta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private javax.swing.JLabel txtDescripcion;
    private org.edisoncor.gui.button.ButtonAero txtRegion;
    // End of variables declaration//GEN-END:variables
}
