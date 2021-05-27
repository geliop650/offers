public class Service extends Entity
{
    public String getDetails()
    {
        return "This is a Service";    
    }    
    public Service (String name, int id)
    {
        setName(name);
        setID(id);
        setmatORser(0);   
    }
}