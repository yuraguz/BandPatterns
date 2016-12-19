package structural.adapter.adinheritance;

import structural.adapter.OuterServiceImpl;
import structural.adapter.OuterServices;

/**
 * Adapter uses inheritance pattern
 */
public class InheritanceAdapter extends OuterServiceImpl {

    public String getInfoForBalance() {
        return getBalance();
    }

    public String getInfoForDebtorsCnt() {
        return getDebtorsCnt();
    }

}
