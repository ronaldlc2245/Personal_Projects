import java.util.Scanner;

/**
 * Created by ronaldlc25 on 7/8/2017.
 */
public class Person {
    private int point = 0;
    private String name;
    private int choice;
    private Scanner scanner = new Scanner(System.in);

    public Person() {
        // User enters his name and his choice
        System.out.print("What is your name? ");
        name = scanner.nextLine();

        setChoice();
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice() {
        System.out.print("\nWhat is your choice " + name + "? ");
        choice = scanner.nextInt();

        // Check if user entered valid number
        if (choice >= 3) {
            System.out.println("Invalid number");
            setChoice();
        }

        switch(choice) {
            case 0:
                System.out.println("You chose Rock");
                break;
            case 1:
                System.out.println("You chose Paper");
                break;
            case 2:
                System.out.println("You chose Scissors");
        }
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

}
