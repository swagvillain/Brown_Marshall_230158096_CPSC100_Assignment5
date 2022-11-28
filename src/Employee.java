public class Employee {

    //declaring class attributes
    String fName;
    String lName;
    double mSalary;

    //creating a constructor
    public  Employee(String fName, String lName, double mSalary){
        this.fName = fName;
        this.lName = lName;
        this.mSalary = mSalary;
    }

    //creating setters and getters
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setmSalary(double mSalary) {
        if(mSalary >= 0)
            this.mSalary = mSalary;
    }

    public double getmSalary() {
        return mSalary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
