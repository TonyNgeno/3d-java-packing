package com.tonyngeno.model;

import java.util.Objects;

public class Box extends Shape {

    public Box() {
    }

    public Box(double height, double width, double length) {
        super(height, width, length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return Double.compare(box.getHeight(), getHeight()) == 0 &&
                Double.compare(box.getWidth(), getWidth()) == 0 &&
                Double.compare(box.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength());
    }

    @Override
    public String toString() {
        return "Box Dimensions:{" +
                "Height=" + this.getHeight() +
                ", Width=" + this.getWidth() +
                ", Length=" + this.getLength() +
                '}';
    }
}
