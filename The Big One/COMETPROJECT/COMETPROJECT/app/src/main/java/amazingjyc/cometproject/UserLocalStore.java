package amazingjyc.cometproject;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Andex on 18/02/2016.
 */
public class UserLocalStore {
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();

        spEditor.putString("username", user.userName);
        spEditor.putString("password", user.password);
        spEditor.putString("firstname", user.firstName);
        spEditor.putString("lastname", user.lastName);
        spEditor.putInt("idNumber", user.idNumber);
        spEditor.commit();
    }

    public User getLoggedInUser() {
        String userName = userLocalDatabase.getString("username", "");
        String password = userLocalDatabase.getString("password", "");
        String firstName = userLocalDatabase.getString("firstname", "");
        String lastName = userLocalDatabase.getString("lastname", "");
        int idNumber = userLocalDatabase.getInt("idNumber", 0);

        User storedUser = new User(userName, firstName, lastName, password, idNumber);
        return storedUser;
    }

    public void setUserLoggedin(boolean loggedIn) {
        SharedPreferences.Editor spEditor =userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedin(){
        if (userLocalDatabase.getBoolean("loggedIn", false) == true)
            return true;
        else return false;

    }

    public void ClearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }

    }

