import java.util.ArrayList;
class Donator extends User
{
    public ArrayList<Offers>offersList;
    public Donator(String Name, String Phone){
        setName(Name);
        setPhone(Phone);
    }
}