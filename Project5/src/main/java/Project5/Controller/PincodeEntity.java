package Project5.Controller;

public class PincodeEntity {

	private String Pincode; 
	private String CircleName;
	
	public PincodeEntity(String pincode, String circleName) {
		super();
		Pincode = pincode;
		CircleName = circleName;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getCircleName() {
		return CircleName;
	}
	public void setCircleName(String circleName) {
		CircleName = circleName;
	} 
	
}
