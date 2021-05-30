public class Service extends Entity
{
    /*private double time;*/
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
    /*@Override
    public double getTime(){
        return time;
    }*/
}