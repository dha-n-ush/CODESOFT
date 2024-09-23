import java.util.*; 

class HelloWorld {
    public static void main(String[] args) {

        BankAccount account =new BankAccount(1000);
    }
}
class BankAccount{
    private int balance;
    int cash;
    char res;
    BankAccount(int balance)
    {
        this.balance = balance;
        Scanner input = new Scanner(System.in);
        do
        {
        System.out.println("press 1 for withdrawal");
        System.out.println("press 2 for deposite");
        System.out.println("press 3 for check_balance ");
        System.out.print("Enter the choice : ");
        int value =input.nextInt();
        switch (value) 
        {
            case 1:
                 System.out.print("Enter withdrawal Amount : ");
                 cash = input.nextInt();
                 if(balance >= cash)
                 {
                     withdrawal(cash);
                     System.out.println("withdral "+ cash+ "RS successfully");
                 }
                 else
                 {
                     System.out.println("insufficient balance"); 
                 }
                 break;
            case 2:
                System.out.print("Enter deposite amount : ");
                int cash =input.nextInt();
                deposite(cash);
                System.out.println("cash deposite successfully ");
                break;
            case 3:
                 System.out.println("Your available balance is :" + getBalance() );
                 break;
            default:
                 System.out.println("invalid input");
                 System.out.println("pleaase enter the correct choice");
        }
        System.out.println("Do you want to continue yes or no :");
        res = input.next().charAt(0);
    }while(res=='Y' || res == 'y');
    }
    
    public int getBalance()
    {
        return balance;
    }
    public void withdrawal(int cash)
    {
        balance = balance - cash;
    }
    public void deposite(int cash)
    {
        balance = balance + cash;
    }
    
    
}