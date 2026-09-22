import java.util.*;
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
        if (x > 0)
            res = true;
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
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("введите следующее число");
            b1 = scanner.nextInt();
            res = methoods.lastNumSum(a1, b1);
            System.out.println("это " + res);
            a1 = res;
        }
        return res;
    }
    public int lastNumSum(int a, int b) { // 10
        return a % 10 + b % 10;
    }

    //Задание 2 Условия

    //задача 2
    public double sub2_2(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число");
        b1 = scanner.nextInt();
        return methoods.safeDiv(a1, b1);
    }
    public double safeDiv (int x, int y){
        if (x==0 || y==0)
            return 0;
        else
            return x/y;
    }
    //задача 4
    public String sub2_4(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число");
        b1 = scanner.nextInt();
        return methoods.makeDecision(a1, b1);
    }
    public String makeDecision (int x, int y){
        String res;
        if (x > y)
            res = ">";
        else if (x == y)
            res = "=";
        else
            res = "<";
        return x + res + y;
    }
    //задача 6
    public boolean sub2_6(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1, c1;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число");
        b1 = scanner.nextInt();
        System.out.println("введите следующее число");
        c1 = scanner.nextInt();
        return methoods.sum3(a1, b1, c1);
    }
    public boolean sum3 (int x, int y, int z){
        if ((x + y) == z || (y + z) == x || (x + z ) == y){
            return true;
        }
        else
            return false;
    }
    //задача 8
    public String sub2_8(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1;
        System.out.println("введите следующее число");
        a1 = scanner.nextInt();
        return methoods.age(a1);
    }
    public String age (int x) {
        String res;
        res = x + "";
        if (x % 10 == 1 & x != 11)
             res += " год";
        else if ((x % 10) >= 5 & (x % 10) <= 9 || x % 10 == 0)
            res += " лет";
        else if ((x % 10) >= 2 & (x % 10) <= 4)
            res += " года";
        return res;
    }
    //задача 10
    public void sub2_10(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        String a1;
        System.out.println("введите следующее значение");
        a1 = scanner.next();
        methoods.printDays(a1);
    }
    public void printDays (String x){
        switch (x){
            case "понедельник": System.out.println("понедельник вторник среда четверг пятница суббота воскресенье"); break;
            case "вторник": System.out.println("вторник среда четверг пятница суббота воскресенье"); break;
            case "среда": System.out.println("среда четверг пятница суббота воскресенье"); break;
            case "четверг": System.out.println("четверг пятница суббота воскресенье"); break;
            case "пятница": System.out.println("пятница суббота воскресенье"); break;
            case "суббота": System.out.println("суббота воскресенье"); break;
            case "воскресенье": System.out.println("воскресенье"); break;
            default: System.out.println("это не день недели"); break;
        }
    }

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
