package siddhant;

public class gameenter {
	private String Uname;
	private int Upass;

	public gameenter(String Uname, int Upass)
	{
		this.Uname = Uname;
		this.Upass = Upass;
	}
	
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public int getUpass() {
		return Upass;
	}
	public void setUpass(int upass) {
		Upass = upass;
	}
}
