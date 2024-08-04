public class Person {
    public String name;
    public String address;

    public Person() {
        this.name = "Maftuna Validjanova";
        this.address = "Turkiya, Istanbul";
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getAddress() {
        System.out.println(this.address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person name: " + name + "\n" + "Address: " + address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }
}
