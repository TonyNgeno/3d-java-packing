package com.tonyngeno;

import com.tonyngeno.interfaces.AlgorithmI;
import com.tonyngeno.interfaces.QueryBoxI;
import com.tonyngeno.model.Box;

import java.util.Map;

public class Algorithm implements AlgorithmI {
    protected final Map<Integer, Box> packingBoxes;
    QueryBoxI queryBoxI;

    public Algorithm(Box container, Map<Integer, Box> packingBoxes) {
        this.packingBoxes = packingBoxes;
        this.queryBoxI =new QueryBox(container);
    }

    @Override
    public double getTotalPackingBoxSArea() {
        double totalSurfaceArea=0;
        for (Map.Entry<Integer, Box> entry : this.packingBoxes.entrySet()) {
            Integer integer = entry.getKey();
            Box box = entry.getValue();
            totalSurfaceArea += (integer * (new QueryBox(box).getSurfaceArea()));
        }
        return totalSurfaceArea;
    }

    @Override
    public double getTotalPackingBoxVolume() {
        double totalVolume=0;
        for (Map.Entry<Integer, Box> entry : this.packingBoxes.entrySet()) {
            Integer integer = entry.getKey();
            Box box = entry.getValue();
            totalVolume += (integer * (new QueryBox(box).getVolume()));
        }
        return totalVolume;
    }

    @Override
    public double getContainerSArea() {
        return this.queryBoxI.getSurfaceArea();
    }

    @Override
    public double getContainerVolume() {
        return this.queryBoxI.getVolume();
    }

    @Override
    public double getWastedSpace() {
        return (getContainerSArea()-getTotalPackingBoxSArea());
    }

    @Override
    public int getNumBoxes() {
        return packingBoxes.keySet().stream().mapToInt(integer -> integer).sum();
    }
}
