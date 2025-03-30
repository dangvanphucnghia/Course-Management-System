package vn.phucnghia.Course.Management.System.controller.request;

import lombok.Getter;


@Getter
public class UserChangPasswordRequest {
    private Long id;
    private String oldpassword;
    private String newpassword;
}
