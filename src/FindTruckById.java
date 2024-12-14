import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FindTruckById {
    public static  void find_truck_by_id(Connection connection, Scanner sc){
        System.out.println("Enter the ID of truck to find its details : ");
        int find_id = sc.nextInt();
        if (!TruckIdExist(connection,find_id)) {
            System.out.println("Truck Id not found in the database");
            return;
        }
        String find_query = "select * from truck where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(find_query);
            preparedStatement.setInt(1,find_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt(1));
                System.out.println("Truck_company_name : " + resultSet.getString(2));
                System.out.println("Truck_model_number : " + resultSet.getString(3));
                System.out.println("Truck_capacity : " + resultSet.getInt(4));
                System.out.println("Driver_name : " + resultSet.getString(5));
                System.out.println("Driver_address : " + resultSet.getString(6));
                System.out.println("Driver_mobile_number : " + resultSet.getString(7));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean TruckIdExist(Connection connection ,int find_id)
    {
        try{
            String id_exist_query = "select id from truck where id = "+ find_id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(id_exist_query);
            return  resultSet.next();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}
