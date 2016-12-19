package structural.adapter.adcompose;

import structural.adapter.OuterServiceImpl;
import structural.adapter.OuterServices;

/**
 * Adapter uses composite pattern
 */
public class ComposeAdapter {

    OuterServices services = new OuterServiceImpl();

    public String getInfoForBalance() {
        return services.getBalance();
    }

    public String getInfoForDebtorsCnt() {
        return services.getDebtorsCnt();
    }

}
