public class State {
    private String name;
    //add salesTaxBehavior
    private SalesTaxBehavior behavior;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SalesTaxBehavior getBehavior(){
        return behavior;
    }
    //make setter for behavior so that it can be changed dynamically
    public void setBehavior(SalesTaxBehavior behavior) {
        this.behavior = behavior;
    }

    /*
        Displays tax based on behavior.
        classes the extend this class only need to call super since behavior is set dynamically
     */
    public void showTax(double value) {
        System.out.printf("The sales tax on $%.2f in %s is $%.2f\n", value, name, this.behavior.compute(value));
    }
}
