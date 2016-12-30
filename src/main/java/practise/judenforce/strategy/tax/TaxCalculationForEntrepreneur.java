package practise.judenforce.strategy.tax;

/**
 * Стратегия вычисления госпошлины для индивидуальных предпринимателей (ИП)
 *
 * Created by guz_us on 30.12.2016.
 */
public class TaxCalculationForEntrepreneur implements TaxCalculationStrategy {

    public double calculateTax() {
        return 30.0;
    }
}
