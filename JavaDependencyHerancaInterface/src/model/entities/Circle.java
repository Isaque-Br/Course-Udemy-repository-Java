package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
