package com.company;

public class Main {
///task1
    public static void main(String[] args) {
	byte type1 = 126;
        System.out.println(type1);
        short type2 = 10000;
        System.out.println(type2);
        int type3 = 777;
        System.out.println(type3);
        long type4 = 1867L;
        System.out.println(type4);
        float type5 = 16.5F;
        System.out.println(type5);
        double type6 = 18.5;
        System.out.println(type6);
    }
}
////Task2
class Task2 {
    public static void main(String[] args) {
        float boxer1 = 78.2F;
        float boxer2 = 82.7F;
        float sumWeight = boxer1 + boxer2;
        float diffWeight = boxer2 - boxer1;
        System.out.println("Общий вес бойцов " + sumWeight + " кг.");
        System.out.println("Разница между весами бойцов " + diffWeight + " кг.");
    }
}
////Task3
class Task3 {
    public static void main(String[] args) {
int banana = 80;
int milk = 105;
int iceCream = 100;
int egg = 70;
float totalWeight = banana*5 + milk*2 + iceCream*2 + egg*4;
float totalKilo = totalWeight/1000;
        System.out.println("Общий вес в граммах " + totalWeight + " г.");
        System.out.println("Общий вес в килограммах " + totalKilo + " кг.");

    }
}
////Task4
class Task4 {
    public static void main(String[] args) {
        int loseWeight = 7000;
        int days1 = loseWeight / 500;
        int days2 = loseWeight / 250;
        int daysAvg = (days1 + days2) / 2;
        System.out.println("Уйдет " + days1 + " дней, если спортсмен будет терять по 500 г.");
        System.out.println("Уйдет " + days2 + " дней, если спортсмен будет терять по 250 г.");
        System.out.println(daysAvg + " дней уйдет в среднем");
    }
}
