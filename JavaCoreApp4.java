package JavaCore4;

import java.util.*;

public class JavaCoreApp4 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Панель", "Листва", "Виски",
                "Беда", "Повестка", "Осколок",
                "Оборона", "Кот", "Дверь",
                "Кисть", "Собака", "Панель",
                "Оборона", "Повестка", "Осколок",
                "Кот", "Дверь", "Кисть", "Оборона"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Фомин", "8999123321");
        directory.add("Фомин", "8912155326");
        directory.add("Романов", "8917155552");
        directory.add("Романов", "8913455672");
        directory.add("Фомин", "899999999");
        directory.add("Иванов", "899111111");
        directory.add("Романов", "89923231999");
        directory.add("Егоров", "8888123113");
        directory.add("Иванов", "8324325234");

        System.out.println(directory.get("Фомин"));
        System.out.println(directory.get("Романов"));
        System.out.println(directory.get("Иванов"));
        System.out.println(directory.get("Егоров"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
