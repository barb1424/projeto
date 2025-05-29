package com.example.projeto.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
@Id // Diz que é a chave primária
@GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente
private int idProduto;
private int qtdProduto;
private float valorProduto;

public Produto(int idProduto, int qtdProduto, float valorProduto) {
    this.idProduto = idProduto;
    this.qtdProduto = qtdProduto;
    this.valorProduto = valorProduto;
}
public int getIdProduto() {
    return idProduto;
}
public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
}
public int getQtdProduto() {
    return qtdProduto;
}
public void setQtdProduto(int qtdProduto) {
    this.qtdProduto = qtdProduto;
}
public float getValorProduto() {
    return valorProduto;
}
public void setValorProduto(float valorProduto) {
    this.valorProduto = valorProduto;
}
}
