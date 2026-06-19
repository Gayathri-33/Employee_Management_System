# Employee Management System

## 📌 Overview
The Employee Management System is a Java console application that manages employee records using JDBC and the DAO pattern. It supports CRUD operations (Create, Read, Update, Delete) with a simple menu-driven interface and MySQL backend.

## ✨ Features
- ➕ Add new employees
- 🔍 Search employees by ID
- ✏️ Update employee salary with bonus
- ❌ Delete employees by ID
- 📊 Interactive console menu

## 🛠️ Tech Stack
- **Language:** Java  
- **Database:** MySQL  
- **Connectivity:** JDBC  
- **Design Pattern:** DAO  

## 📂 Project Structure
- `Employee.java` → Model class for employee entity  
- `EmployeeDAO.java` → Database operations (add, search, update, delete)  
- `DBConnection.java` → Handles database connection  
- `Main.java` → Menu-driven console application  

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
2.Configure your MySQL database and update credentials in DBConnection.java.

3.Compile and run:
 javac Main.java
 java Main
4.Use the menu options to manage employees interactively.
Example usage: 
1. Add Employee
2. Search Employee
3. Update Employee
4. Delete Employee
5. Exit
🤝 Contributing
Contributions are welcome! Fork the repo, make changes, and submit a pull request.

📜 License
This project is licensed under the MIT License.
