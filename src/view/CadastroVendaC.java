package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import model.FormaContrato;
import model.FormaPgto;
import model.Venda;

public class CadastroVendaC {
    public static void main(String[] args) {
        JFrame janelaAdd = new JFrame();
        janelaAdd.setVisible(true);
        janelaAdd.setSize(400, 400);
        janelaAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaAdd.setTitle("Criar venda");
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        
        JLabel lblData = new JLabel("Data (dd/MM/yyyy)");
        JTextField txtData = new JTextField(10);
        JLabel lblValor = new JLabel("Valor");
        JTextField txtValor = new JTextField(10);
        JLabel lblPag = new JLabel("Forma de Pagamento");
        JComboBox<FormaPgto> cmbPag = new JComboBox<>();
        cmbPag.addItem(FormaPgto.CARTAO);
        cmbPag.addItem(FormaPgto.PIX);
        cmbPag.addItem(FormaPgto.DINHEIRO);
        JLabel lblCont = new JLabel("Forma de Contrato");
        JComboBox<FormaContrato> cmbCont = new JComboBox<>();
        cmbCont.addItem(FormaContrato.APRAZO);
        cmbCont.addItem(FormaContrato.AVISTA);
        cmbCont.addItem(FormaContrato.PARCELADO);
        //BOTAO DE SALVAR
        JButton btnSalvar = new JButton("Cadastrar Produto");
        
        painel.add(lblData);
        painel.add(txtData);
        painel.add(lblValor);
        painel.add(txtValor);
        painel.add(lblPag);
        painel.add(cmbPag);
        painel.add(lblCont);
        painel.add(cmbCont);
        painel.add(btnSalvar);
        
        janelaAdd.add(painel);
        
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String dataTexto = txtData.getText();
                    String valorTexto = txtValor.getText();
                    FormaPgto formaPagamento = (FormaPgto) cmbPag.getSelectedItem();
                    FormaContrato formaContrato = (FormaContrato) cmbCont.getSelectedItem();
                    
                    if (dataTexto.isEmpty() || valorTexto.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                        return;
                    }
                    if (formaPagamento == null || formaContrato == null) {
                        JOptionPane.showMessageDialog(null, "Selecione forma de pagamento e contrato!");
                        return;
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDateTime dataVenda = LocalDateTime.parse(dataTexto, formatter);
                    
                    double valor = Double.parseDouble(valorTexto);
                    Venda venda = new Venda(dataVenda, valor, formaPagamento, formaContrato);
                    
                    JOptionPane.showMessageDialog(null, "Venda adicionada com sucesso!\n" + 
                        "Data: " + venda.getDataVenda() + "\n" +
                        "Valor: R$ " + venda.getValorVenda() + "\n" +
                        "Forma Pgto: " + venda.getFormaPgto() + "\n" +
                        "Forma Contrato: " + venda.getFormaContrato());
                    
                    txtData.setText("");
                    txtValor.setText("");
                    cmbPag.setSelectedIndex(-1);
                    cmbCont.setSelectedIndex(-1);
                    
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Formato de data inválido! Use: dd/MM/yyyy");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido! Use apenas números.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao criar venda: " + ex.getMessage());
                }
            }
        });
    }
}