package facegarden;

public class Customer extends Main {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int registerID = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	
	void register(){ 
		
		System.out.println(getName()+"\n"+ getAddress()+"\n"+ getContactNumber()+"\n"+getEmail()+"\n"+getProofType()+"\n"+getProofID());
		System.out.println("Thanks for registration and your Registeration ID is "+ ++registerID);	
	}
	
}
