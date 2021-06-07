public class Service extends Entity
{
    public String getDetails()
    {
        return "This is a Service";    
    }    
    public Service (int id, String name)
    {
        setName(name);
        setID(id);
        setIsService(true);
    }
}