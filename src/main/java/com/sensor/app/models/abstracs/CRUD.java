package com.sensor.app.models.abstracs;

import java.util.ArrayList;

public interface CRUD {
    String insert(Object model);
    int update(Object model);
    int delete(Object primaryKey);
    ArrayList<Object> select();
}