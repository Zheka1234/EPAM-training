package com.company;

import java.util.Scanner;
import java.math.*;

public class Unit1 {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
        Exercise7();
        Exercise8();
        Exercise9();
        Exercise10();
        Exercise11();
        Exercise12();
        Exercise13();
        Exercise14();
        Exercise15();
        Exercise16();
        Exercise17();
        Exercise18();
        Exercise19();


    }
    private static void Exercise1(){
        System.out.println("Найдите значение функции: z = ( (a – 3 ) * b / 2) + c");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = in.nextDouble();
        System.out.print("Enter b number: ");
        double b = in.nextDouble();
        System.out.print("Enter c number: ");
        double c = in.nextDouble();
        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.printf("Solution: %.2f\n ", z);
        System.out.println();
    }
    private static void Exercise2() {
        System.out.print("Вычислить значение выражения по формуле (все переменные принимают действительные значения)\n ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = in.nextDouble();
        System.out.print("Enter b number: ");
        double b = in.nextDouble();
        System.out.print("Enter c number: ");
        double c = in.nextDouble();
        double y, d;
        d = b * b + 4 * a * c;
        y = (b + Math.sqrt(d)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("Solution: %.2f\n ", y);
        System.out.println();
    }
    private static void Exercise3() {
        System.out.print("Вычислить значение выражения по формуле (все переменные принимают действительные значения)\n ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x number: ");
        double x = in.nextDouble();
        System.out.print("Enter y number: ");
        double y = in.nextDouble();
        double xRad = x * Math.PI / 180;
        double yRad = y + Math.PI / 180;
        double a;
        a = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);
        System.out.printf("Solution: %.2f\n ", a);
        System.out.println();
    }
    private static void Exercise4() {
        System.out.print("Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).Поменять местами \n" +
                "дробную и целую части числа и вывести полученное значение числа.\n");
        double r = 456.123;
        double x = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println("r = 456.123");
        System.out.println(x);
        System.out.println();
    }
    private static void Exercise5() {
        System.out.print("Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести \n" +
                "данное значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc.\n");
        int t = 100000;
        int hours = (t / 3600);
        int x = t - (hours * 3600);
        int minutes = x / 60;
        int seconds = x - (minutes * 60);
        System.out.println("T = 100000");
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    private static void Exercise6() {
        System.out.println("Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) \n" +
                "принадлежит закрашенной области, и false — в противном случае:");
        System.out.println("Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x number: ");
        double x = in.nextDouble();
        System.out.print("Enter y number: ");
        double y = in.nextDouble();

        if (y + Math.abs(x) <= 4 && y >= 0){
            System.out.print("True: ");
            System.out.println("The point with coordinates(" + x + ", " + y + ") belongs behind the painted area");
        }
        else{
            System.out.print("False: ");
            System.out.println("The point with coordinates(" + x + ", " + y + ") does not belong to the painted area");
        }
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.print("True: ");
            System.out.println("The point with coordinates (" + x + ", " + y + ") belongs behind the painted area");
        }
        else{
            System.out.print("False: ");
            System.out.println("The point with coordinates(" + x + ", " + y + ")does not belong to the painted area");
        }
        if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 24) && y <= 0 && x >= 0)){
            System.out.print("True: ");
            System.out.println("The point with coordinates (" + x + ", " + y + ") belongs behind the painted area");
        }
        else{
            System.out.print("False: ");
            System.out.println("The point with coordinates(" + x + ", " + y + ") does not belong to the painted area");
        }

    }
    private static void Exercise7() {
        System.out.println("Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли \\n\" +\n" +
                "                \"он прямоугольным.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter angle a: ");
        double a = in.nextDouble();
        System.out.print("Enter angle b: ");
        double b = in.nextDouble();

        if (a + b > 180){
            System.out.println("No such triangle exists");
        }

        if (a + b < 180) {
            System.out.println("Such a triangle exists");
            if (((a + b == 90) || (a == 90)) || (b == 90)) {
                System.out.println("Has a right angle");
            }
        }
        else
            System.out.println("No right angle");
    }
    private static void Exercise8() {
        System.out.println("Найти max{min(a, b), min(c, d)}");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter b number: ");
        int b = in.nextInt();
        System.out.print("Enter c number: ");
        int c = in.nextInt();
        System.out.print("Enter d number: ");
        int d = in.nextInt();
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
    private static void Exercise9() {
        System.out.println("Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1 number: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1 number: ");
        double y1 = in.nextDouble();
        System.out.print("Enter x2 number: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2 number: ");
        double y2 = in.nextDouble();
        System.out.print("Enter x3 number: ");
        double x3 = in.nextDouble();
        System.out.print("Enter y3 number: ");
        double y3 = in.nextDouble();
        double s = 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        System.out.println(s);

        if (s == 0){
            System.out.println("Points lie on the same line ");
        }
        else
            System.out.println("Points do not lie on the same line ");
    }
    private static void Exercise10() {
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через \n" +
                "отверстие.\n");
        Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 8;
        System.out.print("Enter x number: ");
        double x = in.nextDouble();
        System.out.print("Enter y number: ");
        double y = in.nextDouble();
        System.out.print("Enter z number: ");
        double z = in.nextDouble();

        if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && x <= b || z <= a && y <= b || y <= a && z <= b){
            System.out.println("Will pass");
        }
        else
            System.out.println("Won't pass");
    }
    private static void Exercise11() {
        System.out.println(" Вычислить значение функции:");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x number: ");
        int x = in.nextInt();

        double a;
        if (x <= 3){
            a = Math.pow(x, 2) - 3 * x + 9;
        }
        else
            a = 1 / (Math.pow(x, 3) + 6);
        System.out.println(a);
    }
    private static void Exercise12() {
        System.out.println(" Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует \n" +
                "все числа от 1 до введенного пользователем числа.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int a = in.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= a){
            sum += i;
            i++;
        }
        System.out.println("Result" + sum);
    }
    private static void Exercise13() {
        System.out.println("Вычислить значения функции на отрезке [а,b] c шагом h");
        int a = -10;
        int b = 14;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }

    }
    private static void Exercise14() {
        System.out.println("Найти сумму квадратов первых ста чисел.");
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("Sum " + sum);
    }
    private static void Exercise15() {
        System.out.println("Составить программу нахождения произведения квадратов первых двухсот чисел.\n");
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Product of squares" +s);
    }
    private static void Exercise16() {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        double e = 0.01;
        double a = 0;
        int n = 1;
        double result = 0;

        do {
            if (n != 0) {
                a = Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            }
            result += a;
            n++;
        }
        while (a >= e);
        System.out.println(result);
    }
    private static void Exercise17() {
        System.out.println("Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        for (int i = 32; i <= 200; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
    private static void Exercise18() {
        System.out.println("В Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. \n" +
                "m и n вводятся с клавиатуры");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m number: ");
        int m = in.nextInt();
        System.out.print("Enter n number: ");
        int n = in.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print(i + " dividers: ");
            for (int j = m - 1; j > 1; j--) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }
    }
    private static void Exercise19() {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter а: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}
