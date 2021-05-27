import java.util.*;
public class Menu
{
    String phone;
    public void start()
    {
        System.out.println("Please enter your phone number: ");
        Scanner scanner = new Scanner(System.in);
        phone = scanner.nextLine();
        for (int i=0; i<adminList.size(); i++)
        {
            if(phone == adminList.get(i).phone)
            {
                System.out.println("This is an Admin.");
            }
        }
    }
        
}
