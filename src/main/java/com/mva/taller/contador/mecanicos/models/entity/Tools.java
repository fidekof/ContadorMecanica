package com.mva.taller.contador.mecanicos.models.entity;

import java.util.Map;

public class Tools {
    public static String GetValueFromMap(Map<String, Object> element, String key){
        Object value = element.get(key);
        return value==null?"":value.toString().trim();
    }
}
