import java.io.PrintStream;
import java.util.Objects;
import java.util.Random;

public class BankAccont {


    private double checkingBalance;
    private double savingBalance;

    private static int TOTAL_DEPOSITS;
    private static int NUM_OF_ACCOUNTS;


    BankAccont(){
        NUM_OF_ACCOUNTS++;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    private static int ACT_NUM;

    private static int randomAcct(){
        Random acctNum = new Random();
        System.out.println(Math.abs(acctNum.nextInt(1000000)));

        return acctNum.nextInt();
    }

    public int provideNumber(){
        return randomAcct();
    }

    public void deposit(double amount,String accType){
        if(Objects.equals(accType, "checking")){
            this.checkingBalance += amount;
        }
        else {
            this.savingBalance += amount;
        }
        TOTAL_DEPOSITS += amount;
    }
    public void withdraw(double amount, String accType){
        if(accType == "checking" && checkingBalance >= 0){
            this.checkingBalance -= amount;
        } else if(savingBalance >= amount){
            savingBalance -= amount;
        }
        TOTAL_DEPOSITS -= amount;
    }
    public void checkingBalances(){
         System.out.printf("%s %s", checkingBalance, savingBalance);
    }

    public String password(){
        return "Trey is cool";
    }

}
