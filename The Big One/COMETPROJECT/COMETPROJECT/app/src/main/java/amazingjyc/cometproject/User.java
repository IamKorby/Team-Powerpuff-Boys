package amazingjyc.cometproject;

/**
 * Created by Andex on 18/02/2016.
 */
public class User {
    String userName, firstName, lastName, password;
    int idNumber;

        public User(String userName, String firstName, String lastName, String password, int idNumber){
            this.userName = userName;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.idNumber = idNumber;
        }

        public User(String userName,String password) {
            this.userName = userName;
            this.password = password;
        }

}
