import java.util.Scanner;

/**
 *  Created by ronaldlc25 on 7/8/2017.
 *  Rock, Paper, Scissors using Single thread
 */
public class Main {

    private static String answer;

    // Scanner class will be used to get user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Welcome to Rock, Paper, Scissors\n");


        /*  Explains rules to user if user enters
         *  y, yes, or Yes
         */
        System.out.print("Would you like to know the rules? ");
        answer = scanner.nextLine();

        if (answer.equals("y") || answer.equals("yes") ||
                answer.equals("Yes")) {
            explainRules();
        }

        Person user = new Person();
        Computer cpu = new Computer();

        // User and computer choices are compared
        // to see who wins
        choicesCompared(user, cpu);
    }

    public static void explainRules()
    {
        System.out.println("\nYou will choose a number 0, 1, or 2\n" +
                "0 will represent Rock, 1 will represent Paper, and 2 " +
                "will be Scissors\nAfter your choice has been made the " +
                "computer will choose. Rock beats Paper, Paper beats Rock" +
                ", and Scissors beat Paper. Good luck");
    }

    public static void choicesCompared(Person user, Computer cpu) {
        int userChoice = user.getChoice();
        int cpuChoice = cpu.getChoice();

        long start = System.nanoTime();
        System.out.println("Comparing Choices ......");

        // Executes every combination of choices
        // to determine who wins
        if (cpuChoice == 0 && userChoice == 2) {
            cpu.setPoint((cpu.getPoint()) + 1);
            System.out.println("Cpu Wins");
        } else if (cpuChoice == 2 && userChoice == 0) {
            user.setPoint((user.getPoint()) + 1);
            System.out.println("User Wins");
        } else if (cpuChoice == 1 && userChoice == 0) {
            cpu.setPoint((cpu.getPoint()) + 1);
            System.out.println("Cpu Wins");
        } else if (cpuChoice == 0 && userChoice == 1) {
            user.setPoint((user.getPoint()) + 1);
            System.out.println("User Wins");
        } else if (cpuChoice == 2 && userChoice == 1) {
            cpu.setPoint((cpu.getPoint()) + 1);
            System.out.println("Cpu Wins");
        } else if (cpuChoice == 1 && userChoice == 2) {
            user.setPoint((user.getPoint()) + 1);
            System.out.println("User Wins");
        } else {
            System.out.println("Tied");
        }

        long end = System.nanoTime();
        long totalTime = end - start;
        System.out.println("Time it took to Compare Choices: "
                + (totalTime/1000) + "ns");

    }
}
