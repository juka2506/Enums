package com.company;

public enum MathematicalConstants {

    PI(3.1415926535),
    PYTHAGORAS(1.4142135623),
    THEODORUS(1.7320508075),
    GOLDEN_RATIO(1.6180339887),
    WALLIS(2.0945514815);

    private final double value;

    MathematicalConstants(double value) {
        this.value = value;
    }
}
