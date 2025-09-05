package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.*;
import model.FormaContrato;
import model.FormaPgto;
import model.Venda;

public class CadastroVenda extends javax.swing.JDialog {
    
    private Venda venda = new Venda();

    public CadastroVenda(java.awt.Frame parent, boolean modal) {
        
  super(parent, modal);
    initComponents(); 

    cmbPag.removeAllItems(); 
    cmbCont.removeAllItems();
    
    for (FormaPgto pgto : FormaPgto.values()) {
        cmbPag.addItem(pgto);
    }
    
    for (FormaContrato contrato : FormaContrato.values()) {
        cmbCont.addItem(contrato);
    }
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

        lblData.setText("DATA");

        lblValor.setText("VALOR");

        lblPag.setText("FORMA DE PAGAMENTO");

        lblCont.setText("FORMA DE CONTRATO");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtData.setText("dd/mm/yyyy");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtValor.setText("Apenas números inteiros");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

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

        cmbCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPag)
                            .addComponent(lblCont))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPag, 0, 105, Short.MAX_VALUE)
                            .addComponent(cmbCont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
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
 try {
        String dataTexto = txtData.getText();
        String valorTexto = txtValor.getText();

        if (dataTexto.isEmpty() || valorTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.LocalDate dataLocal = java.time.LocalDate.parse(dataTexto, formatador);
        LocalDateTime dataVenda = dataLocal.atStartOfDay(); 
        
        double valor = Double.parseDouble(valorTexto);
        FormaPgto formaPagamento = (FormaPgto) cmbPag.getSelectedItem();
        FormaContrato formaContrato = (FormaContrato) cmbCont.getSelectedItem();

        this.venda = new Venda(dataVenda, valor, formaPagamento, formaContrato);

        this.dispose(); 

    } catch (java.time.format.DateTimeParseException ex) {
        JOptionPane.showMessageDialog(this, "Formato de data inválido! Use: dd/MM/yyyy", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Valor inválido! Use apenas números.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar venda: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    
    }    }//GEN-LAST:event_btnSalvarActionPerformed

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

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

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
        txtData.setText(venda.getDataVenda().toLocalDate().format(formatter));
    } else {
        txtData.setText("");
    }

    txtValor.setText(String.valueOf(venda.getValorVenda()));

    if (venda.getFormaPgto() != null) {
        cmbPag.setSelectedItem(venda.getFormaPgto());
    } else {
        cmbPag.setSelectedIndex(-1);
    }

    if (venda.getFormaContrato() != null) {
        cmbCont.setSelectedItem(venda.getFormaContrato());
    } else {
        cmbCont.setSelectedIndex(-1);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<model.FormaContrato> cmbCont;
    private javax.swing.JComboBox<model.FormaPgto> cmbPag;
    private javax.swing.JLabel lblCont;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPag;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
