public class Employer {
    
    public String name;
    public int age;
    public double salary;
    public double tax;
    
    public double salaryL( double x , double y ){

        return ( ( salary ) * ( y / 100 ) + salary );

    }

    
    
    
    public String toString(  ){

    return "Name: " + name +
    "\nAge: " + age +
    "\nGross Salary: " + salary +
    "\nEmployee: " + name + " $ " + salary +
    "\nUpdate data: " + name + " $ " + salaryL( salary , tax )
    ;

    }

}