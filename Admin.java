import java.util.ArrayList;
public class Admin extends User
{
    private boolean isAdmin = true;
    public Admin(String Name, String Phone){
            setName(Name);
            setPhone(Phone);
        }
    public boolean getIsAdmin ()
    {
        return isAdmin;
    }
    public ArrayList <Admin> adminList;
    
    public int getsize()
    {
        return adminList.size();
    }
}