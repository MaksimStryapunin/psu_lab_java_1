import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        methoods methoods = new methoods();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Выберите задание(1/2/3/4)");
        System.out.print(": ");
        int choose_task = scanner.nextInt();
        switch (choose_task) {
            case 1: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {
                        methoods.sub1_2();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 4: {
                        methoods.sub1_4();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 6: {
                        methoods.sub1_6();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 8: {
                        methoods.sub1_8();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 10: {
                        methoods.sub1_10();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }
            case 2: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 4: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 6: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 8: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 10: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }
            case 3: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 4: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 6: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 8: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 10: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }
            case 4: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 4: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 6: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 8: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    case 10: {

                        System.out.println("-----------------------------------------------------------------------------------------");
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }
        }
    }
}