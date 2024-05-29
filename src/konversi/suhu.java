/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konversi;

/**
 *
 * @author coldp
 */
public class suhu extends javax.swing.JFrame {

    /**
     * Creates new form suhu
     */
    public suhu() {
        initComponents();
        Reset();
    }

    void Reset(){
        tSUHUASAL.setText(null);
        vHASIL.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tSUHUASAL = new javax.swing.JTextField();
        tSKALAASAL = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tSKALATUJUAN = new javax.swing.JComboBox<>();
        jKONVERSI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vHASIL = new javax.swing.JLabel();
        jRESET = new javax.swing.JButton();
        jCLOSE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jPanel1.setBackground(new java.awt.Color(72, 126, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUHU ASAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        tSKALAASAL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenhaiet" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tSUHUASAL)
                    .addComponent(tSKALAASAL, 0, 388, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSUHUASAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSKALAASAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(72, 126, 176));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KONVERSI KE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        tSKALATUJUAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenhaiet" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSKALATUJUAN, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSKALATUJUAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jKONVERSI.setBackground(new java.awt.Color(113, 128, 147));
        jKONVERSI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jKONVERSI.setForeground(new java.awt.Color(255, 255, 255));
        jKONVERSI.setText("KONVERSI");
        jKONVERSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKONVERSIActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(72, 126, 176));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N

        vHASIL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vHASIL.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vHASIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(vHASIL, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jRESET.setBackground(new java.awt.Color(25, 42, 86));
        jRESET.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRESET.setForeground(new java.awt.Color(255, 255, 255));
        jRESET.setText("RESET");
        jRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRESETActionPerformed(evt);
            }
        });

        jCLOSE.setBackground(new java.awt.Color(232, 65, 24));
        jCLOSE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCLOSE.setForeground(new java.awt.Color(255, 255, 255));
        jCLOSE.setText("CLOSE");
        jCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCLOSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jKONVERSI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRESET)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCLOSE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jKONVERSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRESET)
                    .addComponent(jCLOSE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRESETActionPerformed
    Reset();    // TODO add your handling code here:
    }//GEN-LAST:event_jRESETActionPerformed

    private void jCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCLOSEActionPerformed
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jCLOSEActionPerformed

    private void jKONVERSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKONVERSIActionPerformed
    double suhuasal = Double.parseDouble(tSUHUASAL.getText());
    String skalaasal = tSKALAASAL.getSelectedItem().toString();
    String skalatujuan = tSKALATUJUAN.getSelectedItem().toString();
    double hasil = 0;
    if(skalaasal.equals("Celcius")&& skalatujuan.equals("Celcius")){
        hasil = suhuasal;
    }else if(skalaasal.equals("Celcius") && skalatujuan.equals("Kelvin")){
        hasil = suhuasal + 273.15;
    }else if(skalaasal.equals("Celcius") && skalatujuan.equals("Fahrenhaiet")){
        hasil = suhuasal * 9/5 + 32;
    }else if(skalaasal.equals("Kelvin") && skalatujuan.equals("Celcius")){
        hasil = suhuasal - 273.15;
    }else if(skalaasal.equals("Kelvin") && skalatujuan.equals("Kelvin")){
        hasil = suhuasal;
    }else if(skalaasal.equals("Kelvin") && skalatujuan.equals("Fahrenhaiet")){
        hasil = (suhuasal - 273.15) * 9/5 + 32;
    }else if(skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Celcius")){
        hasil = (suhuasal - 32) * 5/9;
    }else if(skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Kelvin")){
        hasil = (suhuasal - 32)* 5/9 + 273.15;
    }else if(skalaasal.equals("Fahrenhaiet") && skalatujuan.equals("Fahrenhaiet")){
        hasil = suhuasal;
    }//GEN-LAST:event_jKONVERSIActionPerformed
    String skala = skalatujuan.substring(0,1);
    vHASIL.setText(String.format("%.2f", hasil) + "\u00B0" + skala);
    }    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCLOSE;
    private javax.swing.JButton jKONVERSI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jRESET;
    private javax.swing.JComboBox<String> tSKALAASAL;
    private javax.swing.JComboBox<String> tSKALATUJUAN;
    private javax.swing.JTextField tSUHUASAL;
    private javax.swing.JLabel vHASIL;
    // End of variables declaration//GEN-END:variables
}
