package com.example.projeto.Model;
import com.example.projeto.Model.Enums.StatusPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
@Id // Diz que é a chave primária
@GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente
private int idPedido;
@Enumerated(EnumType.STRING) // Para salvar enum como texto
private StatusPedido status;
private String nomeCliente;
private int itensPedidos;

public Pedido (int idPedido, StatusPedido status, String nomeCliente, int itensPedidos){
this.idPedido = idPedido;
this.status = status;
this.nomeCliente = nomeCliente;
this.itensPedidos = itensPedidos;
}

public int getIdPedido() {
    return idPedido;
}

public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
}

public StatusPedido getStatus() {
    return status;
}

public void setStatus(StatusPedido status) {
    this.status = status;
}

public String getNomeCliente() {
    return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
}

public int getItensPedidos() {
    return itensPedidos;
}

public void setItensPedidos(int itensPedidos) {
    this.itensPedidos = itensPedidos;
}
}
