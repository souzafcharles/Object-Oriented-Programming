package souza.charles.domain.usecases.user;

import souza.charles.domain.entities.user.User;
import souza.charles.domain.usecases.utils.DAO;

import java.util.Optional;

public interface UserDAO extends DAO<User, String> {
    Optional<User> findByEmail(String email);
}
