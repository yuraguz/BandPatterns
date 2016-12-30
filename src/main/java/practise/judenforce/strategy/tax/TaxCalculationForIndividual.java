package practise.judenforce.strategy.tax;

/**
 * Стратегия вычисления госпошлины для физического лица (ФЛ)
 *
 * Created by guz_us on 30.12.2016.
 */
public class TaxCalculationForIndividual implements TaxCalculationStrategy {

    public double calculateTax() {
        return 10.0;
    }

}
