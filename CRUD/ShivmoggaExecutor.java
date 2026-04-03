class ShivmoggaExecutor {

	public static void main(String[] s){
	
	Shivmogga ref=new Shivmogga();
	
	//int pincode=577245;
	boolean added= ref.addPinCode(5577245);
	System.out.println(added);
	
	int pincode=234325;
	added=ref.addPinCode(pincode);
	System.out.println(added);
	
	ref.getPincodeAddress();
	
	
	}

	}