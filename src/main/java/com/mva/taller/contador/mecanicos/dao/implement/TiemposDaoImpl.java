package com.mva.taller.contador.mecanicos.dao.implement;

import com.mva.taller.contador.mecanicos.dao.interfaces.ITiemposDao;
import com.mva.taller.contador.mecanicos.entity.Tiempos;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class TiemposDaoImpl implements ITiemposDao {
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Tiempos> findAll() {
        return em.createQuery("from Tiempos").getResultList();
    }
}
