package sam;

public class Order {
	int oid;
	String oname;

	public Order() {
	}

	public Order(int oid, String oname) {
		super();
		this.oid = oid;
		this.oname = oname;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + "]";
	}
	
	
}
