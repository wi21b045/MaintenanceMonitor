package at.technikum.maintenancemonitor;

import org.springframework.web.bind.annotation.*;



@CrossOrigin
@RestController
@RequestMapping("/api/maintenanceMode")
public class MaintenanceMonitorController {
    private  String message = "-";



    @GetMapping()
    public String getMaintenanceMode(){

        return MaintenanceMonitor.getMaintenanceMode();
    }

    @GetMapping("{message}")
    public String setMaintenanceMode(@PathVariable("message") String message)
    {
         return MaintenanceMonitor.setMaintenanceMode(message);
    }


}
