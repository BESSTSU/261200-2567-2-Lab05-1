import java.time.LocalDate;
import java.util.Locale;

public class Admin extends User
{

public Admin()
    {
        super();
    }
    public  Admin(String name ,  int year, int month, int day )
    {
        super(name, year, month, day);
    }
        public void displayInfo()    //เเสดง
    {
        super.displayInfo();
        System.out.println("User type: admin.");

    }
    public void displayInfo(boolean full)
    {
        if (full)
        {
            super.displayInfo();
            System.out.println("User type: admin.");
        }
        else
        {
            System.out.println("Name: " + getName());
        }
    }

}
