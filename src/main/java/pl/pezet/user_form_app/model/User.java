package pl.pezet.user_form_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Imię jest wymagane")
    private String firstName;

    @NotBlank(message = "Nazwisko jest wymagane")
    private String lastName;

    @NotNull(message = "Wiek jest wymagany")
    @Min(value = 0, message = "Wiek musi być większy lub równy 0")
    private Integer age;

    @NotBlank(message = "Email jest wymagany")
    @Email(message = "Niepoprawny format email")
    private String email;
}