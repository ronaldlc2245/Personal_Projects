import java.util.Random;

/**
 * Created by ronaldlc25 on 7/8/2017.
 */
public class Computer {
    private int point = 0;
    private String name = "Computer1";
    private int choice;

    public Computer() {

        // set choice by using Random number generator
        Random random = new Random();
        choice = random.nextInt(3);

        switch(choice) {
            case 0:
                System.out.println("Cpu chose Rock");
                break;
            case 1:
                System.out.println("Cpu chose Paper");
                break;
            case 2:
                System.out.println("Cpu chose Scissors");
        }
    }

    public int getChoice() {
        return choice;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}

