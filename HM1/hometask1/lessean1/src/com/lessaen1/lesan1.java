package com.lessaen1;

public class lesan1 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b + 23;
        byte c = 12;
        short e = 200;
        long myLongValue = 455_445_343L;

        float myFloatValue = 2.345f;
        double myDobleValue = 32.44355d;
        double floatResult = myFloatValue / 3;

        double sum = a + b + c + myDobleValue + myDobleValue + myDobleValue;

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '\u00A9';
        System.out.println("Characters");
        System.out.println("char1= " + char1);
        System.out.println("cha2= " + char2);
        System.out.println("cha3= " + char3);
        System.out.println("cha4= " + char4);
        System.out.println(char1+char2+char3+char4);

        System.out.println("mydubleresult" + myDobleValue * 3);
        System.out.println("myfloatresult =" + floatResult);
        System.out.println("byte b= " + b);
        System.out.println("int a= " + a);
        System.out.println("short  e= " + c);
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("my DoubleValue =" + myDobleValue);
        System.out.println("sum =" + sum);
    }
}
