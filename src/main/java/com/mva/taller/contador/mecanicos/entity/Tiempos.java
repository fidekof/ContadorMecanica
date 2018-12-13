package com.mva.taller.contador.mecanicos.entity;


import javassist.SerialVersionUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="productividad.prod_tiempos")
public class Tiempos implements Serializable{

    private static final long SerialVersionUID = 1L;

    @Column(name = "BAHIA_ID")
    private String bahiaId;

    @Column(name = "CRONOMETRO")
    private String cronometro;

    @Column(name = "HORA_INICIO")
    private String horaInicio;

    @Column(name = "HORA_FIN")
    private String horaFin;

    @Column(name = "MOTIVO")
    private String motivo;

    @Column(name = "ORDEN_ID")
    private String ordenId;

    @Column(name = "PROCESADA")
    private String procesada;

    @Column(name = "TAREA_ID")
    private String tareaId;

    @Column(name = "USUARIO_ID")
    private String usuarioId;

    public String getBahiaId() {
        return bahiaId;
    }

    public void setBahiaId(String bahiaId) {
        this.bahiaId = bahiaId;
    }

    public String getCronometro() {
        return cronometro;
    }

    public void setConometro(String conometro) {
        this.cronometro = conometro;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(String ordenId) {
        this.ordenId = ordenId;
    }

    public String getProcesada() {
        return procesada;
    }

    public void setProcesada(String procesada) {
        this.procesada = procesada;
    }

    public String getTareaId() {
        return tareaId;
    }

    public void setTareaId(String tareaId) {
        this.tareaId = tareaId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Tiempos() {
    }

    public Tiempos(String bahiaId, String conometro, String horaInicio, String horaFin, String motivo, String ordenId, String procesada, String tareaId, String usuarioId) {
        this.bahiaId = bahiaId;
        this.cronometro = conometro;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.motivo = motivo;
        this.ordenId = ordenId;
        this.procesada = procesada;
        this.tareaId = tareaId;
        this.usuarioId = usuarioId;
    }
}
