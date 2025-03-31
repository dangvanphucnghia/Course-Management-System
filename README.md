﻿# Mockup API full
## 🚀 Tính năng
- REST API giả lập dữ liệu (CRUD) <br>
- Trả về JSON giống thật <br>
- Hỗ trợ delay response, fake error <br>
- Cấu hình endpoint dễ dàng <br>
- Có thể chạy cục bộ hoặc deploy <br>
## Cấu trúc thư mục
src/ <br>
└── main/ <br>
    ├── java/ <br>
    │   └── vn.phuonghia.Course.Management.System/ <br>
    │       ├── controller/ <br>
    │       │   ├── request/ <br>
    │       │   │   ├── UserChangPasswordRequest <br>
    │       │   │   ├── UserCreationRequest <br>
    │       │   │   └── UserUpdateRequest <br>
    │       │   ├── response/ <br>
    │       │   │   └── UserResponse <br>
    │       │   └── UserController <br>
    │       └── CourseManagementSystemApplication <br>
    └── resources/ <br>
        └── application.yaml <br>
        └── application-dev.yaml <br>
        └── application-test.yaml <br>
        └── application-prod.yaml <br>
