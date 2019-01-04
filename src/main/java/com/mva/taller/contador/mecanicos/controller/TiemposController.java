package com.mva.taller.contador.mecanicos.controller;

import com.mva.taller.contador.mecanicos.models.entity.Tiempos;
import com.mva.taller.contador.mecanicos.models.entity.TiemposRowMapper;
import com.mva.taller.contador.mecanicos.models.entity.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("tiempos")
public class TiemposController {
    @Autowired
    JdbcTemplate JdbcTemplate;

    @GetMapping(value = "/byOrdenId/{taller}/{bahia}", produces = "application/json")
    public ArrayList<WorkOrder> getTiemposByOrdenId(@PathVariable String taller, @PathVariable String bahia){
        ArrayList<WorkOrder> tiemposList = null;
        String sql =" SELECT DISTINCT O.ORDEN_ID, T.BAHIA_ID, U.NOMBRE, PO.TALLER, PO.BODEGA, O.DESCRIPCION " +
                " FROM PRODUCTIVIDAD.PROD_TAREAS_ORDEN O, PRODUCTIVIDAD.PROD_TIEMPOS T, PRODUCTIVIDAD.PROD_USUARIOS U, PRODUCTIVIDAD.PROD_ORDEN PO " +
                " WHERE " +
                " NVL(TRIM(O.ORDEN_ID),'XXXXX') = NVL(TRIM(PO.ORDEN_ID),'XXXXX') " +
                " AND NVL(TRIM(T.ORDEN_ID),'XXXXX') = NVL(TRIM(O.ORDEN_ID),'XXXXX') " +
                " AND NVL(TRIM(O.ESTADO),'T') != 'T' " +
                " AND NVL(TRIM(T.USUARIO_ID),'XXXXXXXXXX') = NVL(TRIM(U.USUARIO_ID),'XXXXXXXXXX') " +
                " AND NVL(TRIM(PO.TIPO),'XXXXXXXXXX') = 'SH' " +
                " AND NVL(TRIM(PO.BODEGA),'XXXXXXXXXX') LIKE '%"+taller+"%' " +
                " AND NVL(TRIM(O.DESCRIPCION),'XXXXXXXXXX') = 'COMBO 2' " +
                " -- AND T.BAHIA_ID = '"+bahia+"'";
        List<Map<String, Object>> tiemposListMap = JdbcTemplate.queryForList(sql);
        return WorkOrder.MapToTiempos(tiemposListMap);
    }
}
