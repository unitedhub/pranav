public class Breakcontinue {
    public static void main(String[] args) {
       System.out.println("breakdemo"); 
        for(int i=1;i<=10;i++)
        {
            if(i==5)
                break;
                System.out.println(i);
        }
        System.out.println("continuedemo");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
                continue;
                System.out.println(i);
        }
    }
}
