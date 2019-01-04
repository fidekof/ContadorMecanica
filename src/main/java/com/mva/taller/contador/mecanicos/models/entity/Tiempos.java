package com.mva.taller.contador.mecanicos.models.entity;

import java.util.Map;

public class Tiempos {
    private String ordenId = "";
    private String tareaId = "";
    private String horaInicio = "";
    private String horaFin = null ;
    private String usuarioId = null;
    private String bahiaId = null;
    private String cronometro;
    private String motivo;
    private String procesada;

    public Tiempos(String ordenId, String tareaId, String horaInicio, String horaFin, String usuarioId, String bahiaId, String cronometro, String motivo, String procesada) {
        this.ordenId = ordenId;
        this.tareaId = tareaId;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuarioId = usuarioId;
        this.bahiaId = bahiaId;
        this.cronometro = cronometro;
        this.motivo = motivo;
        this.procesada = procesada;
    }

    public Tiempos() {
    }

    public String getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(String ordenId) {
        this.ordenId = ordenId;
    }

    public String getTareaId() {
        return tareaId;
    }

    public void setTareaId(String tareaId) {
        this.tareaId = tareaId;
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

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getBahiaId() {
        return bahiaId;
    }

    public void setBahiaId(String bahiaId) {
        this.bahiaId = bahiaId;
    }

    public String getCronometro() {
        return cronometro;
    }

    public void setCronometro(String cronometro) {
        this.cronometro = cronometro;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getProcesada() {
        return procesada;
    }

    public void setProcesada(String procesada) {
        this.procesada = procesada;
    }



}
