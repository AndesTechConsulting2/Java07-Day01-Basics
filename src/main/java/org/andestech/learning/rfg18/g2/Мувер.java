package org.andestech.learning.rfg18.g2;

public class Мувер {

    public static void main( String[] args )
    {


    // types
    // целые

    // byte

    byte b1; b1 = 127;

    byte b2 = -128;

    byte b3 = (byte)(b1+1);

    byte b4 = (byte)0b1111_1101;

    System.out.println("b3=" + b3);
    System.out.println("b4=" + b4);

    // short
    short sh1 = 21312;
        System.out.println((1<<15) - 1 );
        System.out.println(-(1<<15) );

        System.out.println(Short.MAX_VALUE);

    // int

    int i1 = 100;

        System.out.println(Integer.MAX_VALUE);
        System.out.println((1<<31) -1 );

    int i2 = 0xFFFF_10AD;
    int i3 = 0173565;
    int j1 = 1_234_324_343;
        System.out.println(i2);
        System.out.println( Integer.toHexString(j1) );

    // long

    long L1 = Long.MAX_VALUE - 1;
    System.out.println(Math.log10(L1));

    long L2 = 23983453453453L;

    // char

        System.out.println((int)Character.MAX_VALUE);


    // operations

    int in1 = 0b1001_1101;
    int in2 = 0b1110_1001;

    int in3 = in1 & in2;
        in3 = in1 | in2;
        in3 = (in1 ^ in2) ^ in2;
        in3 = ~in1;

        System.out.println(Integer.toBinaryString(in3));


    // floats


    float f1 = 0.1234567890123456789f;
        System.out.println(f1);

        System.out.println( Math.log10(1<<24)  );

    f1 = 1e4f + 0.01f;
        System.out.println(f1);
        System.out.println( 1.001f + 2.001f - 3.002f  );


    // double

    double d1 = 1.234567890123456789e200;
    System.out.println(d1);


    // char (продолжение)

    char ch2 = 'A';

    System.out.println((char)(ch2+1));
    System.out.println('\u0042');

    // boolean

    int i10 = 0;


    boolean bool1 = true, bool2 = i10!=0;

    boolean bool3 = (1!=2);

    System.out.println(bool3 || bool1 || bool2);
    System.out.println(bool2 && bool1 && bool3);


    String st1 = "test string";

    }
}
