package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterfactoring.CoffeeMakerTemplate;
import lab.assignment.afterfactoring.AmericanoCoffee;
import lab.assignment.afterfactoring.CapuccinoCoffee;
import lab.assignment.afterfactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        //using template method
        CoffeeMaker starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();

        starbuzz =new CapuccinoCoffee();
        starbuzz.prepareCoffee();


        starbuzz =new MochaCoffee();
        starbuzz.prepareCoffee();
        System.out.println("********************");


    }

}
