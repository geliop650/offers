public class Admin extends User
{
    private boolean isAdmin = true;
    public Admin () {}
    public Admin(String Name, String Phone){
            setName(Name);
            setPhone(Phone);
        }
    public boolean getIsAdmin ()
    {
        return isAdmin;
    }

}