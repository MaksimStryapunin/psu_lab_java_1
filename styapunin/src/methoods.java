import java.util.*;
import java.util.Random;
import java.util.function.*;
import java.util.Scanner;

public class methoods {
    //Задание 1 Методы
    
    // задача 2
    public int sub1_2() {
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, res = 0;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        res += methoods.sumLastNums(a1);
        return res;
    }
    public int sumLastNums(int x) { // 2
        int a, b;
        a = x % 10;
        b = (x % 100) / 10;
        return a + b;
    }
    //задача 4
    public boolean sub1_4(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1;
        boolean res;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        res = methoods.isPositive(a1);
        return res;
    }
    public boolean isPositive(int x) { // 4
        boolean res = false;
        if (x > 0) {
            res = true;
        }
        return res;
    }
    //задача 6
    public boolean sub1_6(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        char a1 = scanner.next().charAt(0);
        boolean res;
        System.out.println("введите следующее число");
        res = methoods.isUpperCase(a1);
        return res;
    }
    public boolean isUpperCase(char x) { // 6
        if (x >= 'A' && x <= 'Z')
            return true;
        else return false;
    }
    //задача 8
    public boolean sub1_8(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1;
        boolean res;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число");
        b1 = scanner.nextInt();
        res = methoods.isDivisor(a1, b1);
        return res;
    }
    public boolean isDivisor(int a, int b) { // 8
        if (a % b == 0 || b % a == 0)
            return true;
        else return false;
    }
    //задача 10
    public int sub1_10(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1, res = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("введите следующее число");
            a1 = scanner.nextInt();
            System.out.println("введите следующее число");
            b1 = scanner.nextInt();
            res += methoods.lastNumSum(a1, b1);
            a1 = 0;
            b1 = 0;
        }
        return res;
    }
    public int lastNumSum(int a, int b) { // 10
        return a % 10 + b % 10;
    }

    //Задание 2

    //задача 2

    //задача 4

    //задача 6

    //задача 8

    //задача 10


    //Задание 3

    //задача 2

    //задача 4

    //задача 6

    //задача 8

    //задача 10


    //Задание 4

    //задача 2

    //задача 4

    //задача 6

    //задача 8

    //задача 10
}
