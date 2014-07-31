/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.jDialog;

import compareImages.util.CompareParams;
import controller.Controller;

/**
 *
 * @author nick
 */
public class JDialogRecognitionAreaWidthAndHeight extends javax.swing.JDialog {

    /**
     * Creates new form jDialogEditSensitivity
     */
    CompareParams params;
    
    public JDialogRecognitionAreaWidthAndHeight(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        int width = Controller.getInstance().getRecognitionAreaWidth();
        int height = Controller.getInstance().getRecognitionAreaHeigh();
        jLblSensValueHeight.setText(String.valueOf(height));
        jLblSensValueWidth.setText(String.valueOf(width));
        jSliderValueHeight.setValue(height);
        jSliderValueWidth.setValue(width);
//        jLblSensValueHeight.setText(String.valueOf(params.getSensitivity()));
//        jSliderValueHeight.setValue(params.getSensitivity());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSliderValueHeight = new javax.swing.JSlider();
        jLblSensValueHeight = new javax.swing.JLabel();
        jLblSensValueWidth = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSliderValueWidth = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Height");

        jSliderValueHeight.setMaximum(600);
        jSliderValueHeight.setMinimum(20);
        jSliderValueHeight.setValue(110);
        jSliderValueHeight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderValueHeightStateChanged(evt);
            }
        });

        jLblSensValueHeight.setText("110");

        jLblSensValueWidth.setText("110");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel2.setText("Width");

        jSliderValueWidth.setMaximum(600);
        jSliderValueWidth.setMinimum(20);
        jSliderValueWidth.setValue(110);
        jSliderValueWidth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderValueWidthStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblSensValueHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jSliderValueWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSliderValueHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLblSensValueWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderValueHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLblSensValueHeight)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderValueWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblSensValueWidth)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderValueHeightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderValueHeightStateChanged
        int value = jSliderValueHeight.getValue();
        jLblSensValueHeight.setText(String.valueOf(value));
        Controller.getInstance().setRecognitionAreaHeigh(value);
    }//GEN-LAST:event_jSliderValueHeightStateChanged

    private void jSliderValueWidthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderValueWidthStateChanged
        int value = jSliderValueWidth.getValue();
        jLblSensValueWidth.setText(String.valueOf(value));
         Controller.getInstance().setRecognitionAreaWidth(value);
    }//GEN-LAST:event_jSliderValueWidthStateChanged

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
            java.util.logging.Logger.getLogger(JDialogRecognitionAreaWidthAndHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogRecognitionAreaWidthAndHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogRecognitionAreaWidthAndHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogRecognitionAreaWidthAndHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogRecognitionAreaWidthAndHeight dialog = new JDialogRecognitionAreaWidthAndHeight(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblSensValueHeight;
    private javax.swing.JLabel jLblSensValueWidth;
    private javax.swing.JSlider jSliderValueHeight;
    private javax.swing.JSlider jSliderValueWidth;
    // End of variables declaration//GEN-END:variables
}
