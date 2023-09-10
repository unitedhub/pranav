import java.util.Scanner;

public class Complexbreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++)
        {
            System.out.println("Enter your number");
                int num=sc.nextInt();
                if(num==0)
                    break;
            //System.out.println(i);

        }
    }
}
