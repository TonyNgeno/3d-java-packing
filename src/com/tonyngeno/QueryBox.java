package com.tonyngeno;

import com.tonyngeno.interfaces.QueryBoxI;
import com.tonyngeno.model.Box;


public class QueryBox implements QueryBoxI {
    private final Box box;

    public QueryBox(Box box) {
        this.box = box;
    }

    @Override
    public double getSurfaceArea() {
        return (2*(box.getLength()*box.getWidth()))
                + (2*(box.getWidth()*box.getHeight()))
                +(2*(box.getLength()*box.getHeight()));
    }

    @Override
    public double getVolume() {
        return box.getHeight()*box.getLength()*box.getWidth();
    }
}
