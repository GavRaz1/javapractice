package javaprojects.unitconverter;

import java.util.Scanner;

public class ConverterBackend {
    public static Scanner input;
    public static double miles;
    public static String unit;

    public static void main(String[] args) {
        greet();
        gatherData();
    }

    public static void greet() {
        System.out.println("TURN MILES INTO 13 DIFFERENT METRIC UNITS!!!!");
        System.out.println("AVAILABLE UNITS: \n TERAMETER, GIGAMETER, \n MEGAMETER, KILOMETER, \n HECTOMETER, DECAMETER, \n METER, \n DECIMETER, CENTIMETER, \n MILLIMETER, MICROMETER, \n NANOMETER, PICOMETER");
        System.out.println("TYPE IN YOUR COUNT OF MILES (CAN BE DECIMAL) AND THE **PREFIX** OF THE DESIRED UNIT, E.G 'tera' for terameter | [FOR METER JUST TYPE THE WORD]");
    }

    public static void gatherData() {
        System.out.println("-------------------------------------------------------------");
        System.out.print("# OF MILES: ");
        miles = input.nextDouble();
        System.out.print("CONVERT UNIT: ");
        unit = input.nextLine();
    }

    public void convert(double miles, String unit) {
        double output = convertToMeters(miles);
        String selectedUnit = unit.toLowerCase();

        switch (selectedUnit) {
            case "tera":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/1000000000000.0+" TERAMETER(S)");
                break;
            case "giga":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/1000000000.0+" GIGAMETER(S)");
                break;
            case "mega":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/1000000.0+" MEGAMETER(S)");
                break;
            case "kilo":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/1000.0+" KILOMETER(S)");
                break;
            case "hecto":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/100.0+" HECTOMETER(S)");
                break;
            case "deca":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/10.0+" DECAMETER(S)");
                break;
            case "meter":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output+" METER(S)");
                break;
            case "deci":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.1+" DECIMETER(S)");
                break;
            case "centi":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.01+" CENTIMETER(S)");
                break;
            case "milli":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.001+" MILLIMETER(S)");
                break;
            case "micro":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.000001+" MICROMETER(S)");
                break;
            case "nano":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.000000001+" NANOMETER(S)");
                break;
            case "pico":
                System.out.println("-------------------------------------------------------------");
                System.out.println(output/0.000000000001+" PICOMETER(S)");
                break;
            default:
                break;
        }
    }

    double convertToMeters(double miles) {
        double meters = miles * 1609;
        return meters;
    }
}
