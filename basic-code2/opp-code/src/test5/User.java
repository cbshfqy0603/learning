package test5;
/*
标准的JavaBean类：
（1）类名需要见名知意，驼峰命名
（2）成员变量需用private修饰
（3）提供至少两个构造方法：
->空参构造方法
->带参构造方法
（4）成员方法：
->提供每一个成员的get方法和set方法
->如果还有其他行为也需要写上
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    //快捷键：fn + alt + insert
    //插件：ptg 1秒生成标准javabean
    //空参构造
    public User() {
    }

    //带参构造
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }
}
