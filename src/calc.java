import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int n1;
        int n2;
        int option;
        int ex;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choice : ");
            System.out.println("1. Add, 2. Sub, 3. Exit");
            option = sc.nextInt();

            if (option != 3) {
                System.out.println("First number : ");
                n1 = sc.nextInt();
                System.out.println("Second number : ");
                n2 = sc.nextInt();
            } else {
                break;
            }
            switch (option) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println("Continue Y/N : ");
            String input = sc.nextLine();
        } while (true);
    }
}