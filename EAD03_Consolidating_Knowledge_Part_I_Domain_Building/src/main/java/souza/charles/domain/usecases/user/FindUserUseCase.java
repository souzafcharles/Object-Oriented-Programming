package souza.charles.domain.usecases.user;

import souza.charles.domain.entities.user.User;
import souza.charles.domain.usecases.utils.Validator;

import java.util.List;
import java.util.Optional;

public class FindUserUseCase {
    private UserDAO userDAO;

    public FindUserUseCase(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public Optional<User> findOne(String id) {
        if (Validator.nullOrEmpty(id))
            throw new IllegalArgumentException("ID can not be null.");
        return userDAO.findOne(id);
    }

    public Optional<User> findOneByEmail(String email) {
        if (Validator.nullOrEmpty(email))
            throw new IllegalArgumentException("Email can not be null or empty.");
        return userDAO.findByEmail(email);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}