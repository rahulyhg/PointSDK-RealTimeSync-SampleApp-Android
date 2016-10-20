package com.bluedotinnovation.realtimesyncsampleapp.model;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Bluedot Innovation on 05/10/16.
 */
public class CircleItem extends MapItem{

    private CircleOptions circle;

    @Override
    public LatLng getPosition() {
        return circle.getCenter();
    }

    @Override
    public void setGeometry(Object geometry) {
        this.circle = (CircleOptions)geometry;
    }

    @Override
    public Object getGeometry() {
        return circle;
    }
}
