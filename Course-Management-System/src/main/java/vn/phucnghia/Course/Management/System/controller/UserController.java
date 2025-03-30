package vn.phucnghia.Course.Management.System.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.phucnghia.Course.Management.System.controller.response.UserResponse;

import java.util.*;

@RestController
@RequestMapping("/user")
@Tag(name=" User Controller")
public class UserController {
    @Operation(summary = "Test API", description = "Mo ta chi tiet")
    @GetMapping("/list")
    public Map<String, Object> getList(@RequestParam(required = false) String keywword,
                                      @RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "20") int size){

        UserResponse userResponse1 = new UserResponse();

        userResponse1.setId(1l);
        userResponse1.setFirstName("admin1");
        userResponse1.setLastName("system1");
        userResponse1.setUsername("admin1");
        userResponse1.setGender("gender1");
        userResponse1.setBirthday(new Date());
        userResponse1.setPhone("0368285760");
        userResponse1.setEmail("admin1@gmail.com");

        UserResponse userResponse2 = new UserResponse();

        userResponse2.setId(2l);
        userResponse2.setFirstName("admin2");
        userResponse2.setLastName("system2");
        userResponse2.setUsername("admin2");
        userResponse2.setGender("gender2");
        userResponse2.setBirthday(new Date());
        userResponse2.setPhone("0368285761");
        userResponse2.setEmail("admin2@gmail.com");

        List<UserResponse> userlink = List.of(userResponse1, userResponse2);

        Map<String, Object> resulf = new LinkedHashMap<>();
        resulf.put("status", HttpStatus.OK.value());
        resulf.put("message", "User Link");
        resulf.put("date",userlink);
        return resulf;

    }
}
