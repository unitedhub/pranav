public class TypeCasting {
   
    public static void main(String[] args) {
        //implicit type casting - lower to higher
         int a,b;
    a=50;
    b=80;
    double a1,b1,div;
        a1=a;
        b1=b;
        div=a1/b1;
        System.out.println("div is"+div);


        //explicit type casting - higher to lower
        float a2=10.25f;
        int add=(int)a2+5;
        System.out.println("add is"+add);

        
    }
    
}
