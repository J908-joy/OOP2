import java.util.Scanner;
class Employee
{
String name;
double salary;

    //contructor
    Employee(String name,double salary){
        this.name= name;
        this.salary = salary;
    }

        //method to display employee details
        void display()
    {
        System.out.println("Name,"+name);
        System.out.println("Salary"+salary);
    }
    }

 class salarycalculator 
{
    //method to calculate salarybonus

    double calculateBonus(double salary){
    return salary * 0.10;
    }


}
//main application
public class mainapp{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        
        //taking user input employee
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        System.out.print("Enter the salary");
        double salary = scanner.nextDouble();

        //create an object employee

        Employee employee=new Employee(name,salary);
       
        //using salarycalculator
        salarycalculator salarycalculator=new salarycalculator();
         System.out.println("Bonus: " + salary*0.10);
         System.out.println("total:"+ (salary + salary*0.10));

    scanner.close();

    }
}