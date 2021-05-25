abstract public class Entity 
{
   private String name;
   private String description;
   private int id;
   private int matORser;
   public String getEntityInfo()
    {  
        return "Name is: " + this.name + " Description is: " + this.description + " Id is: " + id;
    }
   abstract String getDetails();
   public String to_string()
    {
        return "The Info Of the Entity: " + this.getEntityInfo() + "The Details of the Material/Service: " + this.getDetails();
    }
   public int getmatORser()
   {
       return matORser;    
   }
   public void setmatORser(int mOs)
   {
       matORser = mOs;    
   }
   public int getID()
   {
       return id; 
   }
   public void setID(int ID)
   {
        id = ID;
   }
}
