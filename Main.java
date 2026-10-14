import java.util.Scanner;
public class Main {

public static void main(String[] args) {
    
    boolean running = true;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Isaac Casino!");
    System.out.println("Please enter the game you want to play, 1 for horse racing, 2 for slotmachine:, 3 to exit");
    while (running) {
    int gameChoice = input.nextInt();
    if (gameChoice == 1) {
        System.out.println("You have chosen to play horse racing. Good luck!, If your horse wins, you will receive 5x your bet amount.");
        playHorseRacing();
    } else if (gameChoice == 2) {
        System.out.println("You have chosen to play slot machine. Good luck!, If you win, you will receive 4.25x your bet amount.");  
        playSlotMachine();
    }
    else if (gameChoice == 3) {
        System.out.println("Thank you for playing. Goodbye!");
        running = false;
    }
    else {
        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
    }
}