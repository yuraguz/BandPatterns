package structural.proxy.service;

/**
 * Created by Yura on 31.01.2017.
 */
public class AuthentificationManager {

    public static boolean checkRole(String user) {
        switch (user) {
            case "guz_us": return true;
            default: return false;
        }
    }

    public static String getCurrentUser() {
        return "guz_us";
    }

}
