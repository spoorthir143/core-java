class ArunExecutor{

	public static void main(String[] a){
	
	ArunIce ref=new ArunIce();
	
	boolean added= ref.addIceCreame("Choclate");
	System.out.println(added);
	
	added=ref.addIceCreame("vanila");
	System.out.println(added);
	
	added=ref.addIceCreame("coconut");
	System.out.println(added);
	
	added=ref.addIceCreame("butterscoch");
	System.out.println(added);
	
	added=ref.addIceCreame("mangoNut");
	System.out.println(added);
	
	added=ref.addIceCreame("chill choco");
	System.out.println(added);
	
	ref.getIceCreame();
	
	
	
	String Creame= ref .getIceCreameByName("vanila");
	System.out.println(Creame +"is valid");
	
	//update
	
	boolean iceCreamUpdate= ref.updateIceCreame("vanila", "novelty vanila");
	System.out.println(iceCreamUpdate);
	
	ref.getIceCreame();
	
	
	}
	
	}