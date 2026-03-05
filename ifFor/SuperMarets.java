class SuperMarets {

	public static String[] searchBrandByProduct(String productName){
	
	
	if(productName=="soap"){
	String soapBrands[]={"nirma","shahi","santoor"};
	return soapBrands;
	}
	
	if(productName=="shampoo"){
	String shampooBrands[]={"silk","clinic","tresseme","chikk","chikkEggwhite"};
	return shampooBrands;
	}
	return new String[]{"product not found"};
	}
	
	
}