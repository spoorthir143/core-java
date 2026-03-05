class SuperMaretExe {

	public static void main(String[] market)
	{
	
	String soapBrands[]=SuperMarets.searchBrandByProduct("soap");
	
	for( String soap:soapBrands)
		{
		System.out.println(soap);
		}
		
	String shampooBrands[]=SuperMarets.searchBrandByProduct("shampoo") ;
	for(String shampoo:shampooBrands){
		System.out.println(shampoo);
	}
	}
	
	
	


}