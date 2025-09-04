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
    
    initComponents(); // A MONTAGEM DAS PEÇAS DEVE VIR PRIMEIRO!

    // AGORA o seu código pode manipular as peças que já foram montadas.
    cmbPag.removeAllItems(); 
    cmbCont.removeAllItems();
    
    // Adiciona as formas de pagamento
    for (FormaPgto pgto : FormaPgto.values()) {
        cmbPag.addItem(pgto);
    }
    
    // Adiciona as formas de contrato
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

        txtData.setText("dd/mm/yyyy");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtValor.setText("Digite o número inteiro apenas");
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
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblData)
                            .addGap(129, 129, 129)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCont, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPag)
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
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

        // --- LÓGICA CORRETA PARA LER A DATA ---
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.LocalDate dataLocal = java.time.LocalDate.parse(dataTexto, formatador);
        LocalDateTime dataVenda = dataLocal.atStartOfDay(); // Converte para data e hora
        
        double valor = Double.parseDouble(valorTexto);
        FormaPgto formaPagamento = (FormaPgto) cmbPag.getSelectedItem();
        FormaContrato formaContrato = (FormaContrato) cmbCont.getSelectedItem();

        this.venda = new Venda(dataVenda, valor, formaPagamento, formaContrato);

        this.dispose(); // Fecha a janela

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
    
    // --- LÓGICA CORRETA PARA MOSTRAR A DATA ---
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    if (venda.getDataVenda() != null) {
        // Pega a data e hora, converte para apenas data, e então formata
        txtData.setText(venda.getDataVenda().toLocalDate().format(formatter));
    } else {
        txtData.setText("");
    }

    txtValor.setText(String.valueOf(venda.getValorVenda()));

    // O NetBeans vai mudar 'cmbPag.setSelectedItem(String)' para o correto
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
