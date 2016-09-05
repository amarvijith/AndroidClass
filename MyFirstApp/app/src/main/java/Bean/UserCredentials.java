package Bean;

import java.io.Serializable;

/**
 * Created by 502428103 on 9/3/2016.
 */
public class UserCredentials implements Serializable {
    String UserName, Password;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
