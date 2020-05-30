package pers.huidong.springbootjpa.entity;

import javax.persistence.*;

/**
 * @program: springboot-jpa
 * @auther: HuiDong
 * @date: 2020/5/30 16:21
 * @description:
 */
//使用jpa注解配置实体类
@Entity//告诉jpa这是一个实体类（和数据表映射的类）
@Table(name = "tbl_user")//指定对应是数据表，如果省略默认类名小写user
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name",length = 50)
    private String lastName;

    @Column//默认列名就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
