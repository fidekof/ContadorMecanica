package com.mva.taller.contador.mecanicos.models.services;

import com.mva.taller.contador.mecanicos.models.dao.ITiempos;
import com.mva.taller.contador.mecanicos.models.entity.Tiempos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TiemposServiceImpl implements ITiemposService{

    @Autowired
    private ITiempos iTiempos;

    @Override
    @Transactional(readOnly = true)
    public List<Tiempos> findAll() {
        return (List<Tiempos>) iTiempos.findAll();
    }
}
