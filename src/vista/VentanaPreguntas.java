/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import org.edisoncor.gui.button.ButtonAqua;

/**
 *
 * @author danie
 */
public class VentanaPreguntas extends javax.swing.JInternalFrame {


    /**
     * Creates new form VentanaPreguntas
     */
    public VentanaPreguntas() {
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
        panelRectTranslucido2 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPreguntas = new javax.swing.JTable();
        titlequestions = new javax.swing.JLabel();
        btnEditarP = new org.edisoncor.gui.button.ButtonAqua();
        btnRegistrarP = new org.edisoncor.gui.button.ButtonAqua();
        btnBorrar = new org.edisoncor.gui.button.ButtonAqua();
        btnSalirR = new javax.swing.JButton();

        javax.swing.GroupLayout panelRectTranslucido1Layout = new javax.swing.GroupLayout(panelRectTranslucido1);
        panelRectTranslucido1.setLayout(panelRectTranslucido1Layout);
        panelRectTranslucido1Layout.setHorizontalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRectTranslucido1Layout.setVerticalGroup(
            panelRectTranslucido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelRectTranslucido2.setColorDeBorde(new java.awt.Color(255, 255, 255));
        panelRectTranslucido2.setColorPrimario(new java.awt.Color(255, 255, 0));
        panelRectTranslucido2.setColorSecundario(new java.awt.Color(0, 204, 102));

        tablaPreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pregunta", "Descripción", "Region", "Provincia", "Dificultad", "Respuesta", "Opcion 1", "Opcion 2", "Opcion 3", "Imagen"
            }
        ));
        jScrollPane1.setViewportView(tablaPreguntas);

        titlequestions.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        titlequestions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlequestions.setText("PREGUNTAS");

        btnEditarP.setBackground(new java.awt.Color(255, 255, 0));
        btnEditarP.setText("Editar");
        btnEditarP.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        btnRegistrarP.setBackground(new java.awt.Color(51, 255, 51));
        btnRegistrarP.setText("Registrar");
        btnRegistrarP.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        btnBorrar.setBackground(new java.awt.Color(204, 51, 0));
        btnBorrar.setText("Eliminar");
        btnBorrar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        btnSalirR.setText("X");
        btnSalirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucido2Layout = new javax.swing.GroupLayout(panelRectTranslucido2);
        panelRectTranslucido2.setLayout(panelRectTranslucido2Layout);
        panelRectTranslucido2Layout.setHorizontalGroup(
            panelRectTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnEditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(panelRectTranslucido2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(titlequestions, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelRectTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido2Layout.createSequentialGroup()
                        .addComponent(btnSalirR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelRectTranslucido2Layout.setVerticalGroup(
            panelRectTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucido2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalirR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(titlequestions, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelRectTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ButtonAqua getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(ButtonAqua btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public ButtonAqua getBtnEditarP() {
        return btnEditarP;
    }

    public void setBtnEditarP(ButtonAqua btnEditarP) {
        this.btnEditarP = btnEditarP;
    }

    public ButtonAqua getBtnRegistrarP() {
        return btnRegistrarP;
    }

    public void setBtnRegistrarP(ButtonAqua btnRegistrarP) {
        this.btnRegistrarP = btnRegistrarP;
    }

    public JButton getBtnSalirR() {
        return btnSalirR;
    }

    public void setBtnSalirR(JButton btnSalirR) {
        this.btnSalirR = btnSalirR;
    }

    public JTable getTablaPreguntas() {
        return tablaPreguntas;
    }

    public void setTablaPreguntas(JTable tablaPreguntas) {
        this.tablaPreguntas = tablaPreguntas;
    }

    public JLabel getTitlequestions() {
        return titlequestions;
    }

    public void setTitlequestions(JLabel titlequestions) {
        this.titlequestions = titlequestions;
    }

    
    private void btnSalirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAqua btnBorrar;
    private org.edisoncor.gui.button.ButtonAqua btnEditarP;
    private org.edisoncor.gui.button.ButtonAqua btnRegistrarP;
    private javax.swing.JButton btnSalirR;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido2;
    private javax.swing.JTable tablaPreguntas;
    private javax.swing.JLabel titlequestions;
    // End of variables declaration//GEN-END:variables
}
