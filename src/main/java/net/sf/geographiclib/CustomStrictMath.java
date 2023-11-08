/*
 * Copyright (c) 2023 T-Systems International GmbH
 * and licensed under the MIT/X11 License.
 */
package net.sf.geographiclib;

/**
 * Redefines methods from StrictMath, which have varying results across
 * different JVMs.
 */
public class CustomStrictMath {

    /**
     * The {@code double} value that is closer than any other to <i>pi</i> (&pi;),
     * the ratio of the circumference of a circle to its diameter.
     */
    public static final double PI = 3.141592653589793;

    /**
     * Convert from degrees to radians. The formula for this is radians = degrees *
     * (pi/180); however it is not always exact given the limitations of floating
     * point numbers.
     *
     * @param degrees
     *            an angle in degrees
     * @return the angle in radians
     */
    public static double toRadians(double degrees) {
        return (degrees * PI) / 180;
    }

    /**
     * Converts an angle measured in radians to an approximately equivalent angle
     * measured in degrees. The conversion from radians to degrees is generally
     * inexact; users should <i>not</i> expect {@code cos(toRadians(90.0))} to
     * exactly equal {@code 0.0}.
     *
     * @param angrad
     *            an angle, in radians
     * @return the measurement of the angle {@code angrad} in degrees.
     * @since 1.2
     */
    public static double toDegrees(double angrad) {
        return (180 / PI) * angrad;
    }

}
