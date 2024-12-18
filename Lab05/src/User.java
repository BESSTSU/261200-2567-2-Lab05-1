import java.time.LocalDate;

public class User
{
    private String name ;
    private LocalDate dob ;

    public  User()
    {
        this.name = null;
        this.dob= LocalDate.now();
    }
    public  User(String name , int year, int month, int day)
    {
        this.name = name;
        this.dob= LocalDate.of(year,month, day);
    }
    public void displayInfo()    //เเสดง
    {
        System.out.println("Name :" +name);
        System.out.println("Locale :" +dob);
    }
    public String getName()
    {
        return name;
    }
    public LocalDate getDob() {
         return dob;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }

}


