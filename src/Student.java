public class Student extends Person{
 public String program;
 public int year;
public double fee;
public String Getprogram(){
    return "";
}
public void Setprogram(){
    this.program = program;
}

public int Getyear(){
    return year;
}
public void setyear(){
    this.year = year;

}

public double getFee() {
    return fee;
}
public void setFee(){
    this.fee= fee;
}
public Student() {
    this.program = "Computer fanlarni";
    this.year = 2;
    this.fee = 2.345;
    this.address = "Istanbul ";
    this.name = "Validjanova Maftuna";
}

    @Override
    public void getName() {
        super.getName();
    }

    @Override
    public void getAddress() {
        super.getAddress();
    }
    public static void main(String[] args){
    Student student = new Student();
        System.out.println("Student Info: ");
        System.out.println(student.name);
        System.out.println(student.address);
        System.out.println(student.program);
        System.out.println("Fee: "+student.fee);
        System.out.println("Year: " +student.year);
    }
}
