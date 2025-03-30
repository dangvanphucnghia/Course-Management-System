package vn.phucnghia.Course.Management.System.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UserUpdateRequest implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private  String username;
    private String gender;
    private Date birthday;
    private String phone;
    private String email;
}
