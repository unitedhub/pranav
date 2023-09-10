public class Labeldemo {
    public static void main(String[] args) {
        int i,j;
        outer:
        for(i=1;i<=10;i++)
        {
            System.out.println("outer"+i);
            for(j=1;j<=10;j++)
            {
                if(j>i)
                break outer;
                System.out.println("inner"+j);
            }
        }
        System.out.println("i am in outside form");
    }
}
