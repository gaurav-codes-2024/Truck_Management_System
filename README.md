# Truck Management System

## **Overview**
The **Truck Management System** is a console-based application built using Java and MySQL. It allows users to manage truck-related information, including truck details, driver information, and database interactions. This system supports essential CRUD (Create, Read, Update, and Delete) operations on the truck database.

The system provides an interactive menu for users to select various options such as adding a new truck, finding a truck by its ID, viewing all truck details, updating existing truck details, and deleting a truck from the database.

---

## **Features**
1. **Add New Truck Details**: Users can add a new truck's information to the database, including the truck company, model, capacity, and driver details.
2. **Find a Truck By ID**: Users can search for a truck's details using its unique ID.
3. **View All Truck Details**: Displays all trucks stored in the system with their respective details.
4. **Update Truck Details By ID**: Allows users to update specific details of a truck by providing its unique ID.
5. **Delete Truck By ID**: Enables users to delete a truck's record from the database.
6. **Exit**: Closes the application.

---

## **Project Structure**

```
├── TruckManagementSystem.java  # Main entry point of the application
├── InsertTruck.java             # Handles inserting new truck details into the database
├── FindTruckById.java           # Handles searching for truck details by its ID
├── ViewAllTruck.java            # Displays all truck details from the database
├── UpdateTruckById.java         # Handles updating truck details by its ID
├── DeleteTruckById.java         # Deletes a truck's record from the database
```

---

## **Database Setup**

1. **Create Database**:
   ```sql
   CREATE DATABASE truckManagementDb;
   ```

2. **Create Table**:
   ```sql
   CREATE TABLE truck (
       id INT AUTO_INCREMENT PRIMARY KEY,
       truck_company_name VARCHAR(255),
       truck_model_number VARCHAR(255),
       truck_capacity INT,
       driver_name VARCHAR(255),
       driver_address VARCHAR(255),
       driver_mobile_number VARCHAR(20)
   );
   ```

---

## **How to Run the Project**

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd truck-management-system
   ```

2. **Setup MySQL Database**:
   - Ensure MySQL is installed and running.
   - Create a database and table as described in the **Database Setup** section.

3. **Configure Database Connection**:
   - Update the `TruckManagementSystem.java` file with your MySQL database credentials:
     ```java
     public static final String url = "jdbc:mysql://localhost:3306/truckManagementDb";
     public static final String username = "root";
     public static final String password = "root";
     ```

4. **Run the Program**:
   - Compile and run the program using the following command:
     ```bash
     javac TruckManagementSystem.java
     java TruckManagementSystem
     ```

---

## **How it Works**

1. **Menu Navigation**:
   - The system presents a menu where users can select options by entering the corresponding number.
   - The selected option triggers one of the following actions: Insert, View, Update, Find, Delete, or Exit.

2. **Database Interactions**:
   - **Insert**: Adds a new truck to the database using a SQL `INSERT` query.
   - **View All**: Displays all trucks by executing a `SELECT * FROM truck` query.
   - **Find By ID**: Searches for a truck by ID using a `SELECT * FROM truck WHERE id = ?` query.
   - **Update By ID**: Updates specific fields of a truck using an `UPDATE` SQL query.
   - **Delete By ID**: Deletes a truck record from the database using a `DELETE` query.

---

## **File Descriptions**

### **1. TruckManagementSystem.java**
- **Role**: Main entry point for the application.
- **Responsibilities**:
  - Displays the menu.
  - Calls appropriate classes and methods to execute user commands.

### **2. InsertTruck.java**
- **Role**: Handles the insertion of new truck records into the database.
- **Key Function**:
  - Accepts truck and driver details from the user.
  - Executes an `INSERT INTO truck` SQL query to store the details in the database.

### **3. FindTruckById.java**
- **Role**: Fetches and displays truck details for a given truck ID.
- **Key Function**:
  - Uses a `SELECT * FROM truck WHERE id = ?` prepared statement.
  - Validates if the ID exists before attempting to fetch details.

### **4. ViewAllTruck.java**
- **Role**: Displays all trucks from the database.
- **Key Function**:
  - Uses a `SELECT * FROM truck` query to display truck details in a formatted manner.

### **5. UpdateTruckById.java**
- **Role**: Updates specific truck details by ID.
- **Key Function**:
  - Allows the user to select which part of the truck's information to update.
  - Uses an `UPDATE truck SET column = value WHERE id = ?` query.

### **6. DeleteTruckById.java**
- **Role**: Deletes a truck record by ID.
- **Key Function**:
  - Accepts the truck ID to delete.
  - Executes a `DELETE FROM truck WHERE id = ?` query.

---

## **Example Usage**

1. **Adding a New Truck**
   ```
   Enter Truck Company Name: ABC Logistics
   Enter Truck Model Number: TMX123
   Enter Truck Capacity: 20
   Enter Driver Name: John Doe
   Enter Driver Address: 123 Elm St
   Enter Driver Mobile Number: 9876543210
   Insertion of Truck Details Successful.
   ```

2. **Finding a Truck by ID**
   ```
   Enter the ID of the truck to find its details: 1
   ID: 1
   Truck Company Name: ABC Logistics
   Truck Model Number: TMX123
   Truck Capacity: 20
   Driver Name: John Doe
   Driver Address: 123 Elm St
   Driver Mobile Number: 9876543210
   ```

3. **Updating a Truck's Details**
   ```
   Enter the Truck ID of the truck where you want to update: 1
   What would you like to update?
   1. Truck Company Name
   2. Truck Model Number
   3. Truck Capacity
   4. Driver Name
   5. Driver Address
   6. Driver Mobile Number
   7. Go to Main Menu
   Choose option: 1
   Enter New Truck Company Name: XYZ Logistics
   Truck Company name updated successfully.
   ```

4. **Deleting a Truck**
   ```
   Enter the Truck ID to delete: 2
   Truck ID number 2 deleted successfully.
   ```

---

## **Potential Improvements**
- Use **PreparedStatement** instead of **Statement** to prevent SQL injection.
- Implement proper **input validation** for fields like truck capacity and mobile numbers.
- Use **try-with-resources** to ensure proper resource management and avoid connection leaks.
- Add better **error handling** and **user-friendly messages** for exceptions.
- Refactor the code to use **modular methods** for better readability.

---

## **Technologies Used**
- **Java**: Core language for building the system.
- **MySQL**: Relational database to store truck and driver details.
- **JDBC**: Java Database Connectivity for database interaction.

---

## **License**
This project is licensed under the MIT License.

---

If you have any questions, feel free to raise an issue or contribute to the project.

**Happy Coding!** 🚚🚛

