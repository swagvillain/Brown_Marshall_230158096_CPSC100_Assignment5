public class EmployeeTest {

    public static void main(String[] args) {

        //declaring 2 new employees, Dave Samuelson and his wife, Sally Samuelson
        Employee Dave = new Employee("Dave", "Samuelson", 100.32);
        Employee Sally = new Employee("Sally", "Samuelson", 87652.54);

        //displaying the employees annual salary
        System.out.printf("Dave's annual salary is: $%,.2f%n", 12*Dave.getmSalary());
        System.out.printf("Sally's annual salary is: $%,.2f%n", 12*Sally.getmSalary());

        //giving each employee a 10% raise
        Dave.setmSalary(Dave.getmSalary()*1.1);
        Sally.setmSalary(Sally.getmSalary()*1.1);
        System.out.println("Dave and Sally have both gotten a 10% raise! Let's see what their annual salary is now, shall we?");

        //displaying the employees updated annual salary
        System.out.printf("Dave's annual salary is: $%,.2f%n", 12*Dave.getmSalary());
        System.out.printf("Sally's annual salary is: $%,.2f%n", 12*Sally.getmSalary());


    }
}
