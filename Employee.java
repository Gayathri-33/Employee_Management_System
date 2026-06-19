import java.util.*;
public class Employee {
	static int emp_id;
	static String emp_name;
	static String department;
	static double salary;
	public Employee(int emp_id , String emp_name , String department , double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.department = department;
		this.salary = salary;
	}
	public static int getEmp_id() {
		return emp_id;
	}
	public static void setEmp_id(int emp_id) {
		Employee.emp_id = emp_id;
	}
	public static String getEmp_name() {
		return emp_name;
	}
	public static void setEmp_name(String emp_name) {
		Employee.emp_name = emp_name;
	}
	public static String getDepartment() {
		return department;
	}
	public static void setDepartment(String department) {
		Employee.department = department;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employee.salary = salary;
	}

}
