package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import model.FormaContrato;
import model.FormaPgto;
import model.Venda;

public class CadastroVenda extends javax.swing.JDialog {
    
    private Venda venda = new Venda();

    public CadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblPag = new javax.swing.JLabel();
        lblCont = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        cmbPag = new javax.swing.JComboBox<>();
        cmbCont = new javax.swing.JComboBox<>();

        lblData.setText("Data");

        lblValor.setText("Valor");

        lblPag.setText("Forma de pagamento");

        lblCont.setText("Forma de contrato");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        cmbPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPagItemStateChanged(evt);
            }
        });
        cmbPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPagActionPerformed(evt);
            }
        });

        cmbCont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblData)
                            .addGap(140, 140, 140)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCont, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGap(137, 137, 137)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPag)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPag)
                    .addComponent(cmbPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCont)
                    .addComponent(cmbCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSalvar)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbContActionPerformed

    private void cmbPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPagActionPerformed

    private void cmbPagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPagItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPagItemStateChanged

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new CadastroVenda(null, true).setVisible(true);
            }
        });
    }
    
    public Venda getVenda(){
        return venda;
    }
    
    public void setVenda(Venda venda) {
        if (venda == null) {
            this.venda = new Venda();
            txtData.setText("");
            txtValor.setText("");
            cmbPag.setSelectedIndex(-1);
            cmbCont.setSelectedIndex(-1);
            return;
        }
        this.venda = venda;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (venda.getDataVenda() != null) {
            txtData.setText(venda.getDataVenda().format(formatter));
        } else {
            txtData.setText("");
        }

        txtValor.setText(String.valueOf(venda.getValorVenda()));

        if (venda.getFormaPgto() != null) {
            cmbPag.setSelectedItem(venda.getFormaPgto().toString());
        } else {
            cmbPag.setSelectedIndex(-1);
        }

        if (venda.getFormaContrato() != null) {
            cmbCont.setSelectedItem(venda.getFormaContrato().toString());
        } else {
            cmbCont.setSelectedIndex(-1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCont;
    private javax.swing.JComboBox<String> cmbPag;
    private javax.swing.JLabel lblCont;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPag;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
