public class Employees_hour extends Employees{
     int num=0;
    public Employees_hour(int theid, String thefName, String thelName, int thetelephoneNumber, double theSalaryint,int thenum) {
        super(theid, thefName,  thelName,  thetelephoneNumber,  theSalaryint);
        num=thenum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

//    public void Details(){
//        super.Details();
//        System.out.println("the huore"+num);
//    }

    @Override
    public String toString() {
        return "Employees_hour{" +
                "num=" + num +
                '}';
    }
}
