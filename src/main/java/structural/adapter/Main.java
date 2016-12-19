package structural.adapter;

import structural.adapter.adcompose.ComposeAdapter;
import structural.adapter.adinheritance.InheritanceAdapter;

/**
 * Created by Yura on 16.12.2016.
 */
public class Main {

    private ComposeAdapter composeAdapter = new ComposeAdapter();
    private InheritanceAdapter inheritanceAdapter = new InheritanceAdapter();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        // using compose adapter
        useComposeAdapter();

        // using inheritance adapter
        useInheritanceAdapter();
    }

    public void useComposeAdapter() {
        System.out.println(composeAdapter.getInfoForBalance());
        System.out.println(composeAdapter.getInfoForDebtorsCnt());
        System.out.println();
    }

    public void useInheritanceAdapter() {
        System.out.println(inheritanceAdapter.getInfoForBalance());
        System.out.println(inheritanceAdapter.getInfoForDebtorsCnt());
        System.out.println();
    }

}
