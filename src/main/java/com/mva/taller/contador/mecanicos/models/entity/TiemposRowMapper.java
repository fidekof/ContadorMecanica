package com.mva.taller.contador.mecanicos.models.entity;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TiemposRowMapper implements RowMapper<Tiempos> {
    public Tiempos mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tiempos tiempos = new Tiempos();
        tiempos.setOrdenId(rs.getString("ORDEN_ID"));
        tiempos.setTareaId(rs.getString("TAREA_ID"));
        tiempos.setHoraInicio(rs.getString("HORA_INICIO"));
        tiempos.setHoraFin(rs.getString("HORA_FIN"));
        tiempos.setUsuarioId(rs.getString("USUARIO_ID"));
        tiempos.setBahiaId(rs.getString("BAHIA_ID"));
        tiempos.setCronometro(rs.getString("CRONOMETRO"));
        tiempos.setMotivo(rs.getString("MOTIVO"));
        tiempos.setProcesada(rs.getString("PROCESADA"));
            return tiempos;
        }

    }
