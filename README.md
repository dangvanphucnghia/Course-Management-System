
   _____                            __  __                                                   _      _____           _
  / ____|                          |  \/  |                                                 | |    / ____|         | |
 | |     ___  _   _ _ __ ___  ___  | \  / | __ _ _ __   __ _  __ _  ___ _ __ ___   ___ _ __ | |_  | (___  _   _ ___| |_ ___ _ __ ___
 | |    / _ \| | | | '__/ __|/ _ \ | |\/| |/ _` | '_ \ / _` |/ _` |/ _ \ '_ ` _ \ / _ \ '_ \| __|  \___ \| | | / __| __/ _ \ '_ ` _ \
 | |___| (_) | |_| | |  \__ \  __/ | |  | | (_| | | | | (_| | (_| |  __/ | | | | |  __/ | | | |_   ____) | |_| \__ \ ||  __/ | | | | |
  \_____\___/ \__,_|_|  |___/\___| |_|  |_|\__,_|_| |_|\__,_|\__, |\___|_| |_| |_|\___|_| |_|\__| |_____/ \__, |___/\__\___|_| |_| |_|
                                                              __/ |                                        __/ |
                                                             |___/                                        |___/
**1. Prerequisite**
Cài đặt JDK 17+ nếu chưa thì cài đặt JDK
Install Maven 3.5+ nếu chưa thì cài đặt Maven
Install IntelliJ nếu chưa thì cài đặt IntelliJ
Install Docker nếu chưa thì cài đặt Docker
**2. Technical Stacks**
Java 17
Maven 3.5+
Spring Boot 3.3.4
Spring Data Validation
Spring Data JPA
Postgres/MySQL (optional)
Lombok
DevTools
Docker
Docker compose
…
**3. Build & Run Application**
– Run application bởi mvnw tại folder Course-Management-System

$ ./mvnw spring-boot:run
– Run application bởi docker

$ mvn clean install -P dev
$ docker build -t Course-Management-System:latest .
$ docker run -it -p 8080:8080 --name Course-Management-System Course-Management-System:latest
**4. Test**
– Check health với cURL

curl --location 'http://localhost:8080/actuator/health'

-- Response --
{
    "status": "UP"
}
**Truy cập Backend service để test các API**
![image](https://github.com/user-attachments/assets/b0f33b0c-bb3d-4503-b416-665fddb56385)
