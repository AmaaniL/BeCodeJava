package main.java;

public enum Measurements {
    MILLIMETER(0.000001),
    CENTIMETER(0.0001),

    METER(1.00);

final double length;

Measurements (double length){
    this.length = length;
}

}
