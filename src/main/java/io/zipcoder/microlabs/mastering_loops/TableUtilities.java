package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sB = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= 5; a++) {
                int num = i*a;
               if (num < 10) {
                   sB.append("  " + num + " ").append("|");
               } else if (num >= 10) {
                   sB.append(" " + num + " ").append("|");
               }
            }
            sB.append("\n");
        }
        return sB.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sB = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                int num = i*a;
                if (num < 10) {
                    sB.append("  " + num + " " + "|");
                } else if (num >= 10 && num < 100) {
                    sB.append(" " + num + " " + "|");
                } else {
                    sB.append("" + num + " " + "|");
                }
            }
            sB.append("\n");
        }
        return sB.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sB = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            for (int a = 1; a <= 20; a++) {
                int num = i*a;
                if (num < 10) {
                    sB.append("  " + num + " " + "|");
                } else if (num >= 10 && num < 100) {
                    sB.append(" " + num + " " + "|");
                } else if (num >= 100) {
                    sB.append("" + num + " " + "|");
                }
            }
            sB.append("\n");
        }
        return sB.toString();
    }
}
