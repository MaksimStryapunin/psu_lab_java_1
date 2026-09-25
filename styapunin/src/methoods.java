import java.util.*;
import java.util.function.*;
import java.util.Scanner;
import java.util.Random;

public class methoods {
    //Задание 1 Методы
    
    // задача 2
    public int sub1_2() {
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, res = 0;
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число:");
        b1 = scanner.nextInt();
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее число:");
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
        System.out.println("введите следующее значение:");
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
            default: System.err.println("это не день недели"); break;
        }
    }

    //Задание 3 Циклы

    //задача 2
    public void sub3_2(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1;
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println(methoods.reverseListNums(a1));
    }
    public String reverseListNums(int x) {
        String res = "";
        if (x > 0) {
            while (x != -1) {
                res += (x + " ");
                x--;
            }
        } else if (x < 0){
            while (x != 1) {
                res += (x + " ");
                x++;
            }
        } else
            res = "0";
        return res;
    }
    //задача 4
    public void sub3_4(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1, b1;
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println("введите следующее число:");
        b1 = scanner.nextInt();
        System.out.println(methoods.pow(a1, b1));
    }
    public int pow (int x, int y){
        int res = 1;
        for (int i = 0; i < y; i++){
            res *= x;
        }
        return res;
    }
    //задача 6
    public void sub3_6(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1;
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        System.out.println(methoods.equalNum(a1));
    }
    public boolean equalNum (int x){
        int a = x % 10;
        while (x != 0) {
            if (x % 10 != a) return false;
            x /= 10;
        }
        return true;
    }
    //задача 8
    public void sub3_8(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int a1;
        System.out.println("введите следующее число:");
        a1 = scanner.nextInt();
        methoods.leftTriangle(a1);
    }
    public void leftTriangle (int x){
        if (x < 0) {
            System.err.println("некорректное число");
        }else {
            int a = 1;
            while (a <= x) {
                for (int i = 0; i < a; i++)
                    System.out.print("*");
                a++;
                System.out.println();
            }
        }
    }
    //задача 10
    public void sub3_10(){
        methoods methoods = new methoods();
        methoods.guessGame();
    }
    public String sub_to_counter(int x){
        if (x%10 == 1 && x%100 != 11) {
            return "попытку";
        } else if (x%10 >= 2 && x%10 <= 4 && (x%100 < 10 || x%100 >= 20)) {
            return "попытки";
        } else {
            return "попыток";
        }
    }
    public void guessGame(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a, counter = 0;
        a = random.nextInt(10);
        System.out.println("Введите число от 0 до 9:");
        while (true) {
            int user_a = scanner.nextInt();
            counter++;
            if (user_a == a) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + counter + " " + sub_to_counter(counter));
                break;
            } else
                System.out.print("Вы не угадали, введите число от 0 до 9: ");
        }

    }

    //Задание 4 Массивы
    //вспомогательная функция для заполнения массивов в задании 4
    private static int[] fill_arrow(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choose1 = 0;
        int[] arr = null;
        System.out.println("выберете способ заполнения массива (1 - случайный / 2 - вручную / 3 - [1 2 3 4 5]):");
        choose1 = scanner.nextInt();
        while (choose1 < 1 || choose1 > 3) {
            System.out.println("нет такой опции, повторите:");
            choose1 = scanner.nextInt();
        }
        switch (choose1){
            case 1: {
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();
                arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextInt(10);
                }
                for (int i : arr){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            }
            case 2: {
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();
                arr = new int[size];
                System.out.println("Введите " + size + " элементов:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
            }
            case 3: {
                arr = new int[]{1, 2, 3, 4, 5};
                break;
            }
            default: {
                System.err.println("нет такой опции");
                arr = fill_arrow();
                break;
            }
        }
        return arr;
    }

    //задача 2
    public void sub4_2() {
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int x, res;
        int[] arr = null;
        arr = methoods.fill_arrow();
        System.out.println("введите следующее число(x): ");
        x = scanner.nextInt();
        res = methoods.findLast(arr, x);
        System.out.println(res);
    }
    public int findLast (int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    //задача 4
    public void sub4_4(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int x, pos;
        int[] arr = null;
        arr = methoods.fill_arrow();
        System.out.println("Введите позицию: ");
        pos = scanner.nextInt();
        System.out.println("Введите элемент: ");
        x = scanner.nextInt();
        arr = methoods.add(arr, x, pos);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public int[]add (int[] arr, int x, int pos){
        if (pos < 0 || pos > arr.length) {
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    //задача 6
    public void sub4_6(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int x, res;
        int[] arr = null;
        arr = methoods.fill_arrow();
        methoods.reverse(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public void reverse (int[] arr){
        int[] arr1 = new int[arr.length];
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[temp] = arr[i];
            temp++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
        System.out.println();
    }
    //задача 8
    public void sub4_8(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int x, res;
        int[] arr = null, arr1 = null, arr2 = null;
        System.out.println("первый массив(arr1)");
        arr1 = methoods.fill_arrow();
        System.out.println("второй массив(arr2)");
        arr2 = methoods.fill_arrow();
        arr = methoods.concat(arr1, arr2);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public int[] concat (int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }
        return result;
    }
    //задача 10
    public void sub4_10(){
        methoods methoods = new methoods();
        Scanner scanner = new Scanner(System.in);
        int x, res;
        int[] arr = null;
        arr = methoods.fill_arrow();
        arr = methoods.deleteNegative(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            }
        }
        int[] arr1 = new int[count];
        int i = 0;
        for (int j : arr) {
            if (j >= 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}
