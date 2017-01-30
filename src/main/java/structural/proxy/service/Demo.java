package structural.proxy.service;

/**
 * Created by Yura on 31.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        new Demo();
    }

    public Demo() {

        ProcessService processService = new ActivitiProcessServiceProxy();
        processService.startProcess(100);

    }
}
