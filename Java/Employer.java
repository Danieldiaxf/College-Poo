public class Employer {
    
    public String name;
    public int age;
    public double salary;

    public double taxSalary = 20 / 100; 

    public double salaryL = salary * taxSalary;





    public String toString(  ){

    return "Name: " + name;

    }

}