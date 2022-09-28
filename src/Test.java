public class Test {
    public static void main(String [] args){
        BankAccont myBank = new BankAccont();
                myBank.deposit(1000, "checking");
                myBank.checkingBalances();
                myBank.withdraw(500,"checking");
                myBank.checkingBalances();
                double cbal = myBank.getCheckingBalance();
                double sbal = myBank.getSavingBalance();
                System.out.println(cbal);
                System.out.println(sbal);
                myBank.provideNumber();
               String password = myBank.password();
        System.out.println(password);

    }
}
