package meetona.core.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import meetona.core.entity.Role;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

public record UserRequest(

    @NotBlank(message = "Username cannot be blank")
    String username,

    @Email(message = "Enter a valid email address")
    String email,

    @NotBlank(message = "Password cannot be blank")
    String password,

    @NotEmpty(message = "Role must note be blank")
    Set<Role> roles,

    @NotNull(message = "Unit Id must note be blank")
    UUID memberId

) implements Serializable {}
