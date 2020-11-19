package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController controller;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input command: ");
            String[] command = scanner.nextLine().split(" ");
            if (command.length != 3 && !command[0].equals("exit")) {
                System.out.println("Bad parameters!");
            } else if (command[0].equals("exit")) {
                break;
            } else {
                if (command[0].equals("start")) {
                    if (Players.fromString(command[1]) && Players.fromString(command[2])) {
                        controller = new GameController(command[1], command[2]);
                        controller.startGame();
                    } else {
                        System.out.println("Bad parameters!");
                    }
                } else {
                    System.out.println("Bad parameters!");
                }
            }
        }
    }
}