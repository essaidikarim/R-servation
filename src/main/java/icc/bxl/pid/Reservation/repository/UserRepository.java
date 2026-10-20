package icc.bxl.pid.Reservation.repository;

import icc.bxl.pid.Reservation.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
    List<User> findByLastname(String lastname);

    User findById(long id);

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByLogin(String login);

}

