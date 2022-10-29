public class EmployeesTest {
    public static void main(String[] args) {
        Employees abeer= new Employees(1);
        abeer.setfName("Abeer");
abeer.setlName("Al-Namaani");
abeer.setId(123);
abeer.setTelephoneNumber(777);
abeer.setSalary(990);
        System.out.println("id: "+abeer.getId());
        System.out.println("fName: "+abeer.getfName());
        System.out.println("lName: "+abeer.getlName());
        System.out.println("TelephoneNumber: "+abeer.getTelephoneNumber());
        System.out.println("salary: "+abeer.getSalary());
    }
}
