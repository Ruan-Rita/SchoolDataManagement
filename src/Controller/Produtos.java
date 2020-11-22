/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Ruan Fagundes
 */
public class Produtos {
    
    private int id;
    private String nome;
    private String descricao;
    private Double preco;
    private int quantidade;
    
    
    public Produtos(){
        
    }

    public Produtos(int id, String nome, String descricao, Double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    

    @Override
    public String toString() {
        return "Produtos{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quantidade="+ quantidade +'}';
    }
    
    
    
}
