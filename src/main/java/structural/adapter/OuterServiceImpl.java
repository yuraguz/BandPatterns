package structural.adapter;

/**
 * Created by Yura on 16.12.2016.
 */
public class OuterServiceImpl implements OuterServices {

    public String getBalance() {
        return "Returning rest balance";
    }

    public String getDebtorsCnt() {
        return "Return debtors cnt";
    }

}
