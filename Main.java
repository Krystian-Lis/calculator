package com.company;

import java.util.*;
//:object/Documentation1.java
/** Komentarz odnośnie klasy */

public class Main {
    /** Komentarz dotyczący składowej */


    /** Komentarz dotyczący metody */
    public static void main(String[] args) {
        /*
        ArrayList <Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Falafel", "GoldenRetriever"));
        dogList.add(new Dog("Buffy", "Labrador"));
        System.out.println(dogList.toString());

        long i1 = 0x2fL;
        long i2 = 0177L;
        System.out.println(i1 + ", " + i2);
        float expFloat = 1.39e-43F;
        System.out.println(expFloat);
        expFloat = 1.39E-43f;//1.39 * 10 do -43potegi
        System.out.println(expFloat);
        double expDouble = 47e47d;// 47 * 10 do 47 potegi
        double expDouble2 = 47e47;
        System.out.println(expDouble);
        System.out.println(expDouble2);
        int i = -1;
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        int a = 11;
        System.out.println(ternary(a));
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("Math.round(above): "+ Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));

        int ne = 10;
        char c = (char)ne;
        System.out.println(c);
        int big = Integer.MAX_VALUE;
        int small = Integer.MIN_VALUE;
        float fbig = Float.MAX_VALUE;
        float fsmall = Float.MIN_VALUE;
        System.out.println("Int min: " + small + "\nInt max: " + big

                + "\nFloat min: " + fsmall + "\nFloat max: " + fbig);
        int g = 7, h= 8;
        System.out.println(test(g, h));
        for(int j=0; j<100; j++){
            if(j==74) break;
            if(j%9 != 0) continue;
            System.out.println(j + " ");
        }
        int j = 10;
        while(true) {
            j++;
            j = j*10;
            if(j == 1110) break;
            System.out.println(j);

        }
        */


        Calculator calc = new Calculator();
        calc.count();

    }
    static int test(int testval, int target) {
        if(testval > target)
            return +1;
        if(testval < target)
            return -1;
        return 0;
    }
    static int ternary(int i) {
        return i < 10 ? i*100 : i*10;
        /* If i<10 i *100 , if i>= 10 i *10 */
    }
} ///:~


