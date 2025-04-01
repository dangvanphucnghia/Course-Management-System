﻿# Create new user and manage transaction
## Test with Postman
```bash
POST http://localhost:8081/user/add br
```
```bash
{
  "firstName": "Nghĩa",
  "lastName": "Đặng Văn Phúc",
  "gender": "MALE",
  "birthday": "2025-04-01T11:40:15.957Z",
  "username": "phucnghia",
  "email": "nghia812014@gmail.com",
  "phone": "0368285760",
  "type": "OWNER",
  "addresses": [
    {
      "apartmentNumber": "123",
      "floor": "12",
      "building": "B",
      "streetNumber": "20",
      "street": "Nguyen Xien",
      "city": "TP.HCM",
      "country": "Vietnam",
      "addressType": 1
    },
    {
      "apartmentNumber": "",
      "floor": "",
      "building": "",
      "streetNumber": "838",
      "street": "Nguyen Kiem",
      "city": "TP.HCM",
      "country": "Vietnam",
      "addressType": 2
    }

  ]
}
```
![image](https://github.com/user-attachments/assets/c5364ea2-d0b4-42ef-ad8d-f0199ad87d92)



