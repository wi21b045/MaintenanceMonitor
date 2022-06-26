package at.technikum.maintenancemonitor;


import org.springframework.stereotype.Service;



@Service
public class MaintenanceMonitor {
    private static String message = "-";



    public static String getMaintenanceMode() {
        return message;
    }

    public static String setMaintenanceMode (String m){
        if (m == null || m.isEmpty()){
            return message;
        }
        else {
            message = m;
            return message;
        }
    }
}
