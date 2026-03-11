class PhonePay{
	
	static double searchInsurancePremium(String insuranceName){
	
	System.out.println("searchInsurancePremium invoked...");
	if(insuranceName == "hdfcc"){
	
	return 8999.0;
	
	}else if(insuranceName == "star"){
	
	return 788676.9;
	
	}else if(insuranceName == "icici"){
	
	return 875645.99;
	
	}else if(insuranceName == "tvtv"){
		
	return 7545.99;
		
	}else if(insuranceName== "toyota"){
		
		return 867637.09;
		
	
	 }else 
	 {
		
		System.out.println("not a value");
	 }
		return 0.0;
	}
	

}