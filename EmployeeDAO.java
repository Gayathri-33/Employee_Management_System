import java.sql.*;
import java.util.*;
public class EmployeeDAO {
	public void addEmployee(Employee emp) {
		String query = "insert into employee values (?,?,?,?)";
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, emp.getEmp_id());
			ps.setString(2, emp.getEmp_name());
			ps.setString(3, emp.getDepartment());
			ps.setDouble(4,emp.getSalary());
			int rows =ps.executeUpdate();
			System.out.println(rows+" rows affected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void viewEmployee() {
		String query = "select * from employee";
		try(Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();){
			ResultSet s = st.executeQuery(query);
			while(s.next()) {
				System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getDouble(4));
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void searchEmployee(int id) {
		String query = "select * from employee where emp_id = ?";
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, id);
			ResultSet s = ps.executeQuery(query);
			while(s.next()) {
				System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getDouble(4));
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateEmployee(int id, double bonus) {
	    String query = "UPDATE employee SET salary = salary + ? WHERE emp_id = ?";

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(query)) {

	        ps.setDouble(1, bonus);
	        ps.setInt(2, id);

	        int i = ps.executeUpdate();

	        if (i > 0)
	            System.out.println("Employee updated successfully");
	        else
	            System.out.println("Employee ID not found");

	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void deleteEmployee(int id) {
		String query = "delete from employee where emp_id = ?";
		try(Connection con = DBConnection.getConnection();
		    PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println(i+" rows affected");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
