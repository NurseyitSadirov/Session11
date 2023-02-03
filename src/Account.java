public class Account {
    String name;
    double balance = 1000;

    public double deposit(double summa) {
        System.out.println(name + " \nBalanska kosho turgan  akcha: " + summa);
        summa = (summa + balance);
        return summa;
    }

    public double withdrawal(double balanc) {
        System.out.println(name + "\nBalanstan ala turgan akcha: " + balanc);
        balanc -= balance;
        return balanc;
    }
}
