/*Develop a class BankAccount having following data members : (10 Marks)
        int accno
        double balance
        Write appropriate constructors to initialize data members
        Define the following functions :
        withdraw : balance will reduce
        deposit : balance will increase
        show : display accno and balance
        If user tries to withdraw more than the balance, use exception handling code. Demonstrate the
        concept of exception handling in main() function.
        */
import java.util.Scanner;
public class BankAccount {
    int accNo;
    double balance;

    public BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void withdraw() {
        System.out.println("balance will reduce");
    }

    void deposit() {
        System.out.println("balance will increase");
    }

    void show() {
        System.out.println("Account Number :" + accNo + " Balance: " + balance);
    }
}

    class Main8 {
        public static void main(String[] args) {


            BankAccount bankaccount = new BankAccount(1000, 10000);
            bankaccount.show();

            Scanner in = new Scanner(System.in);
            System.out.println("enter the amount to withdraw: ");
            int withdraw = in.nextInt();
            try
            {
                bankaccount.show();

                {
                    System.out.println("Throw exception");
                }
            }
            catch(Exception e)
            {
                System.out.println("The exception occurs");
            }
            System.out.println("Program ended successfully");
        }

    }



