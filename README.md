baner.txt
## 1. Prerequisite
Cài đặt JDK 17+ nếu chưa thì cài đặt JDK <br>
Install Maven 3.5+ nếu chưa thì cài đặt Maven <br>
Install IntelliJ nếu chưa thì cài đặt IntelliJ <br>
Install Docker nếu chưa thì cài đặt Docker <br>
## 2. Technical Stacks
Java 17 <br>
Maven 3.5+ <br>
Spring Boot 3.3.4 <br>
Spring Data Validation <br>
Spring Data JPA <br>
Postgres/MySQL (optional) <br>
Lombok <br>
DevTools <br>
Docker <br>
Docker compose <br>
… <br>
## 3. Build & Run Application
– Run application bởi mvnw tại folder Course-Management-System <br>

$ ./mvnw spring-boot:run <br>
– Run application bởi docker <br>

$ mvn clean install -P dev <br>
$ docker build -t Course-Management-System:latest <br>
$ docker run -it -p 8081:8081 --name Course-Management-System Course-Management-System:latest <br>
## 4. Test
– Check health với cURL <br>

curl --location 'http://localhost:8081/actuator/health' <br>

-- Response -- <br>
{ <br>
    "status": "UP" <br>
} <br>
## Truy cập Backend service để test các API
![image](https://github.com/user-attachments/assets/b0f33b0c-bb3d-4503-b416-665fddb56385)
