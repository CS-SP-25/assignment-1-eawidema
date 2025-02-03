public class SalesTaxCalculator {
    public static void main(String[] args) {
        //set name and value from command line
        String name = args[0];
        double value = Double.parseDouble(args[1]);
        //create new state class
        State state = new State(name);
        //if name is Alaska or Indiana change state to Alaska or Indiana class
        //set behavior to be desired behavior
        if (name.equals("Alaska")) {
            state = new Alaska();
            state.setBehavior(new NoTax());
        } else if (name.equals("Indiana")) {
            state = new Indiana();
            state.setBehavior(new SevenPercent());
        } else if (name.equals("Hawaii")) {
            state = new Hawaii();
            state.setBehavior(new FourPointFivePercent());
        }
        //call showTax method from class
        state.showTax(value);
    }
}