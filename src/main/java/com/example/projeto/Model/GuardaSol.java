package com.example.projeto.Model;
import com.example.projeto.Model.Enums.StatusGuardaSol;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "guarda_sol")
public class GuardaSol {
    @Id // Diz que é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente
    private int idMesa;
    @Enumerated(EnumType.STRING) // Para salvar enum como texto
    private StatusGuardaSol status;
    private int qntCadeiras;
    private int qntPedidos;
    private int qntClientes;

    public GuardaSol() {}
    public GuardaSol (int idMesa, StatusGuardaSol status, int qntCadeiras, int qntPedidos, int qntClientes){
        this.idMesa = idMesa;
        this.status = status;
        this.qntCadeiras = qntCadeiras;
        this.qntPedidos = qntPedidos;
        this.qntClientes = qntClientes;
    }
    public int getIdMesa() {
        return idMesa;
    }
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getQntCadeiras() {
        return qntCadeiras;
    }
    public void setQntCadeiras(int qntCadeiras) {
        this.qntCadeiras = qntCadeiras;
    }

    public int getQntClientes() {
        return qntClientes;
    }
    public void setQntClientes(int qntClientes) {
        this.qntClientes = qntClientes;
    }

    public int getQntPedidos() {
        return qntPedidos;
    }
    public void setQntPedidos(int qntPedidos) {
        this.qntPedidos = qntPedidos;
    }
    
    public StatusGuardaSol getStatus() {
        return status;
    }
    public void setStatus(StatusGuardaSol status) {
        this.status = status;
    }
}
