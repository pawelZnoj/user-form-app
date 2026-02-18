package pl.pezet.user_form_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pezet.user_form_app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
