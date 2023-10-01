public class Bank
{
    String name;
    int years;
    int turnover;
    void initialiseBank()
    {
        name="Bank of India";
        years= 30;
        turnover=550;
    
    }
    void displayBank()
    {
        System.out.println("Name of Bank"+name);
        System.out.println("years of Bank"+years);
        System.out.println("turnover of Bank"+turnover);

    }
    public static void main(String[] args) {
        Bank bank= new Bank();
        bank.initialiseBank();
        bank.displayBank();
        System.out.println(bank.name);
        
    }
}
