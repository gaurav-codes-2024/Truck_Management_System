import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTruckById
{
    public static void delete_truck_by_id(Connection connection, Scanner sc)
    {
        System.out.println("Enter the Truck Id which you want to delete  : ");
        int truck_id = sc.nextInt();
        try{
            String delete_query = " delete from truck where id = ' "+truck_id+"  ' ";
            Statement statement = connection.createStatement();
            statement.executeUpdate(delete_query);
            System.out.println(" truck id number "+truck_id+" deleted successfully ");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
