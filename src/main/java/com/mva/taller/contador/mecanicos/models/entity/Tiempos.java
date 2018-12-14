package com.mva.taller.contador.mecanicos.models.entity;


import javax.persistence.*;

@Entity
@Table(name="prod_tiempos", schema = "productividad")
public class Tiempos{
    @EmbeddedId
    private TiemposId tiemposId;

    @Column(name = "HORA_FIN")
    private String horaFin;

    @Column(name = "USUARIO_ID")
    private String usuarioId;

    @Column(name = "BAHIA_ID")
    private String bahiaId;

    @Column(name = "CRONOMETRO")
    private String cronometro;

    @Column(name = "MOTIVO")
    private String motivo;

    @Column(name = "PROCESADA")
    private String procesada;

    public Tiempos() {
    }

    public Tiempos(TiemposId tiemposId, String horaFin, String usuarioId, String bahiaId, String cronometro, String motivo, String procesada) {
        this.tiemposId = tiemposId;
        this.horaFin = horaFin;
        this.usuarioId = usuarioId;
        this.bahiaId = bahiaId;
        this.cronometro = cronometro;
        this.motivo = motivo;
        this.procesada = procesada;
    }


    public TiemposId getTiemposId() {
        return tiemposId;
    }

    public void setTiemposId(TiemposId tiemposId) {
        this.tiemposId = tiemposId;
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
