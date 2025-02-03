public class FourPointFivePercent implements SalesTaxBehavior{

    //create new behavior to calculate tax for 4.5 percent
    @Override
    public double compute(Double value) {
        return value * 0.045;
    }
}
