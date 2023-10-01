public class Emp {
    int empAge;
    String empName;
    // default constructor
    Emp()
    {
        System.out.println("Invoking default constructor");
        empAge=30;
        empName="Pranav";
    }
    //parameterised constructor
    Emp(int age, String name)
    {
        System.out.println("Invoking parameterised constructor");
        empAge=age;
        empName=name;
    }
    void displayEmp()
    {
        System.out.println("age is"+empAge);
        System.out.println("name is"+empName);

    }
    
}
