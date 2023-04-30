import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pizza But, Please choose one number from the menu 1. Order a Veg pizza 2. Order a Non Veg pizza");
        int choice = sc.nextInt();
        System.out.println("Please wait while we process your preference. Thank you!!");

        System.out.println("Please choose if you want extra cheese ---->  Y : Yes | N : No");
        String extraCheeseChoice = sc.next();

        System.out.println("Please choose if you want to add toppings----> Y : Yes | N : No ");
        String extraToppingChoice = sc.next();

        System.out.println("Please choose if you want to take away--> Y : Yes | N : No");
        String takeAwayChoice = sc.next();

        if(choice == 1 && extraCheeseChoice.equals("Y") && extraToppingChoice.equals("Y") && takeAwayChoice.equals("Y")){
            Pizza pizza = new Pizza(true);
            pizza.addExtraCheese();
            pizza.addExtraTopping();
            pizza.takeAway();
            System.out.println("Your total bill as per your order choices is : "
                    + pizza.generatePizzaBill() + " " + "INR");
        }

        if(choice == 2 && extraCheeseChoice.equals("Y") && extraToppingChoice.equals("Y") && takeAwayChoice.equals("Y")){
            Pizza pizza = new Pizza(true);
            pizza.addExtraCheese();
            pizza.addExtraTopping();
            pizza.takeAway();
            System.out.println("Your total bill as per your order choices is : "
                    + pizza.generatePizzaBill() + " " + "INR");
        }
    }
}