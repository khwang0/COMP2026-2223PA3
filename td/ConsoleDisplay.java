package td;

import java.util.Scanner;

import td.tower.*;

/**
 * A View class. To display the information on screen and also 
 * to take user's control.
 */
public class ConsoleDisplay implements Displayable {
    /**
     * The controller object game.
     */
    protected Game game;

    /**
     * Entry point. Don't touch
     */
    public static void main(String[] args) {
        new ConsoleDisplay();
    }

    /**
     * Constructor. To construct the game object and call game.run();
     */
    public ConsoleDisplay() {
        this.game = new Game(this);
        game.run();
    }

    /**
     * To display the score, money, map and character on screen.
     */
    @Override
    public void display() {
        //TODO
    }
    /**
     * To accept user input (build tower, upgrade tower, view blocks).
     * 
     * This method has been done for you.
     * You should not modify it.
     * You are not allowed to modify it.
     */
    @Override
    public void userInput() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            printInstruction();
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        return;
                    default:
                        throw new InvalidInputException("Invalid option! Pick only 1-4");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            display();
        }
    }

    /**
     * Given method.
     * 
     * You are not supposed to change this method.
     * But you can change if you wish.
     */
    private void printInstruction() {
        System.out.println("Please pick one of the following: ");
        System.out.println("1. View a tower/monster");
        System.out.println("2. Build a new Tower");
        System.out.println("3. Upgrade a Tower");
        System.out.println("4. End a turn");
    }


    //TODO
}
