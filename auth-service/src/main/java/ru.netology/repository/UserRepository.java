package ru.netology.repository;

import ru.netology.model.Authorities;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // Тестовые данные для проверки
        if ("admin".equals(user) && "admin123".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "user123".equals(password)) {
            return Arrays.asList(Authorities.READ);
        }
        // Для всех остальных — пустой список
        return List.of();
    }
}