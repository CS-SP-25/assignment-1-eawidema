public class NoTax implements SalesTaxBehavior{

    //There is no sales tax so the value will simply be 0
    @Override
    public double compute(Double value) {
        return 0;
    }
}
