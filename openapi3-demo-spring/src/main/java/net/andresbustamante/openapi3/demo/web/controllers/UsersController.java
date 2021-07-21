package net.andresbustamante.openapi3.demo.web.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.andresbustamante.openapi3.demo.web.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Optional;

@RestController
public class UsersController implements UsersApi {

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<User> createUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> findUser(@Pattern(regexp = "^[0-9A-F]{16}$") @Valid String code) {
        return null;
    }
}
