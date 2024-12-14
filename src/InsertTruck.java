import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTruck {
    public  static void insert_truck_detail(Connection connection, Scanner sc){
        try{
            System.out.println("Enter the details of Truck and Truck Driver :");
            System.out.println();
            System.out.println("Enter Truck Company Name : ");
            String truck_company_name = sc.next();
            System.out.println("Enter Truck Model Number : ");
            String truck_model_number = sc.next();
            System.out.println("Enter Truck Capacity : ");
            int truck_capacity = sc.nextInt();
            System.out.println("Enter Driver Name : ");
            String driver_name = sc.next();
            System.out.println("Enter Driver Address : ");
            String driver_address = sc.next();
            System.out.println("Enter Driver Mobile Number : ");
            String driver_mobile_number =sc.next();
            String insert_query = "insert into truck (truck_company_name, truck_model_number,truck_capacity,driver_name,driver_address,driver_mobile_number) " +
                    "values ('"+truck_company_name+"','"+truck_model_number+"','"+truck_capacity+"','"+driver_name+"','"+driver_address+"','"+driver_mobile_number+"')";

            Statement statement = connection.createStatement();
            int affectedRows = statement.executeUpdate(insert_query);
            if(affectedRows>0){
                System.out.println("Insertion of Truck Details Successfully..... ");
            }
            else{
                System.out.println("Insertion of Truck Details Failed.......");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
