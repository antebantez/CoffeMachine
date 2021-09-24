import java.util.Scanner;


public class CoffeeMachine {
    private int coffeeCount = 0;
    private int ingredientsRefill = 0;
    private double water;
    private double milk;
    private double coffeePowder;
    private double cocoaPowder;
    private int money;
    Scanner minScanner = new Scanner(System.in);

    public CoffeeMachine() {
        this.water = 0d;
        this.milk = 0d;
        this.coffeePowder = 0;
        this.cocoaPowder = 0;

    }

    public void coffeeMachine() {
        setMoney();
        System.out.println("----------------------------------------------");
        System.out.println("||1.          Status of ingredients         ||");
        System.out.println("||2.            Fill ingredients            ||");
        System.out.println("||3.              Clean Machine             ||");
        System.out.println("||4.               Make Coffee              ||");
        System.out.println("||5.   Show how many coffee we have made    ||");
        System.out.println("||6.                  EXIT                  ||");
        System.out.println("----------------------------------------------");
        switch (minScanner.nextInt()) {
            case 1:
                getIngredient();
                break;
            case 2:
                setIngredient();
                break;
            case 3:
                cleanMachine();
                break;
            case 4:
                makeCoffee();
                break;
            case 5:
                System.out.println("Today we have made " + (coffeeCount) + " drinks!");
                coffeeMachine();
                break;
            case 6:
                if (milk == 0 && water == 0) {
                    System.out.println("Shutting down...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("You interrupted the Coffee machine");
                        coffeeMachine();
                    }
                    System.out.println("Shut down completed!\nBye!");
                    System.exit(0);
                } else {
                    System.out.println("Please clean the machine from milk and water before turning off!!!");
                    System.out.println("We don't want mold!!");
                    coffeeMachine();
                }
                break;


        }
    }

    public void start() {
        System.out.println("____________________________________________________________________");
        System.out.println("||                   Welcome to the CoffeeMachine!                ||");
        System.out.println("||             Do you want to start the coffee machine?           ||");
        System.out.println("||                            'Y' or 'N'                          ||");
        System.out.println("--------------------------------------------------------------------");
        if (minScanner.next().equalsIgnoreCase("y")) {
            try {
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
            } catch (InterruptedException e) {
                System.out.println("Error!\nTry again!");
                coffeeMachine();
            }
            getIngredient();
            coffeeMachine();
        } else if (minScanner.next().equalsIgnoreCase("n")) {
            System.out.println("Thank you, Come again!");
            System.exit(0);
        } else {
            System.out.println("Wrong input, Try again");
            start();
        }
    }

    private void blackCoffee() {

        if (money >= 10) {
            System.out.println("Making black coffee...");
            System.out.println(" ");
            System.out.println("Taking 30 cl of water\nTaking 50g of coffee powder!");
            System.out.println("BZRZRRZRZRRZR");
            water -= 0.3;
            coffeePowder -= 50;
            coffeeCount++;
            try {
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
            } catch (InterruptedException e) {
                System.out.println("Error!\nTry again!");
                coffeeMachine();
            }

            System.out.println("\nYour black coffee is ready!");
            System.out.println("You get " + (money - 10) + " kr in return");
            coffeeMachine();

        } else {
            System.out.println("You cant afford a black coffee!");
            System.out.println("Insert at least " + (10 - money) + " kr!");
            money += minScanner.nextInt();
            blackCoffee();
        }
    }

    private void milkCoffee() {
        if (money >= 15) {
            System.out.println("Making coffee with milk...");
            System.out.println(" ");
            System.out.println("Taking 10cl of milk..\nTaking 20cl of water..\nTaking 100g of coffee powder!");
            System.out.println("BZRZRRZRZRRZR");
            try {
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
            } catch (InterruptedException e) {
                System.out.println("Error!\nTry again!");
                coffeeMachine();
            }
            milk -= 0.1;
            water -= 0.2;
            coffeePowder -= 100;
            coffeeCount++;
            System.out.println("\nYour coffee with milk is ready!");
            System.out.println("You get " + (money - 15) + " kr in return");
            coffeeMachine();
        } else {
            System.out.println("You can't afford a coffee with milk!");
            System.out.println("Insert at least " + (15 - money) + " kr!");
            money += minScanner.nextInt();
            milkCoffee();
        }
    }

