package JavaCore1;

public class JavaCoreApp1 {

    public static void main(String[] args) {
        Team player1 = new Team("Иван",true, true, true);
        Team player2 = new Team("Дима", true, true, true);
        Team player3 = new Team("Вова", true, true, true);
        Team player4 = new Team("Сергей", true, true, true);

        Course sprint = new Course(true, true, true);


        player1.doIt(sprint);
        player1.showResults();
        System.out.println();

        player2.doIt(sprint);
        player2.showResults();
        System.out.println();


        player3.doIt(sprint);
        player3.showResults();
        System.out.println();


        player4.doIt(sprint);
        player4.showResults();
    }
}
