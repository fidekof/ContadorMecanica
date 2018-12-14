package com.mva.taller.contador.mecanicos.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TiemposId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ORDEN_ID")
    @Size(max = 30)
    private String ordenId;

    @Column(name = "TAREA_ID")
    @Size(max = 30)
    private String tareaId;

    @Column(name = "HORA_INICIO")
    @Size(max = 30)
    private String horaInicio;

    public TiemposId(@Size(max = 30) String ordenId, @Size(max = 30) String tareaId, @Size(max = 30) String horaInicio) {
        this.ordenId = ordenId;
        this.tareaId = tareaId;
        this.horaInicio = horaInicio;
    }

    public TiemposId() {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TiemposId)) return false;
        TiemposId that = (TiemposId) o;
        return Objects.equals(getHoraInicio(), that.getHoraInicio()) &&
                Objects.equals(getTareaId(), that.getTareaId()) &&
                Objects.equals(getOrdenId(), that.getOrdenId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTareaId(), getOrdenId(),getHoraInicio());
    }
}
