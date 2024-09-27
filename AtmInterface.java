import java.util.Scanner;
 class BankAccount {
    private double balance;
    public BankAccount(double intialBalance){
        this.balance=intialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount)
{
    if(amount > 0){
        balance+=amount;
        System.out.println("Successfully deposited:"+amount);
    }
    else{
        System.out.println("Invalid deposit amount.");
    }
}
public void withdraw(double amount){
    if(amount > 0 && amount <=balance){
        balance-=amount;
        System.out.println("Successfully withdraw:"+amount);
    }
    else if(amount > balance){
        System.out.println("Insufficient balance.");
    }
    else{
        System.out.println("Invalid withdrawl amount.");
    }
    }
}
public class AtmInterface{
    private BankAccount account;
    public AtmInterface(BankAccount account){
        this.account=account;
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
    public void checkBalance(){
        System.out.println("Current balance:"+account.getBalance());
    }
    public void ShowMenu(){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nAtm Menu:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("choose an option:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                System.out.print("Enter amount to deposit:");
                double depositAmount=sc.nextDouble();
                deposit(depositAmount);
                break;
                case 2:
                System.out.print("Enter samount to withdraw:");
                double withdrawAmount=sc.nextDouble();
                withdraw(withdrawAmount);
                break;
                case 3:
                checkBalance();
                break;
                case 4:
                System.out.println("Thank you for using the ATM. Have a nice day");
                break;
                default:
                System.out.println("Invalid choice .Please try again.");
            }
        }
            while(choice!=4);
            sc.close();
        }
        public static void main(String args[]){
            BankAccount account=new BankAccount(1000);
            AtmInterface atm=new AtmInterface(account);
            atm.ShowMenu();
        }
}

