/* Map Interface
Create a Map collection of 10 employees (eid,ename,esal). Consider empid as key and empObj as a value for the key. 
	11.1 First Display these collection in sorted order. 
	11.2 Remove employees having salary < 15000 from this collection.
	11.3 Add remaining employees into new map collection.
	11.4 Fetch all these new employees on console the way it inserted in 11.3 step */



package SessionTask;
import java.util.HashMap;
import java.util.Map;
public class Mapinterface11 {

	public static void main(String[] args) {
		Map<Integer, Employee> staff = new HashMap<Integer, Employee>();
		staff.put(101, new Employee(101,"kavi",20000));
		staff.put(102, new Employee(102,"divya",30000));
		staff.put(103, new Employee(103,"aaru",9000));
		staff.put(104, new Employee(104,"krasti",8000));
		staff.put(105, new Employee(105,"manyaa",7000));
		
		System.out.println("Print all entries in the HashMap as a set");
		System.out.println(staff);
		System.out.println("=========================================");
		
		System.out.println("Remove Employee");
		staff.remove(102);
		System.out.println(staff);
		
		for (Map.Entry<Integer, Employee> entry : staff.entrySet()) {
			int key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
		
		

	}

}

class Employee{
	private int id;
	 String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}