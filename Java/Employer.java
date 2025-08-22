public class Employer {
    
    public String name;
    public int age;
    public double salary;
    public double tax;
    public double salaryL = ( salary ) * ( tax / 100 );

    
    
    
    public String toString(  ){

    return "Name: " + name +
    "\nAge: " + age +
    "\nGross Salary: " + salary +
    "\nEmployee: " + name + " $ " + salary +
    "\nUpdate data: " + name + " $ " + salaryL
    ;

    }

}