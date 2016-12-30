package practise.judenforce.strategy.tax;

/**
 * Стратегия вычисления госпошлины для юридического лица (ЮЛ)
 *
 * Created by guz_us on 30.12.2016.
 */
public class TaxCalculationForLegalJur implements TaxCalculationStrategy {

    public double calculateTax() {
        return 20.0;
    }

}
