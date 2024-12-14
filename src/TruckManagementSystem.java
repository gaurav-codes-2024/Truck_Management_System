import java.sql.*;
import java.util.Scanner;
public class TruckManagementSystem{
    public static final String url = "jdbc:mysql://localhost:3306/truckManagementDb";
    public static final String load_driver = "com.mysql.cj.jdbc.Driver";
    public static final String username = "root";
    public static final String password = "root";

    public static void main(String[] args) {
        try{
            Class.forName(load_driver);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            while(true){
                System.out.println();
                System.out.println("***************Truck Management System********************");
                Scanner sc =new Scanner(System.in);
                System.out.println("1. Add New Truck Details");
                System.out.println("2. Find a Truck By Id");
                System.out.println("3. View All Truck Detail");
                System.out.println("4. Update Truck Detail By Id");
                System.out.println("5. Delete Truck By Id");
                System.out.println("6. Exit");
                System.out.println("Choose an Option  : ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                          InsertTruck.insert_truck_detail(connection,sc);
                        break;
                    case 2:
                        FindTruckById.find_truck_by_id(connection,sc);
                        break;
                    case 3:
                        ViewAllTruck.view_all_truck(connection,sc);
                        break;
                    case 4:
                        UpdateTruckById.update_truck_by_id(connection,sc);
                        break;
                    case 5:
                        DeleteTruckById.delete_truck_by_id(connection,sc);
                        break;
                    case 6:
                        System.exit(0);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}