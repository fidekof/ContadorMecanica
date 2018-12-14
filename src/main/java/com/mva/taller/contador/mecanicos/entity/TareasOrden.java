package com.mva.taller.contador.mecanicos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="prod_tareas_orden", schema = "productividad")
public class TareasOrden implements Serializable {

    @Id
    @Column(name = "ORDEN_ID")
    private Integer ordenId;

    @Id
    @Column(name = "TAREA_ID")
    private String tareaId;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "DESCRIPCION2")
    private String descripcion2;

    @Column(name = "ESTADO")
    private String estado;


    public TareasOrden() {
    }

    public TareasOrden(Integer ordenId, String tareaId, String descripcion, String descripcion2, String estado) {
        this.ordenId = ordenId;
        this.tareaId = tareaId;
        this.descripcion = descripcion;
        this.descripcion2 = descripcion2;
        this.estado = estado;
    }


    public Integer getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(Integer ordenId) {
        this.ordenId = ordenId;
    }

    public String getTareaId() {
        return tareaId;
    }

    public void setTareaId(String tareaId) {
        this.tareaId = tareaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

