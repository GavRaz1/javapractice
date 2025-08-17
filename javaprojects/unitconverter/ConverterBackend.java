package javaprojects.unitconverter;

import java.util.Scanner;

public class ConverterBackend {
    static final String[] prefixes = {"tera", "giga", "mega", "kilo", "hecto", "deca", "meter", "deci", "centi", "milli", "micro", "nano", "pico"};
    private static enum metricUnits {
        TERAMETER,
        GIGAMETER,
        MEGAMETER,
        KILOMETER,
        HECTOMETER,
        DECAMETER,
        METER,
        DECIMETER,
        CENTIMETER,
        MILLIMETER,
        MICROMETER,
        NANOMETER,
        PICOMETER
    }
    
    static Scanner input;

    public ConverterBackend() {
        input = new Scanner(System.in);
    }

    public void greet() {
        System.out.println("TURN MILES INTO 13 DIFFERENT METRIC UNITS!!!!");
        System.out.println("AVAILABLE UNITS: \n TERAMETER, GIGAMETER, \n MEGAMETER, KILOMETER, \n HECTOMETER, DECAMETER, \n METER, \n DECIMETER, CENTIMETER, \n MILLIMETER, MICROMETER, \n NANOMETER, PICOMETER");
    }

    public void gatherData(Scanner input) {
        double miles;
        String unit;

        System.out.println("-------------------------------------------------------------");
        System.out.print("# OF MILES: ");
        miles = input.nextDouble();
        System.out.print("CONVERT UNIT: ");
        unit = input.nextLine();
    }

    private double convertToKM(double miles) {
        double output = miles * 1.6;
        return output;
    }
}
