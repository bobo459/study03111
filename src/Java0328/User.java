package Java0328;

import java.time.LocalDate;

public class User {
    //필드
    private String name;
    private String loginID;
    private String password;
    LocalDate birthData;  //로컬데이터를 쓰는 이유는 하나하나 빼서 확인을 하지 않고 빠르게 처리하려고 사용.로컬데이터는 .toString을 지원함
    private String email;
    private String personalNum;

    public User() {
    }

    public User(String name, String loginID, String password, LocalDate birthData, String email, String personalNum) {
        this.name = name;
        this.loginID = loginID;
        this.password = password;
        this.birthData = birthData;
        this.email = email;
        this.personalNum = personalNum;
    }

    public void displayname() {System.out.println(this.name);}
    public void displayloginID() {System.out.println(this.loginID);}
    public void displaypassword() {System.out.println(this.password);}
    public void displayemail() {System.out.println(this.email);}
    public void displaypersonalNum() {System.out.println(this.personalNum);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
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

    public String getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(String personalNum) {
        this.personalNum = personalNum;
    }

    @Override
    public String toString() {  //출력시 문구
        return  "이름: " + name + '\n' +
                "아이디: " + loginID + '\n' +
                "비밀번호: " + password + '\n' +
                "생년월일: " + birthData +'\n'+
                "이메일: " + email + '\n' +
                "주민번호: " + personalNum + '\n';
    }
}
