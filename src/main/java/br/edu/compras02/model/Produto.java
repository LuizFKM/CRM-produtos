/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.compras02.model;

public class Produto {
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;
    private int codProduto;

    public Produto() {
    }

    public Produto(String nomeProduto, int quantidadeProduto, double precoProduto, int codProduto) {
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        this.codProduto = codProduto;
    }
    
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public String toString() {
        return "Produto{" + "nomeProduto=" + nomeProduto + ", quantidadeProduto=" + quantidadeProduto + ", precoProduto=" + precoProduto + ", codProduto=" + codProduto + '}';
    }
}
