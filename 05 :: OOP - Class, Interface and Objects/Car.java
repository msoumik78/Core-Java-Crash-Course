public class Car extends Vehicle{
    String type = "Car";
    @Override
    void display() {
        System.out.println("Vehicle type is : "+type +" and year of purchase = "+yearOfPurchase);
    }
}
