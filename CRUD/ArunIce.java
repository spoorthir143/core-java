class ArunIce{
	
	String iceCreames[]= new String[5];
	
	int index;
	
			public boolean addIceCreame(String iceCreame){
			
			
			boolean isIceCreameAdded=false;
			
			if(index < iceCreames.length){
			
			if(iceCreame !=null && !iceCreame.isEmpty())
			{
			iceCreames[index++]=iceCreame;
			isIceCreameAdded=true;
			}
			else
			System.out.println(iceCreame+"is not valid");
		
			}else
				System.out.println("ArunIce is almost full plzz contact developers...");
			
			
			return isIceCreameAdded;


		}
		
		public void getIceCreame(){
		
		System.out.println("Is valid ice creams are:" );
		
		for(String iceCreame:iceCreames)
		System.out.println(iceCreame);
		
		}
		
		
		
	public String getIceCreameByName(String iceCreameName){
		
		//String anythig=nuul
		String name=null;
		for(String iceCreame:iceCreames)
		{
			if(iceCreame==iceCreameName){
				name= iceCreame;
				break;
				
			}
			
		}
		if(name==null)
			
			System.out.println("\n"+iceCreameName+"not found");
		
			
		return name;
	}
	
		public boolean updateIceCreame(String existingIceCreameName , String updateIceCreameName){
			
			boolean isIceCreameUpdated=false;
			
			for(int index=0;index<iceCreames.length; index++){
				//String iceCreame=iceCreames[index];
				
				if(iceCreames[index]==existingIceCreameName){
					
					iceCreames[index]=updateIceCreameName;
					isIceCreameUpdated=true;
					
				}	
				}
			
			if(isIceCreameUpdated==false){
				
				System.out.println(existingIceCreameName+"not found");
			}
		
		return isIceCreameUpdated;
	}
	}
	
		
		
		