package com.mva.taller.contador.mecanicos.dao;
import java.util.List;
import com.mva.taller.contador.mecanicos.entity.tareas_orden;


public interface ITareaOrdenDao {
    public List<tareas_orden> findAll();
}
