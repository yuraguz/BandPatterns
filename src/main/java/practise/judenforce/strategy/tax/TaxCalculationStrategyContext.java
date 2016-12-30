package practise.judenforce.strategy.tax;



/**
 * Created by guz_us on 30.12.2016.
 */
public class TaxCalculationStrategyContext {

    private TaxCalculationStrategy taxCalculationStrategy;

    public TaxCalculationStrategyContext() { }

    public TaxCalculationStrategyContext(TaxCalculationStrategy strategy) {
        this.taxCalculationStrategy = strategy;
    }

    // вычисление госпошлины
    public double calculateTax() {
        return this.taxCalculationStrategy.calculateTax();
    }

}
