package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Venda;

public class TelaVendaNova extends javax.swing.JPanel {
    ArrayList<Venda> vendas;
    private DefaultTableModel tableModel;
    
    public TelaVendaNova() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstTable = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnEditor = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

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

        btnEditor.setText("Edit");
        btnEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddItem)
                    .addComponent(btnExcluir)
                    .addComponent(btnVisualizar)
                    .addComponent(btnEditor))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddItem)
                        .addGap(61, 61, 61)
                        .addComponent(btnEditor)
                        .addGap(55, 55, 55)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
try {
            JFrame janelaAdd = new JFrame("Adicionar Nova Venda");
            janelaAdd.setSize(500, 350);
            janelaAdd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janelaAdd.setLocationRelativeTo(this);
            
            CadastroVenda telaCadastro = new CadastroVenda(null, true);
            janelaAdd.setContentPane(telaCadastro.getContentPane());
            
            janelaAdd.setVisible(true);

            janelaAdd.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    Venda novaVenda = telaCadastro.getVenda();
                    if (novaVenda != null && novaVenda.getDataVenda() != null) {
                        vendas.add(novaVenda);
                        loadItensInTable();
                    }
                }
            });

        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao tentar abrir a tela de cadastro!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorActionPerformed
    int linhaSelecionada = lstTable.getSelectedRow();

    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para editar.", "Nenhuma Venda Selecionada", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Venda vendaParaEditar = vendas.get(linhaSelecionada);

    JFrame janelaEdit = new JFrame("Editar Venda");
    janelaEdit.setSize(500, 350);
    janelaEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    janelaEdit.setLocationRelativeTo(this);

    CadastroVenda telaCadastro = new CadastroVenda(null, true);
    telaCadastro.setVenda(vendaParaEditar);
    janelaEdit.setContentPane(telaCadastro.getContentPane());

    janelaEdit.setVisible(true);

    janelaEdit.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                Venda vendaModificada = telaCadastro.getVenda();
                if (vendaModificada != null && vendaModificada.getDataVenda() != null) {
                    vendas.set(linhaSelecionada, vendaModificada);
                    loadItensInTable();
                }
            }
        });
    }//GEN-LAST:event_btnEditorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    int linhaSelecionada = lstTable.getSelectedRow();

        if (linhaSelecionada == -1) {
            JFrame janelaErro = new JFrame("Erro - Exclusão");
            janelaErro.setSize(300, 100);
            janelaErro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janelaErro.setLocationRelativeTo(this);
            
            javax.swing.JLabel lblMensagem = new javax.swing.JLabel("Por favor, selecione uma venda para excluir.");
            lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            janelaErro.add(lblMensagem);
            janelaErro.setVisible(true);
            return; 
        }

        JFrame janelaConfirmacao = new JFrame("Confirmar Exclusão");
        janelaConfirmacao.setSize(300, 100);
        janelaConfirmacao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaConfirmacao.setLocationRelativeTo(this);
        janelaConfirmacao.setLayout(new java.awt.FlowLayout());
        
        javax.swing.JLabel lblPergunta = new javax.swing.JLabel("Tem certeza que deseja excluir esta venda?");
        javax.swing.JButton btnSim = new javax.swing.JButton("Sim");
        javax.swing.JButton btnNao = new javax.swing.JButton("Não");
        
        btnSim.addActionListener(e -> {
            vendas.remove(linhaSelecionada);
            loadItensInTable();
            janelaConfirmacao.dispose();
            
            JFrame janelaSucesso = new JFrame("Sucesso");
            janelaSucesso.setSize(300, 100);
            janelaSucesso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janelaSucesso.setLocationRelativeTo(this);
            
            javax.swing.JLabel lblSucesso = new javax.swing.JLabel("Venda excluída com sucesso!");
            lblSucesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            janelaSucesso.add(lblSucesso);
            janelaSucesso.setVisible(true);
        });
        
        btnNao.addActionListener(e -> janelaConfirmacao.dispose());
        
        janelaConfirmacao.add(lblPergunta);
        janelaConfirmacao.add(btnSim);
        janelaConfirmacao.add(btnNao);
        janelaConfirmacao.setVisible(true);
               
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
     int linhaSelecionada = lstTable.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para visualizar.", "Nenhuma Venda Selecionada", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Venda vendaParaVisualizar = vendas.get(linhaSelecionada);

        JFrame janelaView = new JFrame("Visualizar Venda");
        janelaView.setSize(500, 350);
        janelaView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaView.setLocationRelativeTo(this);
        
        CadastroVenda telaVisualizacao = new CadastroVenda(null, true);
        telaVisualizacao.setVenda(vendaParaVisualizar);
        
        telaVisualizacao.getContentPane().setEnabled(false);
        desabilitarComponentes(telaVisualizacao.getContentPane());
        
        janelaView.setContentPane(telaVisualizacao.getContentPane());
        janelaView.setVisible(true);
    }//GEN-LAST:event_btnVisualizarActionPerformed

     private void desabilitarComponentes(java.awt.Container container) {
        for (java.awt.Component component : container.getComponents()) {
            component.setEnabled(false);
            if (component instanceof java.awt.Container) {
                desabilitarComponentes((java.awt.Container) component);
            }
        }
    }
    
    public static void main(String[] args) {
        
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            javax.swing.JFrame frame = new javax.swing.JFrame("Gestão de Vendas");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

            TelaVendaNova painelPrincipal = new TelaVendaNova();
            frame.setContentPane(painelPrincipal);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    });
    }
    
     public void loadItensInTable(){
       tableModel.setRowCount(0);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    for (Venda venda : vendas) {
        Object[] linha = new Object[4];

        if (venda.getDataVenda() != null) {
            java.time.LocalDateTime dataCompleta = venda.getDataVenda();
            linha[0] = dataCompleta.toLocalDate().format(formatter);
        } else {
            linha[0] = "Data não informada";
        }
        
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
    private javax.swing.JButton btnEditor;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstTable;
    // End of variables declaration//GEN-END:variables
}
