import java.util.ArrayList;
public class Admin extends User
{
    private boolean isAdmin = true;
    public Admin(int id, String name, String phone){
            setName(name);
            setPhone(phone);
            setID(id);
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
    public String getphone()
    {
        return getPhone();
    }
}