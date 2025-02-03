public class SevenPercent implements SalesTaxBehavior{

    //sales tax is seven percent so multiply given value by .07 to get the tax on that value
    @Override
    public double compute(Double value) {
        return value * 0.07;
    }
}
