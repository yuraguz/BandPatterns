package structural.proxy.service;

/**
 * Created by Yura on 31.01.2017.
 */
public class ActivitiProcessService implements ProcessService {

    public void startProcess(int id) {
        System.out.println("Starting process with id: " + id);
    }
}
