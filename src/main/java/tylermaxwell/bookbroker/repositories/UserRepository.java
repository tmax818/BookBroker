package tylermaxwell.bookbroker.repositories;

import org.springframework.data.repository.CrudRepository;
import tylermaxwell.bookbroker.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
