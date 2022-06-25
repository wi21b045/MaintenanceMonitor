package at.technikum.maintenancemonitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MaintenanceMonitorTest {

    private MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();


    @BeforeEach
    void initialize(){
        maintenanceMonitor = new MaintenanceMonitor();
    }

    @Test
    void getMaintenanceMode() {

            assertThat(maintenanceMonitor).isNotNull();
    }
}