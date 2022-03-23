package com.api.parkingcontrol.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroVaga;
    @Column(nullable = false, unique = true, length = 7)
    private String placa;
    @Column(nullable = false, length = 66)
    private String marca;
    @Column(nullable = false, length = 66)
    private String modelo;
    @Column(nullable = false, length = 66)
    private String cor;
    @Column(nullable = false)
    private LocalDateTime dataRegistro;
    @Column(nullable = false, unique = false, length = 166)
    private String dono;
    @Column(nullable = false, unique = false, length = 22)
    private String apartamento;
    @Column(nullable = false, unique = false, length = 22)
    private String bloco;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(String numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
