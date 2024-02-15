package com.Jittipon.songtrai.helpers;

public class DistanceConverter {
    public static double kmToMiles(double km) {
        double miles = km / 1.6;
        return miles;
    }

    public double milesToKm(double miles) {
        return miles*1.6;
    }
}
