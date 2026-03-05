class HospitalVictoria{
	
	static String doctersNames[]={"Dr.Narsimha","Dr.Vishnu Prasad","Ram Dev","Krishna murty","HariKrishna"};
	static int wardsNumbers[]={1,2,3,4,5,6,7,8,9};
	
	public static void getDocters(){
	
	System.out.println("Get Docters name Start here:");
	
	for(String reference: doctersNames)
	System.out.println(reference);

	for(int ref: wardsNumbers)
		System.out.println(ref);
	
	System.out.println("End the getDocters name:");
	
	}
	
	

}