package HomeWork5;

import java.util.Arrays;

public class HomeWorkApp5 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1);
        System.out.println();

        Employee[] empArray = new Employee[5];
        empArray[0] = new

                Employee("Маслов Архип Оскарович", "Директор", "yofehecreka-9694@yopmail.com", "8(556)526-10-74", 150000, 46);

        empArray[1] = new

                Employee("Шестакова Инесса Олеговна", "Зам. Директора", "daveufrotojou-6945@yopmail.com", "8(153)737-56-99", 120000, 45);

        empArray[2] = new

                Employee("Куликов Гордей Борисович", "Руководитель", "cecreuquaquakou-9390@yopmail.com", "8(170)125-30-89", 100000, 37);

        empArray[3] = new

                Employee("Мельникова Николь Натановна", "Старший Менеджер", "rafegralouwe-8856@yopmail.com", "8(267)252-98-74", 70000, 32);

        empArray[4] = new

                Employee("Калашников Аристарх Артёмович", "Менеджер", "suddopruquaquo-2613@yopmail.com", "8(217)255-94-04", 45000, 27);

        System.out.print(Arrays.toString(empArray));
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].printInfo();
        }
            System.out.println();
        }


    }
    }





