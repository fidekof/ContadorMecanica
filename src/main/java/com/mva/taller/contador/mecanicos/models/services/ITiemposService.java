package com.mva.taller.contador.mecanicos.models.services;
import com.mva.taller.contador.mecanicos.models.entity.Tiempos;
import java.util.List;

public interface ITiemposService {
    public List<Tiempos> findAll();
}
