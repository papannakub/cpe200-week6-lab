package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;

    public void addUser(IUser user)
    {
    }

    public void addUser(String userName, String password)
    {
    }

    public void deleteUser(IUser user)
    {

    }

    public boolean exists(IUser user)
    {
        return false;
    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        return null;
    }

    public int count()
    {
        return 0;
    }

    public IUser[] getUserArray()
    {
        return null;
    }
}
