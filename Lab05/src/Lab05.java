import java.time.LocalDate;

public class Lab05{
    public static void main(String[] args) throws Exception
    {
        User john = new User("John", LocalDate.of(1954, 2, 18));
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas", LocalDate.of(1964, 1, 7));
        nicolas.displayInfo();

        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}