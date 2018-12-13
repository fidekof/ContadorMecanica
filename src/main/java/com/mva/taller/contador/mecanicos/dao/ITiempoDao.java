package com.mva.taller.contador.mecanicos.dao;
import java.util.List;
import com.mva.taller.contador.mecanicos.entity.tiempos;


public interface ITiempoDao {
    public List<tiempos> findAll();

}
