package me.right.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String users(){
        return "access-token good!";
    }

    @GetMapping("/tests")
    public String test(){
        return "test";
    }

}
