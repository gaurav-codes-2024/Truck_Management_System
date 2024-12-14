import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTruckById {

    public static void update_truck_by_id(Connection connection, Scanner sc) {
        try {
            System.out.println("Enter the Truck ID of truck where you want to update ");
            int TruckID = sc.nextInt();
            if (!TruckIdExist(connection, TruckID)) {
                System.out.println("Truck Id not found in the database");
                return;
            }
            System.out.println("What would you like to update ?");
            System.out.println("1. Truck Company Name");
            System.out.println("2. Truck Model Number");
            System.out.println("3. Truck Capacity");
            System.out.println("4. Driver Name");
            System.out.println("5. Driver Address");
            System.out.println("6. Driver Mobile Number");
            System.out.println("7. Go to Main Menu");
            System.out.println("Choose option");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Truck Company Name : ");
                    String updated_truck_company_name = sc.next();
                    try {
                        String update_query = "update truck set truck_company_name = '" + updated_truck_company_name + "' " +
                                "where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck Company name updated successfully.....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter Truck Model Number : ");
                    String truck_model_number = sc.next();
                    try {
                        String update_query = "update truck set truck_model_number = ' " + truck_model_number + " ' " +
                                " where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck Model Number updated successfully....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter Truck Capacity : ");
                    int truck_capacity = sc.nextInt();
                    try {
                        String update_query = "update truck set truck_capacity = ' " + truck_capacity + " ' " +
                                " where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck Capacity updated successfully....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter Driver Name : ");
                    String driver_name = sc.next();
                    try {
                        String update_query = "update truck set driver_name = ' " + driver_name + " ' " +
                                " where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck driver_name updated successfully....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Enter Driver Address : ");
                    String driver_address = sc.next();
                    try {
                        String update_query = "update truck set driver_address = ' " + driver_address + " ' " +
                                " where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck driver_address updated successfully....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Enter Driver Mobile Number : ");
                    String driver_mobile_number = sc.next();
                    try {
                        String update_query = "update truck set driver_mobile_number = ' " + driver_mobile_number + " ' " +
                                " where id = '" + TruckID + "' ";
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(update_query);
                        System.out.println("Truck driver_mobile_number updated successfully....");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean TruckIdExist(Connection connection ,int TruckID)
        {
          try{
            String id_exist_query = "select id from truck where id = "+ TruckID;
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


