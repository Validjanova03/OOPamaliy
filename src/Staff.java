public class Staff extends Person {
    public String school;
    public double Pay;

    public String school(){
        return school;
    }
    public void SetSchool(){
        this.school = "145";
    }

    public double Pay(){
        return (this.Pay);
    }
    public void SetPay(){
        this.Pay = Pay ;
    }
    public Staff(){
        this.name = "Mamadov Mamad";
        this.address = "Toshkent, Uzbekistan";
this.Pay = 850;
this.school = "145";
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Adress: "+ this.address + "\n" +"School: " + this.school+"\n"+"Pay: "+ Pay;
    }
    public static void main(String[] args){
        Staff st = new Staff();
        System.out.println(st.toString());
    }


}
