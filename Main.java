package ru.Geekbrains.Java_lesson_1_dz;

public class Main {

    public static void main(String[] args) {
        byte z = 25;
        short x = 20;
        int a = 5;
        int b = 10;
        int c = 400;
        int d = 30;
        long e = 900197;
        float f = 1512.32f;
        double g = 21.2434235;
        char ch = 'M';
        boolean bool = false;
        String str = "Сюда пишем строки";
        String str1 = "Dima";
        System.out.println(nomer3(a, b, c, d));
        System.out.println(nomer4(a, b));
        System.out.println(nomer5(a));
        System.out.println(nomer6(a));
        System.out.println(nomer7(str1));
    }


    public static double nomer3(int a, int b, double c, double d) {
        System.out.println("Пункт №3 ДЗ");
        double e = a * (b + (c / d));
        return e;
    }

    public static boolean nomer4(int a, int b) {
        System.out.println("Пункт №4 ДЗ");
        int v = a + b;
        return (v >= 10 && v <= 20);
    }

    public static int nomer5(int a) {
        System.out.println("Пункт №5 ДЗ");
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
        return a;
    }

    public static boolean nomer6(int a) {
        System.out.println("Пункт №6 ДЗ");
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static String nomer7(String str1) {
        System.out.println("Привет, " + str1 + "!");
        return str1;
    }
}