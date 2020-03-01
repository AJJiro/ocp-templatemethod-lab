package lab.assignment.afterrefactoring;

public class AmericanoCoffee extends CoffeeMakerTemplate{

   @Override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }


}
