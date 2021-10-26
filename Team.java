package JavaCore1;

import java.util.Random;

public class Team {
    public String name;
    public boolean doSprint;
    public boolean doJump;
    public boolean doCrawl;
    private final Random random = new Random();

    public Team(String name, boolean doSprint, boolean doJump, boolean doCrawl) {
        this.name = name;
        this.doSprint = doSprint;
        this.doJump = doJump;
        this.doCrawl = doCrawl;
    }


    public void doIt(Course course) {
        course.sprintInfo(random.nextBoolean());
        course.jumpInfo(random.nextBoolean());
        course.crawlInfo(random.nextBoolean());
    }

    public void showResults() {
        System.out.println(name + " Проходит спринт " + random.nextBoolean());
        System.out.println(name + " Проходит прыжки " + random.nextBoolean());
        System.out.println(name + " Проходит ползком " + random.nextBoolean());
    }
}
