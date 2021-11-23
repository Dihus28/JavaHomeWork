package JavaCore;

import ru.geekbrains.qa.java2.lesson9.Demo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaCoreApp9 {


    static class Students {
        public String name;
        public String titleCourse;
        public int grade;

        public Students(String name, String titleCourse, int grade) {
            this.name = name;
            this.titleCourse = titleCourse;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getTitleCourse() {
            return titleCourse;
        }

        public int getGrade() {
            return grade;
        }

        static List<Students> students = new ArrayList<>(Arrays.asList(
                new Students("ivanov", "Linux", 71),
                new Students("petrov", "Java Core", 84),
                new Students("aleksandov", "Web", 24),
                new Students("babushkin", "Web", 45),
                new Students("zaytsev", "Linux", 91)
        ));

        private static void uniqCourse() {
            students.stream()
                    .map(Students::getTitleCourse)
                    .distinct()
                    .forEach(System.out::println);
        }

        private static void top3Grade() {
            students.stream()
                    .map(students -> students.getGrade())
                    .sorted()
                    .skip(2)
                    .forEach(System.out::println);
        }


        public static void main(String[] args) {
                uniqCourse();
            System.out.println("/////////////////////////////////////////");
            top3Grade();
            }
        }
    }


