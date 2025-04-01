package vn.phucnghia.Course.Management.System.service;

import vn.phucnghia.Course.Management.System.controller.request.UserChangPasswordRequest;
import vn.phucnghia.Course.Management.System.controller.request.UserCreationRequest;
import vn.phucnghia.Course.Management.System.controller.request.UserUpdateRequest;
import vn.phucnghia.Course.Management.System.controller.response.UserResponse;
import vn.phucnghia.Course.Management.System.repository.UserRepository;

import java.util.List;

public interface UserService {


    List<UserResponse> findAll();

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserChangPasswordRequest req);

    void delete(Long id);
}
