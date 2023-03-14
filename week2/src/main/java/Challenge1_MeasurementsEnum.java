package main.java;

public enum Challenge1_MeasurementsEnum {
    MILLIMETER(0.000001),
    CENTIMETER(0.0001),

    METER(1.00);

final double length;

Challenge1_MeasurementsEnum(double length){
    this.length = length;
}



}
