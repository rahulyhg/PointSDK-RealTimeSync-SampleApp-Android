package com.bluedotinnovation.realtimesyncsampleapp.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;

/**
 * Created by Bluedot Innovation on 05/10/16.
 */
public class PolygonItem extends MapItem{

    private PolygonOptions polygon;

    @Override
    public LatLng getPosition() {
        return polygon.getPoints().get(0);
    }

    @Override
    public void setGeometry(Object geometry) {
        this.polygon = (PolygonOptions)geometry;
    }

    @Override
    public Object getGeometry() {
        return polygon;
    }
}