    private void hotChocolate() {
        if (money >= 20) {
            System.out.println("Making Hot Chocolate...");
            System.out.println(" ");
            System.out.println("Taking 15cl of water\nTaking 15cl of milk\nTaking 50g of cocoa powder!");
            System.out.println("BZRZRRZRZRRZR");
            try {
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
            } catch (InterruptedException e) {
                System.out.println("Error!\nTry again!");
                coffeeMachine();
            }
            water -= 0.15;
            milk -= 0.15;
            cocoaPowder -= 50;
            coffeeCount++;
            System.out.println("\nYour Hot chocolate is ready!");
            System.out.println("You get " + (money - 20) + " kr in return");
        } else {
            System.out.println("You can't afford a Hot chocolate");
            System.out.println("Insert at least " + (20 - money) + " kr!");
            money += minScanner.nextInt();
        }
        coffeeMachine();
    }

    private void makeCoffee() {
        if (milk < 0.1 || water < 0.2 || coffeePowder < 100 || cocoaPowder < 50) {
            System.out.println("Not enough ingredients!!!");
            System.out.println("Please refill the machine!");
            coffeeMachine();
        } else {
            System.out.println("Which drink do you want");
            System.out.println("1. Black coffee  [10 kr]");
            System.out.println("2. Coffee with milk  [15 kr]");
            System.out.println("3. Hot Chocolate  [20 kr]");
            int i = minScanner.nextInt();
            if (i == 1) {
                System.out.println("Insert [10 kr]");
                money = minScanner.nextInt();
                blackCoffee();
            } else if (i == 2) {
                System.out.println("Insert [15 kr]");
                money = minScanner.nextInt();
                milkCoffee();
            } else if (i == 3) {
                System.out.println("Insert [20 kr]");
                money = minScanner.nextInt();
                hotChocolate();
            }
        }

    }

    private void cleanMachine() {
        coffeePowder = 0;
        cocoaPowder = 0;
        milk = 0;
        water = 0;
        System.out.println("Cleaning the machine...");
        try {
            Thread.sleep(500);
            System.out.print("♥   ");
            Thread.sleep(500);
            System.out.print("♥   ");
            Thread.sleep(500);
            System.out.print("♥   ");
            Thread.sleep(500);
            System.out.print("♥   ");
            Thread.sleep(500);
            System.out.print("♥   ");
        } catch (InterruptedException e) {
            System.out.println("Error!\nTry again!");
            coffeeMachine();
        }
        System.out.println("\nCompleted cleaning.");

    }

    private void getIngredient() {
        System.out.println("\nCurrent Status:");
        System.out.println("Available Coffee Powder ( Grams ) " + coffeePowder);
        System.out.println("Available Cocoa Powder ( Grams ) " + cocoaPowder);
        System.out.println("Available Milk ( Liter ) " + milk);
        System.out.println("Available Water ( Liter ) " + water);
        System.out.println("Machine has been refilled " + ingredientsRefill + " times!");
        coffeeMachine();
    }

    public void setMoney() {
        this.money = 0;
    }

    private void setIngredient() {
        if (milk < 1 || coffeePowder < 500 || cocoaPowder < 500 || water < 2) {
            System.out.println("Filling the machine...");

            try {
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
                Thread.sleep(500);
                System.out.print("♥   ");
            } catch (InterruptedException e) {
                System.out.println("Error!\nTry again!");
                coffeeMachine();
            }


            System.out.println("\nFilling Complete.");
            water = 2;
            milk = 1;
            coffeePowder = 500;
            cocoaPowder = 500;
            ingredientsRefill++;
        } else {
            System.out.println("The machine does not need a refill!");
        }
        coffeeMachine();
    }


}
