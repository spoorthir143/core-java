class Shivmogga{

		int pinCodes[]= new int[7];
		int index;
		
		public boolean addPinCode(int pinCode){
		boolean isPinCodeAdded= false;
		
		System.out.println("invoked addpincode");
		
		if(pinCode !=0 && pinCode>0){
		pinCodes[index++]=pinCode;
		isPinCodeAdded =true;
		
		}else
		System.out.println(pinCode +"invalid");
		
		return isPinCodeAdded;
		
		}
		
		public void getPincodeAddress(){
		
		System.out.println("is valid Pincode");
		
		for(int pinCode:pinCodes)
		
		System.out.println(pinCode);
		}
		
		}