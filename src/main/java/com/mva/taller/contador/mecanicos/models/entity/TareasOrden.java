package com.mva.taller.contador.mecanicos.models.entity;


import javax.persistence.*;

@Entity
@Table(name="prod_tareas_orden", schema = "productividad")
public class TareasOrden {

    @EmbeddedId
    private TareasOrdenId tareasOrdenId;


    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "DESCRIPCION2")
    private String descripcion2;

    @Column(name = "ESTADO")
    private String estado;


    public TareasOrden() {
    }

    public TareasOrden(TareasOrdenId tareasOrdenId, String descripcion, String descripcion2, String estado) {
        this.tareasOrdenId = tareasOrdenId;
        this.descripcion = descripcion;
        this.descripcion2 = descripcion2;
        this.estado = estado;
    }

    public TareasOrdenId getTareasOrdenId() {
        return tareasOrdenId;
    }

    public void setTareasOrdenId(TareasOrdenId tareasOrdenId) {
        this.tareasOrdenId = tareasOrdenId;
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

