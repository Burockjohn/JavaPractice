package day35_PracticeTasks.bankAccountTask;

public class Test {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Burak", 12345678);

        account1.deposit(1000);
        account1.withdraw(500);

        System.out.println(account1.getBalance());
        System.out.println(account1);

    }
}
