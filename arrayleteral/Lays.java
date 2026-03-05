class Lays{
public static void main(String[] args){

//String laysName="Chipsy";
//	String chipsIngredients[]={"Special potatoes","Vegetable oil","Flavor Enhancers",
//	"DairyIngredients","Acidity Regulators","sliced potatoes","garlic flav",
//"white granualated grains","potato powder"};

	String specialPotato="Special potatoes";
	String vegetableOil="Vegetable oil";
	String flavorEnhancers="Flavor Enhancers";
	String dairyIngredients="DairyIngredients";
	String acidityRegulators="Acidity Regulators";
	String slicedPotatoes="sliced potatoes";
	String garlicflav="garlic flav";
	String whitegranualatedgrains="white granualated grains";
	String potatoPowder="potato powder";
	
	String ingredients[]={specialPotato,vegetableOil,flavorEnhancers,dairyIngredients,
	acidityRegulators,slicedPotatoes,garlicflav,whitegranualatedgrains,potatoPowder};
	
	for(String item: ingredients)
	System.out.println(item);
	
}
}