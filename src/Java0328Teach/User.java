package Java0328Teach;

import java.time.LocalDate;

    public class User {
        String name;
        String loginId;
        String password;
        LocalDate birthDate;
        String email;

/*        Lecture[] lectures; //이 클래스에 계속 무언가를 붙이게 된다면 굉장히 무거워질 수 있다.*/

        public User() {
        }

        public User(String name, String loginId, String password, LocalDate birthDate, String email) {
            this.name = name;
            this.loginId = loginId;
            this.password = password;
            this.birthDate = birthDate;
            this.email = email;
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

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return name + ", " + loginId + ", " + birthDate.toString();
        }
    }
