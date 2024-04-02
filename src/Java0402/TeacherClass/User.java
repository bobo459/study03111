package Java0402.TeacherClass;

import java.time.LocalDate;

public class User {
    private String name;
    private String loginId;
    private String password;
    LocalDate birthData;
    private String email;
    private String presonalNum;

    public User() {
    }

    public User(String name, String loginId, String password, LocalDate birthData, String email, String presonalNum) {
        this.name = name;
        this.loginId = loginId;
        this.password = password;
        this.birthData = birthData;
        this.email = email;
        this.presonalNum = presonalNum;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public void setBirthData(LocalDate birthData) {
        this.birthData = birthData;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresonalNum() {
        return presonalNum;
    }

    public void setPresonalNum(String presonalNum) {
        this.presonalNum = presonalNum;
    }

    @Override
    public String toString() {
        return  "이름: " + name + '\n' +
                "아이디: " + loginId + '\n' +
                "비밀번호: " + password + '\n' +
                "생년월일: " + birthData +'\n'+
                "이메일: " + email + '\n' +
                "주민번호: " + presonalNum + '\n';
    }
}
