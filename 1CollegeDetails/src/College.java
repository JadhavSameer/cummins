
public class College {
	private int branches;
	private String name;

	public College() {
	}

	public College(int branches, String name) {
		super();
		this.branches = branches;
		this.name = name;
	}

	public int getBranches() {
		return branches;
	}

	public void setBranches(int branches) {
		this.branches = branches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [branches=" + branches + ", name=" + name + "]";
	}
	
}
