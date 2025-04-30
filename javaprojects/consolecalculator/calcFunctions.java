package javaprojects.consolecalculator;

public class calcFunctions {
    public int a;
    public int b;
    public int c;

    public void add(int a, int b, int c) {
        c = c+(a+b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }

    public void sub(int a, int b, int c) {
        c = c+(a-b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }


    public void mul(int a, int b, int c) {
        c = c+(a*b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }

    public void div(int a, int b, int c) {
        c = c+(a/b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }
}
