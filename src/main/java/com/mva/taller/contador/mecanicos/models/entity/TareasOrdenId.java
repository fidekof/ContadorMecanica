package com.mva.taller.contador.mecanicos.models.entity;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class TareasOrdenId implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(name = "ORDEN_ID")
    private Integer ordenId;

    @Column(name = "TAREA_ID")
    @Size(max = 30)
    private String tareaId;

    public TareasOrdenId() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TareasOrdenId)) return false;
        TareasOrdenId that = (TareasOrdenId) o;
        return Objects.equals(getOrdenId(), that.getOrdenId()) &&
                Objects.equals(getTareaId(), that.getTareaId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTareaId(), getOrdenId());
    }
}