package HomeWork5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }



    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }

    public Employee() {
        name = "Иванов Иван Иванович";
        position = "Менеджер";
        email = "freiprutrassusseu-2616@yopmail.com";
        phone = "8(210)146-27-12";
        salary = 40000;
        age = 24;
    }


    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(new Employee());
    }
}



