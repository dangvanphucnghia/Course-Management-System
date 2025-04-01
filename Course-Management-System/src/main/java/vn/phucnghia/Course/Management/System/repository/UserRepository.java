package vn.phucnghia.Course.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.phucnghia.Course.Management.System.model.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
