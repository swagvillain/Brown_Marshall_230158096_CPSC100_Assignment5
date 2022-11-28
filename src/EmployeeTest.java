public class EmployeeTest {

    //method to display the passed employees annual salary
    public static void printAnnualSalary(Employee emp){
        System.out.printf("%s %s's annual salary is: $%,.2f%n", emp.getfName(), emp.getlName(), 12*emp.getmSalary() );
    }

    public static void main(String[] args) {

        //declaring 2 new employees, Dave Samuelson and his wife, Sally Samuelson
        Employee Dave = new Employee("Dave", "Samuelson", 100.32);
        Employee Sally = new Employee("Sally", "Samuelson", 87652.54);

        //displaying the employees annual salary
        printAnnualSalary(Dave);
        printAnnualSalary(Sally);

        //giving each employee a 10% raise
        Dave.setmSalary(Dave.getmSalary()*1.1);
        Sally.setmSalary(Sally.getmSalary()*1.1);
        System.out.println("Dave and Sally have both gotten a 10% raise! Let's see what their annual salary is now, shall we?");

        //displaying the employees updated annual salary
        printAnnualSalary(Dave);
        printAnnualSalary(Sally);

    }
}
