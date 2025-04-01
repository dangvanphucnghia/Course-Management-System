package vn.phucnghia.Course.Management.System.controller.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vn.phucnghia.Course.Management.System.common.Gender;
import vn.phucnghia.Course.Management.System.common.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@ToString
public class UserCreationRequest implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date birthday;
    private  String username;
    private String email;
    private String phone;
    private UserType type;
    private List<AddressRequest> addresses;
}
