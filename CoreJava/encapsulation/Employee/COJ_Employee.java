package encapsulation;
class Employee{
	String name;
	int employeeID;
	double salary;
	public Employee(String name, int employeeID, double salary) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}
	public String getName() {
		return name;
	} // getName closing
	public void setName(String name) {
		this.name = name;
	} // setName closing
	public int getEmployeeID() {
		return employeeID;
	} // getEmployeeID closing
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	} // setEmployeeID closing
	public double getSalary() {
		return salary;
	} // getSalary closing
	public void setSalary(double salary) {
		this.salary = salary;
	} // setSalary closing
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeID=" + employeeID + ", salary=" + salary + "]";
	}
	
} // closing employee class 

enum ManagerType{
	HR,
	SALES,
}

class Manager extends Employee{
	ManagerType type;

	public Manager(String name, int employeeID, double salary, ManagerType type) {
		super(name, employeeID, salary);
		this.type = type;
		setSalary();
	}
	
	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	void setSalary() {
		if(this.type == ManagerType.HR) {
			salary += 10000;
		}
		else {
			salary += 5000;
		}
	}
	@Override
	public String toString() {
		return "Manager [type=" + type + ", name=" + name + ", employeeID=" + employeeID + ", salary=" + salary + "]";
	}
	
	
} // manager class closing

class clerk extends Employee{
	int speed;
	int accuracy;
	int increment = 0;
	public clerk(String name, int employeeID, double salary, int speed, int accuracy) {
		super(name, employeeID, salary);
		this.speed = speed;
		this.accuracy = accuracy;
		setSalary();
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	void setSalary() {
		if(increment == 0) {
			if(speed >= 70 && accuracy >= 80) {
				salary += 1000;
				increment++;
			}
		}
	} // clerk class closing

	public String toString() {
		return "clerk [speed=" + speed + ", accuracy=" + accuracy + ", increment=" + increment + ", name=" + name
				+ ", employeeID=" + employeeID + ", salary=" + salary + "]";
	}
	
} //  String toString closing
public class COJ_Employee {

	public static void main(String[] args) {
		Manager manager = new Manager("Ramu", 101, 25000, ManagerType.HR);
		System.out.println(manager.toString());
		clerk clerk = new clerk("Krish", 103, 2500, 70, 80);
		System.out.println(clerk.toString());
		clerk.setAccuracy(90);
		clerk.setSalary();
		System.out.println(clerk.toString());
	} // closing main method 
} // class closing
