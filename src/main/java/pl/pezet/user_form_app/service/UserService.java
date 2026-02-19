package pl.pezet.user_form_app.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pezet.user_form_app.model.User;
import pl.pezet.user_form_app.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
