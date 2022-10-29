public class Employees {
    private int id;
    private String fName;
    private String lName;
    private int TelephoneNumber;
    private double Salary;

    public Employees(int id) {
        this.id = id;
    }

    public Employees(int theid, String thefName, String thelName, int thetelephoneNumber, double theSalary) {
        id = theid;
        fName = thefName;
        lName = thelName;
        TelephoneNumber = thetelephoneNumber;
    }



    public void setId(int Id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getTelephoneNumber() {
        return TelephoneNumber;
    }

    public double getSalary() {
        return Salary;
    }

//    public void Details() {
//        System.out.println("---------------------------------------------------");
//        System.out.println("the Details of employees:\n the name:" + fName + " " + lName + "\n id=" + id + "\n the TelephoneNumber=" + TelephoneNumber);
//
//    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", TelephoneNumber=" + TelephoneNumber +
                ", Salary=" + Salary +
                '}';
    }
}


