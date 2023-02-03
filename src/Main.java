import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Account account1 = new Account();
        Account account2 = new Account();

    }

    public void method() {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while(true) {
        System.out.println(account.name = "Sadirov Nurseyit");
        System.out.println();
        System.out.println("""
                1.Kartadagy akchanyzdy korgynyz kelse
                2.Akcha koshkunuz kelse
                3.Kancha akcha alasyz""");
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> System.out.println("Sizdin balance: " + account.balance);
            case 2 -> System.out.println("\nBalanska kodhulgandan kiyinki akcha: " + account.deposit(scanner1.nextInt()));
            case 3 -> System.out.println("Balanstan alyngandan kiyinki akcha: " + account.withdrawal(scanner1.nextInt()));
        }
    }
   }
    public void method1() {
        Account account1 = new Account();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println(account1.name = "Sadirov Nurseyit");
            System.out.println();
            System.out.println("""
                    1.Kartadagy akchanyzdy korgynyz kelse
                    2.Akcha koshkunuz kelse
                    3.Kancha akcha alasyz""");
            int a = scanner1.nextInt();
            switch (a) {
                case 1 -> System.out.println("Sizdin balance: " + account1.balance);
                case 2 -> System.out.println("\nBalanska kodhulgandan kiyinki akcha: " + account1.deposit(scanner2.nextInt()));
                case 3 -> System.out.println("Balanstan alyngandan kiyinki akcha: " + account1.withdrawal(scanner2.nextInt()));
            }
        }
    }
    public void method2() {
        Account account2 = new Account();
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        while (true) {
            System.out.println(account2.name = "Sadirov Nurseyit");
            System.out.println();
            System.out.println("""
                    1.Kartadagy akchanyzdy korgynyz kelse
                    2.Akcha koshkunuz kelse
                    3.Kancha akcha alasyz""");
            int a = scanner3.nextInt();
            switch (a) {
                case 1 -> System.out.println("Sizdin balance: " + account2.balance);
                case 2 -> System.out.println("\nBalanska kodhulgandan kiyinki akcha: " + account2.deposit(scanner4.nextInt()));
                case 3 -> System.out.println("Balanstan alyngandan kiyinki akcha: " + account2.withdrawal(scanner4.nextInt()));
            }
        }
    }
 }

