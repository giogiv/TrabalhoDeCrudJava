package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        jButton3 = new javax.swing.JButton();
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

        jButton3.setText("Visualizar");

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
                    .addComponent(jButton3)
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
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
    System.out.println("1. O botão 'Add' foi clicado. O método iniciou."); // DEBUG

    try {
        // Pega a referência da janela "pai" deste painel (JPanel)
        java.awt.Window parentWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        System.out.println("2. A janela pai foi encontrada: " + parentWindow); // DEBUG

        // Cria o diálogo passando a janela pai como dona
        // O cast para (java.awt.Frame) é necessário
        System.out.println("3. Vai criar a tela de cadastro (JDialog)..."); // DEBUG
        CadastroVenda telaCadastro = new CadastroVenda((java.awt.Frame) parentWindow, true);
        System.out.println("4. A tela de cadastro foi criada com sucesso."); // DEBUG

        // MUITO IMPORTANTE: Torna a tela visível
        telaCadastro.setVisible(true);

        System.out.println("5. A tela de cadastro foi fechada."); // DEBUG

        // O código só continua daqui depois que a tela de cadastro é fechada
        Venda novaVenda = telaCadastro.getVenda();

        // Verifica se o usuário salvou uma venda ou apenas fechou a janela
        if (novaVenda != null && novaVenda.getDataVenda() != null) {
            System.out.println("6. Uma nova venda válida foi recebida. Adicionando à lista."); // DEBUG
            vendas.add(novaVenda);
            loadItensInTable();
        } else {
            System.out.println("6. Nenhuma venda foi salva (a janela foi cancelada ou fechada)."); // DEBUG
        }

    } catch (Exception e) {
        // Se qualquer erro acontecer, ele será mostrado aqui
        System.err.println("Ocorreu um erro ao tentar abrir a tela de cadastro!");
        e.printStackTrace();
}
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorActionPerformed
       // 1. Pega o índice da linha que o usuário selecionou
    int linhaSelecionada = lstTable.getSelectedRow();

    // 2. Verifica se alguma linha foi selecionada
    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para editar.", "Nenhuma Venda Selecionada", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 3. Pega o objeto 'Venda' correspondente à linha selecionada da nossa lista
    Venda vendaParaEditar = vendas.get(linhaSelecionada);

    // 4. Abre a tela de cadastro, assim como no botão "Add"
    java.awt.Window parentWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
    CadastroVenda telaCadastro = new CadastroVenda((java.awt.Frame) parentWindow, true);

    // 5. **A PARTE IMPORTANTE:** Usa o método setVenda para preencher a tela de cadastro com os dados da venda
    telaCadastro.setVenda(vendaParaEditar);

    // 6. Mostra a tela de cadastro e espera o usuário terminar de editar
    telaCadastro.setVisible(true);

    // 7. Depois que a tela de cadastro é fechada, pega a venda (possivelmente) modificada
    Venda vendaModificada = telaCadastro.getVenda();

    // 8. Se a venda não for nula (usuário não cancelou), atualiza a lista e a tabela
    if (vendaModificada != null && vendaModificada.getDataVenda() != null) {
        vendas.set(linhaSelecionada, vendaModificada); // Substitui a venda antiga pela nova na lista
        loadItensInTable(); // Recarrega a tabela com os dados atualizados
}
    }//GEN-LAST:event_btnEditorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         // 1. Pega o índice da linha que o usuário selecionou
    int linhaSelecionada = lstTable.getSelectedRow();

    // 2. Verifica se alguma linha foi realmente selecionada
    if (linhaSelecionada == -1) {
        // Se for -1, significa que o usuário não clicou em nenhuma linha
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para excluir.", "Nenhuma Venda Selecionada", JOptionPane.WARNING_MESSAGE);
        return; // Para a execução do método aqui
    }

    // 3. Pede confirmação ao usuário antes de excluir
    int confirmacao = JOptionPane.showConfirmDialog(this, 
                                                    "Tem certeza que deseja excluir esta venda?", 
                                                    "Confirmar Exclusão", 
                                                    JOptionPane.YES_NO_OPTION);

    // 4. Se o usuário clicou em "Sim" (YES_OPTION)
    if (confirmacao == JOptionPane.YES_OPTION) {
        // Remove a venda da nossa lista de dados (ArrayList)
        vendas.remove(linhaSelecionada);
        
        // Atualiza a tabela na interface gráfica para refletir a remoção
        loadItensInTable();
        
        JOptionPane.showMessageDialog(this, "Venda excluída com sucesso!");
    }
               
    }//GEN-LAST:event_btnExcluirActionPerformed
public static void main(String[] args) {
        
        // Garante que o código da interface gráfica rode na thread correta
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            // 1. Cria a "moldura" (a janela principal)
            javax.swing.JFrame frame = new javax.swing.JFrame("Gestão de Vendas");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

            // 2. Cria a sua "pintura" (o painel com a tabela e botões)
            TelaVendaNova painelPrincipal = new TelaVendaNova();
            
            // 3. Coloca a pintura dentro da moldura
            frame.setContentPane(painelPrincipal);

            // 4. Ajusta o tamanho da moldura para caber a pintura
            frame.pack();
            
            // 5. Centraliza a janela na tela
            frame.setLocationRelativeTo(null);
            
            // 6. Pendura a moldura na parede (torna a janela visível)
            frame.setVisible(true);
        }
    });
    }
    
     public void loadItensInTable(){
       tableModel.setRowCount(0);
    // O formatador continua o mesmo, pois você só quer exibir a data
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    for (Venda venda : vendas) {
        Object[] linha = new Object[4];

        // --- A MUDANÇA É AQUI ---
        if (venda.getDataVenda() != null) {
            // 1. Pega o objeto LocalDateTime
            java.time.LocalDateTime dataCompleta = venda.getDataVenda();
            // 2. Converte para LocalDate (só data) e DEPOIS formata
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
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstTable;
    // End of variables declaration//GEN-END:variables
}
