public class main {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountNumber = 1;
        account.balance = 50;
        account.deposit();
        account.withdraw();
        System.out.println(account.toString());

        Checking checking = new Checking();
        checking.accountNumber = 2;
        checking.balance = 50;
        checking.deposit();
        checking.withdraw();
        System.out.println(checking.toString());

        Saving saving = new Saving();
        saving.accountNumber = 3;
        saving.balance = 50;
        saving.deposit();
        saving.withdraw();
        System.out.println(saving.toString());
    }
}