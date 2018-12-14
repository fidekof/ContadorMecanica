package com.mva.taller.contador.mecanicos.models.dao;

import com.mva.taller.contador.mecanicos.models.entity.Tiempos;
import com.mva.taller.contador.mecanicos.models.entity.TiemposId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITiempos extends CrudRepository<Tiempos, TiemposId>{

}
