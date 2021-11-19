package spec;

public class User {

        private String username;
        private String password;
        private Privilege privilages;

        public User(String username, String password,Privilege privilages) {
            this.username = username;
            this.password = password;
            this.privilages = privilages;
        }

        public User() {
        }

        public String getPassword() {
            return password;
        }

        public String getUsername() {
            return username;
        }


        public void setPassword(String password) {
            this.password = password;
        }

        public void setUsername(String username) {
            this.username = username;
        }



        public Privilege getPrivilages() {
            return privilages;
        }

        public void setPrivilages(Privilege privilages) {
            this.privilages = privilages;
        }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", privilages=" + privilages +
                '}';
    }
}
