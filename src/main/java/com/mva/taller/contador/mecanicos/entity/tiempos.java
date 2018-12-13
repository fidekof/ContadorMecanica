package com.mva.taller.contador.mecanicos.entity;


//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Table;

//@Entity
//@Table(name="prod_tiempos")

public class tiempos {

    //@Id
  //  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orden_id;
    private int tarea_id;


    private String hora_inicio;
    private String hora_fin;
    private String usuario_id;
    private String bahia_id;
    private String cronometro;
    private String motivo;
    private String procesada;

    public int getOrden_id() {
        return orden_id;
    }

    public void setOrden_id(int orden_id) {
        this.orden_id = orden_id;
    }

    public int getTarea_id() {
        return tarea_id;
    }

    public void setTarea_id(int tarea_id) {
        this.tarea_id = tarea_id;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getBahia_id() {
        return bahia_id;
    }

    public void setBahia_id(String bahia_id) {
        this.bahia_id = bahia_id;
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
