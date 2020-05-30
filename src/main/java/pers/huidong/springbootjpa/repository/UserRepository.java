package pers.huidong.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.huidong.springbootjpa.entity.User;

/**
 * @program: springboot-jpa
 * @auther: HuiDong
 * @date: 2020/5/30 18:06
 * @description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
