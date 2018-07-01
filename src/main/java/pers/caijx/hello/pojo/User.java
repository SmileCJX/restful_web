package pers.caijx.hello.pojo;

import java.util.Date;

/**
 * Created by caijx on 2018/7/1/001.
 */
public class User {

    private String name;

    private String password;

    private Integer age;

    private Date birthday;

    public User() {
    }

    public User(String name, String password, Integer age, Date birthday) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
