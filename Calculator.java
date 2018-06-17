package com.company;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner (System.in);
    private float a = 0;
    private float b = 0;


    public void count() {

        boolean exit = false;
        System.out.println("Witaj w kalkulatorze!\n" +
                          "Podaj pierwsza liczbe:");
        this.a = sc.nextFloat();
        System.out.println("Podaj druga liczbe: ");
        this.b = sc.nextFloat();

        boolean secondOperation = false;
        System.out.println("Teraz wybierz opcje z podanych: ");
        options();

        do{
            String option = sc.next().toLowerCase();
            if (option.length() !=3)
                System.out.println("Nieodpowiednia dlugosc (wpisz np. add)");

            switch(option) {
                case "add": add(a,b);
                            secondOperation = true;
                            break;
                case "sub": sub(a,b);
                            secondOperation = true;
                            break;
                case "div": div(a,b);
                            secondOperation = true;
                break;
                case "mul": multi(a,b);
                            secondOperation = true;
                break;
                case "mod": mod(a,b);
                            secondOperation = true;
                break;
                case "res": reset(0f, 0f);
                            secondOperation = true;
                break;
                case "ext": exit = true;
                break;
            }
        } while (!exit);
        if (secondOperation) {
            this.b = 0;
            System.out.println("Podaj druga liczbe: ");
            this.b = sc.nextFloat();
        }
    }

    private void reset(float a, float b) {
        this.a = a;
        this.b = b;

    }
    private void options() {
        System.out.println("add - dodaj\n" +
                "sub - odejmnij\n" +
                "div - podziel\n" +
                "mul - pomnoz\n" +
                "mod - modulo\n" +
                "res - reset\n");
    }
    private void add(float a, float b) {
        a += b;
        System.out.println("Wynik to: " + a);
    }
    private void sub(float a, float b) {
        a -= b;
        System.out.println("Wynik to: " + a);
    }
    private void div(float a, float b) {
        a /= b;
        System.out.println("Wynik to: " + a);
    }
    private void multi(float a, float b) {
        a = a * b;
        System.out.println("Wynik to: " + a);
    }
    private void mod(float a, float b) {
        a = a % b;
        System.out.println("Wynik to: " + a);
    }

}
