package structural.proxy.service;

/**
 * Created by Yura on 31.01.2017.
 */
public class ActivitiProcessServiceProxy implements ProcessService {

    private ActivitiProcessService activitiProcessService;

    public void startProcess(int id) {
        if (AuthentificationManager.checkRole(AuthentificationManager.getCurrentUser())) {
            activitiProcessService = new ActivitiProcessService();
            activitiProcessService.startProcess(id);
        } else {
            System.out.println("You are not permitted for this service!");
        }
    }

}
