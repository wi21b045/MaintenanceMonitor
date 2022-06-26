# MaintenanceMonitor
In this project, a REST-API was implented that returns the current status of the monitors used:
* Green means everything is working and no problems have occurred.
* Red means that a problem has occurred and a corresponding message is returned. 

## Description
The service is able to manage a centrally stored message to:
* get the current status
* set a specific message
* reset the message
* transmits the message to the clients of the REST API used

The web frontend is reloaded every 5 seconds

## Application
For messages:

http://localhost:8080/api/maintenanceMode/(message)

Open Web:

http://localhost:63342/MaintenanceMonitor/templates/index.html?_ijt=pt9k03bectkck6t8rm0jf9adkq&_ij_reload=RELOAD_ON_SAVE



### Team:
* Nadine Pistor (wi21b045@technikum-wien.at)
* Alexander Schneider (wi21b067@technikum-wien.at)
* Denise Wiesner (wi21b024@technikum-wien.at)
