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
## Build application
```bash
mvn clean package -P dev|test|uat|prod
```

## Run application
- Maven statement
```bash
./mvnw spring-boot:run
```
- Jar statement
```bash
java -jar target/Course-Management-System.jar
```

- Docker
```bash
docker build -t Course-Management-System .
docker run -d Course-Management-System:latest Course-Management-System
```

## Package application
```bash
docker build -t Course-Management-System .
```
## Truy cập Backend service để test các API
![image](https://github.com/user-attachments/assets/b0f33b0c-bb3d-4503-b416-665fddb56385)
