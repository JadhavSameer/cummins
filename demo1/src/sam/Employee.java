package sam;

public class Employee {
	int id;
	String name;
	Order order;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", order=" + order + "]";
	}


//	public static void main(String[] args) {
//		Emp e = new Emp("sasa",1);
//		System.out.println(e);
//	}
//	
//	record Emp(String name,int id) {}
}
