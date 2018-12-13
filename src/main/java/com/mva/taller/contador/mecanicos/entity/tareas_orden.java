package com.mva.taller.contador.mecanicos.entity;

/*import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="prod_tareas_orden")*/

public class tareas_orden {

   // @Id
   // @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orden_id;
    private int tarea_id;
    private String descripcion;
    private String descripcion2;
    private String estado;

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
