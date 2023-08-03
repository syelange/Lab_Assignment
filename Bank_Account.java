package Branch;
public class Bank_Account {
	String Bank_name,user_name,branch_name;
	private int ac_no,pin=9874,bal=2000;
	int amount;																	//Using the getter and setter methods
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public int getPin() {
		return pin;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
}