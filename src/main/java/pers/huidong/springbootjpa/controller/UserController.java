package pers.huidong.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springbootjpa.entity.User;
import pers.huidong.springbootjpa.repository.UserRepository;

import java.util.Optional;

/**
 * @program: springboot-jpa
 * @auther: HuiDong
 * @date: 2020/5/30 22:09
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id")Integer id){
        Optional<User> user = userRepository.findById(id);
        return user;
    }
    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }
}
