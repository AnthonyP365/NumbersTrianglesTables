package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int x = 1; x <= i; x++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < numberOfStars) {
            sb.append("*");
            i++;
        }
        return sb.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int x = 1; x <= i; x++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int x = 1; x <= i; x++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

