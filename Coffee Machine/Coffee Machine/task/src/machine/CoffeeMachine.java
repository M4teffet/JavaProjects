package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int waterQuantity = 400;
    public static int milkQuantity = 540;
    public static int coffeeBeansQuantity = 120;
    public static int numberOfCups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var action = "";
        while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scan.next();
            System.out.printf("%n");

            switch (action) {
                case "buy":
                    buyAction(scan);
                    break;
                case "fill":
                    fillAction(scan);
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    remainingAction();
                    break;
                default:
                    System.out.println("Thank You!!!");
                    break;
            }
        }
    }

    private static void takeAction() {
        System.out.printf("I gave you $%d%n", money);
        money = 0;
        System.out.printf("%n");
    }

    private static void fillAction(Scanner scan) {
        System.out.println("Write how many ml of water do you want to add:");
        waterQuantity += scan.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkQuantity += scan.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeansQuantity += scan.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        numberOfCups += scan.nextInt();

        System.out.printf("%n");
    }

    private static void buyAction(Scanner scan) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        var option = scan.next();
        switch (option) {
            case "1":
                if (waterQuantity - 250 >= 0 && coffeeBeansQuantity - 16 >= 0 && numberOfCups - 1 >= 0) {
                    waterQuantity -= 250;
                    coffeeBeansQuantity -= 16;
                    numberOfCups -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (waterQuantity - 250 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (coffeeBeansQuantity - 16 < 0) {
                        System.out.println("Sorry, not enough coffee beans");
                    } else {
                        System.out.println("Sorry, not enough disposable cups");
                    }
                }
                System.out.printf("%n");
                break;

            case "2":
                if (waterQuantity - 350 >= 0 && milkQuantity - 75 >= 0 && coffeeBeansQuantity - 20 >= 0 && numberOfCups - 1 >= 0) {
                    waterQuantity -= 350;
                    milkQuantity -= 75;
                    coffeeBeansQuantity -= 20;
                    numberOfCups -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (waterQuantity - 350 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (milkQuantity - 75 < 0) {
                        System.out.println("Sorry, not enough milk");
                    } else if (coffeeBeansQuantity - 20 < 0) {
                        System.out.println("Sorry, not enough coffee beans");
                    } else {
                        System.out.println("Sorry, not enough disposable cups");
                    }
                }
                System.out.printf("%n");
                break;

            case "3":
                if (waterQuantity - 200 >= 0 && milkQuantity - 100 >= 0 && coffeeBeansQuantity - 12 >= 0 && numberOfCups - 1 >= 0) {
                    waterQuantity -= 200;
                    milkQuantity -= 100;
                    coffeeBeansQuantity -= 12;
                    numberOfCups -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (waterQuantity - 200 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (milkQuantity - 100 < 0) {
                        System.out.println("Sorry, not enough milk");
                    } else if (coffeeBeansQuantity - 12 < 0) {
                        System.out.println("Sorry, not enough coffee beans");
                    } else {
                        System.out.println("Sorry, not enough disposable cups");
                    }
                }
                System.out.printf("%n");
                break;
            default:
                break;
        }
    }

    private static void remainingAction() {
        System.out.printf("The coffee machine has:%n");
        System.out.printf("%d of water%n%d of milk%n", waterQuantity, milkQuantity);
        System.out.printf("%d of coffee beans%n%d of disposable cups%n", coffeeBeansQuantity, numberOfCups);
        System.out.printf("$%d of money%n%n", money);
    }
}