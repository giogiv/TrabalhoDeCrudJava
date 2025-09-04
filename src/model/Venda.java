package model;

import java.time.LocalDateTime;

public class Venda {
    private LocalDateTime dataVenda;
    private double valorVenda;
    private FormaPgto formaPgto;
    private FormaContrato formaContrato;

    public Venda(LocalDateTime dataVenda, double valorVenda, FormaPgto formaPgto, FormaContrato formaContrato) {
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.formaPgto = formaPgto;
        this.formaContrato = formaContrato;
    }
    
    public Venda(){
        
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public FormaPgto getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(FormaPgto formaPgto) {
        this.formaPgto = formaPgto;
    }

    public FormaContrato getFormaContrato() {
        return formaContrato;
    }

    public void setFormaContrato(FormaContrato formaContrato) {
        this.formaContrato = formaContrato;
    }

    @Override
    public String toString() {
        return "Venda{" + "dataVenda=" 
                + dataVenda + ", valorVenda=" 
                + valorVenda + ", formaPgto=" 
                + formaPgto + ", formaContrato=" 
                + formaContrato + '}';
    }
    
}

