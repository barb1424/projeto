package com.example.projeto.Model;
import com.example.projeto.Model.Enums.StatusQuiosque;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiosque")
public class Quiosque {
@Id // Diz que é a chave primária
@GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente
private int idQuiosque;
@Enumerated(EnumType.STRING) // Para salvar enum como texto
private StatusQuiosque status;
private int qtdClientes;
private int qtdPedidos;
private int qntMesas;

public Quiosque(int idQuiosque, StatusQuiosque status, int qtdClientes, int qtdPedidos, int qntMesas) {
    this.idQuiosque = idQuiosque;
    this.status = status;
    this.qtdClientes = qtdClientes;
    this.qtdPedidos = qtdPedidos;
    this.qntMesas = qntMesas;
}
public int getIdQuiosque() {
    return idQuiosque;
}
public void setIdQuiosque(int idQuiosque) {
    this.idQuiosque = idQuiosque;
}
public StatusQuiosque getStatus() {
    return status;
}
public void setStatus(StatusQuiosque status) {
    this.status = status;
}
public int getQtdClientes() {
    return qtdClientes;
}
public void setQtdClientes(int qtdClientes) {
    this.qtdClientes = qtdClientes;
}
public int getQtdPedidos() {
    return qtdPedidos;
}
public void setQtdPedidos(int qtdPedidos) {
    this.qtdPedidos = qtdPedidos;
}
public int getQntMesas() {
    return qntMesas;
}
public void setQntMesas(int qntMesas) {
    this.qntMesas = qntMesas;
}
}
