package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.Venda;

public class TelaVenda extends javax.swing.JFrame {
    ArrayList<Venda> vendas;
    private DefaultTableModel tableModel;
    
    public TelaVenda() {
        initComponents();
        vendas = new ArrayList<>();
        initializeTable();
    }
    
    private void initializeTable() {
        String[] colunas = {"Data", "Valor", "Forma Pagamento", "Forma Contrato"};
        
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        
        lstTable.setModel(tableModel);
        
        lstTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        lstTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        lstTable.getColumnModel().getColumn(2).setPreferredWidth(120);
        lstTable.getColumnModel().getColumn(3).setPreferredWidth(120);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstTable = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        lstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Valor", "Pagamento", "Contrato"
            }
        ));
        jScrollPane1.setViewportView(lstTable);

        btnAddItem.setText("Add");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");

        jButton3.setText("Visualizar");

        jButton4.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddItem)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddItem)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        CadastroVenda telaCadastro = new CadastroVenda(this, true);
        telaCadastro.setVisible(true);
        
        Venda cadVenda = telaCadastro.getVenda();
        
        vendas.add(cadVenda);
        
        loadItensInTable();
    }//GEN-LAST:event_btnAddItemActionPerformed

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new TelaVenda().setVisible(true);
            }
        });
    }
    
     public void loadItensInTable(){
        tableModel.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for(Venda venda : vendas){
            Object[] linha = new Object[4];
            
            linha[0] = venda.getDataVenda() != null ? 
                      venda.getDataVenda().format(formatter) : 
                      "Data não informada";
            linha[1] = String.format("R$ %.2f", venda.getValorVenda());
            linha[2] = venda.getFormaPgto() != null ? 
                      venda.getFormaPgto().toString() : 
                      "Não informado";
            linha[3] = venda.getFormaContrato() != null ? 
                      venda.getFormaContrato().toString() : 
                      "Não informado";
            
            tableModel.addRow(linha);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstTable;
    // End of variables declaration//GEN-END:variables
}
