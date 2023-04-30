public class Pizza {

    private Double price;
    private Boolean veg;
    private double extraCheesePrice = 100.00;
    private double extraToppingsPrice = 100.00;
    private double takeAwayPrice = 20.00;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(veg){
            this.price = 300.00;
        }
        else {
            this.price = 400.00;
        }
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese has been added for 100 INR. Thank you!");
        this.price = price + extraCheesePrice;
    }

    public void addExtraTopping(){
        System.out.println("Extra Toppings has been added for 100 INR. Thank you!");
        this.price = price + extraToppingsPrice;
    }

    public void takeAway(){
        System.out.println("Your order mode is set to Take Away. Thank you!!");
        this.price = price + takeAwayPrice;
    }

    public Double generatePizzaBill(){
        return this.price;
    }
}
