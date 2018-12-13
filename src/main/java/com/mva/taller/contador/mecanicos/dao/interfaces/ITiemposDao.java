package com.mva.taller.contador.mecanicos.dao.interfaces;

import com.mva.taller.contador.mecanicos.entity.Tiempos;

import javax.validation.constraints.Max;
import java.util.List;

public interface ITiemposDao {
    public List<Tiempos> findAll();
}
