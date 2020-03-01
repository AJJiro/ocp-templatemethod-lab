package lab.assignment.afterefactoring;

public abstract class CoffeeMaker {
    //methods to be implemented by subclasses
    protected abstract void addIngredients();
    protected abstract void finalTouch();

    //template method, final so subclasses can't override
    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        //methods to be implemented by subclasses
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    //default implementation
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

}
