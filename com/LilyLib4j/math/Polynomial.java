package com.LilyLib4j.math;
import static java.lang.Math.sqrt;
public class Polynomial {

    public double[] quadratic(double a, double b, double c) {
        double discriminant = sqrt((b * b) - (4 * a * c));
        double[] evaluateQuadratic = {
                (-b + discriminant) / 2 * a,
                (-b - discriminant) / 2 * a
        };
        return evaluateQuadratic;
    }
}
