baner.txt
## 1. Prerequisite
Cài đặt JDK 17+ nếu chưa thì cài đặt JDK
Install Maven 3.5+ nếu chưa thì cài đặt Maven
Install IntelliJ nếu chưa thì cài đặt IntelliJ
Install Docker nếu chưa thì cài đặt Docker
## 2. Technical Stacks
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
## 3. Build & Run Application
– Run application bởi mvnw tại folder Course-Management-System

$ ./mvnw spring-boot:run
– Run application bởi docker

$ mvn clean install -P dev
$ docker build -t Course-Management-System:latest .
$ docker run -it -p 8080:8080 --name Course-Management-System Course-Management-System:latest
## 4. Test
– Check health với cURL

curl --location 'http://localhost:8080/actuator/health'

-- Response --
{
    "status": "UP"
}
## Truy cập Backend service để test các API
![image](https://github.com/user-attachments/assets/b0f33b0c-bb3d-4503-b416-665fddb56385)
