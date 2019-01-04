package com.mva.taller.contador.mecanicos.models.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorkOrder {
    private String ordenId;
    private String bahiaId;
    private String nombre;
    private String taller;
    private String bodega;
    private String descripcion;

    public WorkOrder() {}

    public WorkOrder(String ordenId, String bahiaId, String nombre, String taller, String bodega, String descripcion) {
        this.ordenId = ordenId;
        this.bahiaId = bahiaId;
        this.nombre = nombre;
        this.taller = taller;
        this.bodega = bodega;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(String ordenId) {
        this.ordenId = ordenId;
    }

    public String getBahiaId() {
        return bahiaId;
    }

    public void setBahiaId(String bahiaId) {
        this.bahiaId = bahiaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public static ArrayList<WorkOrder> MapToTiempos(List<Map<String, Object>> listElementos)
    {
        ArrayList<WorkOrder> workOrders = new ArrayList<>();
        for (Map<String, Object> elemento:listElementos)
        {
            workOrders.add(WorkOrder.MapToTiempos(elemento));
        }
        return workOrders;
    }

    public static WorkOrder MapToTiempos(Map<String, Object> elemento)
    {
        WorkOrder w = new WorkOrder();
        w.setBahiaId(Tools.GetValueFromMap(elemento,"BAHIA_ID"));
        w.setOrdenId(Tools.GetValueFromMap(elemento,"ORDEN_ID"));
        w.setNombre(Tools.GetValueFromMap(elemento,"NOMBRE"));
        w.setTaller(Tools.GetValueFromMap(elemento,"TALLER"));
        w.setBodega(Tools.GetValueFromMap(elemento,"BODEGA"));
        w.setDescripcion(Tools.GetValueFromMap(elemento,"DESCRIPCION"));
        return w;
    }
}
