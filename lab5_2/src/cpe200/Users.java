package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList;
    public Users(){
        userList = new ArrayList<IUser>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);

    }

    public void addUser(String userName, String password)
    {
        User  user= new User();
        user.setUserName(userName);
        user.setPassword(password);
        userList.add(user);
    }

    public void deleteUser(IUser user)
    {
        if(userList.isEmpty())
        {
            throw new RuntimeException();
        }
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                userList.remove(i);
            }
        }

    }

    public boolean exists(IUser user)
    {
        int ans=0;
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                return true;
            }
        }
        return false;

    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        User  user= new User();
        user.setUserName(userName);
        int ans=0;
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                ans=i;
            }
        }
        return userList.get(ans);
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);
    }
}
