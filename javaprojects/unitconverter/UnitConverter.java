package javaprojects.unitconverter;

public class UnitConverter {
    static ConverterBackend converter;

    public static void main() {
        converter = new ConverterBackend();
        converter.greet();
    }
}
