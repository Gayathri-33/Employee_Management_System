import java.util.*;
import java.sql.*;
public class EmployeeManagement {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DBConnection.getConnection();
		System.out.println("Connection Established");
		System.out.println("Enter the choice (1-5): ");
		
		while(true) {
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the employee id: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the employee name: ");
					String name = sc.nextLine();
					System.out.println("Enter the department: ");
					String dept = sc.nextLine();
					System.out.println("Enter the salary: ");
					Double salary = sc.nextDouble();
					Employee emp = new Employee(id,name,dept,salary);
					EmployeeDAO ed = new EmployeeDAO();
					ed.addEmployee(emp);
					break;
			case 2: EmployeeDAO ed3 = new EmployeeDAO();
					ed3.viewEmployee();
					break;
			case 3: System.out.println("Enter the id need to be searched: ");
					int id1 = sc.nextInt();
					EmployeeDAO ed1 = new EmployeeDAO();
					ed1.searchEmployee(id1);
					break;
			case 4:
			    	System.out.println("Enter the employee id: ");
			    	int id11 = sc.nextInt();

			    	System.out.println("Enter the bonus: ");
			    	double bonus = sc.nextDouble();

			    	EmployeeDAO ed11 = new EmployeeDAO();
			    	ed11.updateEmployee(id11, bonus);

			    	break;
			case 5: System.out.println("Enter the id to be deleted: ");
					int id111 = sc.nextInt();
					EmployeeDAO ed2 = new EmployeeDAO();
					ed2.deleteEmployee(id111);
					break;
			default: System.out.println("Enter the correct choice from 1 to 5");
				     break;
			
			}
		}
	}

}
