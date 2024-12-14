import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ViewAllTruck {
    public static  void view_all_truck(Connection connection, Scanner sc){
        try {
            System.out.println("All Truck Details");
            String view_all_query = "select * from truck";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(view_all_query);
            boolean i =false;
           while(i==resultSet.isLast()){
            if (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt(1));
                System.out.println("Truck_company_name : " + resultSet.getString(2));
                System.out.println("Truck_model_number : " + resultSet.getString(3));
                System.out.println("Truck_capacity : " + resultSet.getInt(4));
                System.out.println("Driver_name : " + resultSet.getString(5));
                System.out.println("Driver_address : " + resultSet.getString(6));
                System.out.println("Driver_mobile_number : " + resultSet.getString(7));
            }
           }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
