package vn.phucnghia.Course.Management.System.controller.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private  String username;
    private String gender;
    private Date birthday;
    private String phone;
    private String email;
}
