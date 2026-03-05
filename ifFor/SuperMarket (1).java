class SuperMarket
{
	public static String[] searchBrandByProduct(String productName)
	{
		if(productName=="biscuit")
		{
			String biscuitBrands[]={"Oreo","parle-G","Britannia","McVtie's","Digestive","Good day","Marie","Hide & seek","Tiger","Lotus Biscoff","Bourbon","Little Hearts","Tim tam","Arnott's","Chips Ahoy!","Belvita","Prince","Nice Times","Milk bikis","Monaco","crak jack","Treat Croissant","jacob's","Walkers Shortbread","peek freans","knoppers","bahlsen","LU","milk choco biscuits","roma","malkist","khong guan","ping pong","sunfeast","unibic","Great value","TUC"};
			return biscuitBrands;
		}
		if(productName=="shampoo")
		{
			String shampooBrands[]={"Head & Shoulders", "Pantene", "Dove", "Sunsilk", "L'Oréal", "Tresemmé", "Garnier", "Herbal Essences", "Clinic Plus", "Clear", "Rejoice", "Matrix", "Biolage", "TRESemmé Keratin Smooth", "Johnson's Baby", "Himalaya", "WOW Skin Science", "Mamaearth", "OGX", "Nizoral", "Sebamed", "Kérastase", "Redken", "Paul Mitchell", "Aussie", "Suave", "Pert Plus", "TIGI Bed Head", "Schwarzkopf", "Clairol", "Selsun Blue", "Aveeno", "The Body Shop", "Forest Essentials", "Khadi Natural", "Vatika", "Dabur"};
			return shampooBrands;
		}
		if(productName=="cookies")
		{
			String cookieBrands[]={"Oreo","Chips Ahoy!","Britannia","Parle","McVitie's","Hide & Seek","Good Day","Marie","Bourbon","Little Hearts","Tim Tam","Arnott's","Belvita","Prince","Nice Time","Milk Bikis","Monaco","Crack Jack","Jacob's","Walkers","Peek Freans","Knoppers","Bahlsen","LU","Roma","Malkist","Khong Guan","Sunfeast","Unibic","Great Value","Kroger","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Trader Joe's","Whole Foods"};
			return cookieBrands;
		}
		if(productName=="cakes")
		{
			String cakeBrands[]={"Britannia","Monginis","Theobroma","Cadbury","Nestle","Hershey's","Betty Crocker","Duncan Hines","Pillsbury","Mr Kipling","Sara Lee","Hostess","Little Debbie","Entenmann's","Bauducco","McVitie's","Parle","Sunfeast","Unibic","Great Value","365 Everyday Value","Kroger","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Trader Joe's","Whole Foods","Coles","Woolworths","Garden Bakery","Prime Bake","Daily Treat","Sweet Delight","Royal Bake","Bake Master","Bella Bakes"};
			return cakeBrands;
		}
		if(productName=="bread")
		{
			String breadBrands[]={"Britannia","Harvest Gold","Modern","Wonder Bread","Bimbo","Sara Lee","Nature's Own","Pepperidge Farm","Hovis","Warburtons","Kingsmill","Sunfeast","English Oven","Fresho","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","L'oven Fresh","Country Harvest","Dave's Killer Bread","Arnold","Brownberry","Thomas'","Baker's Delight","Prime Bake","Daily Fresh","Golden Crust"};
			return breadBrands;
		}
		if(productName=="rusk")
		{
			String ruskBrands[]={"Britannia","Parle","Sunfeast","Unibic","Bisk Farm","Priyagold","Anmol","McVitie's","Bauducco","Peek Freans","Khong Guan","Roma","Malkist","Haldiram's","Baker's Delight","Modern","Harvest Gold","English Oven","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bake","Daily Treat","Golden Bite","Royal Bake","Bella Bakes","Sweet Crunch"};
			return ruskBrands;
		}
		if(productName=="crackers")
		{
			String crackerBrands[]={"Ritz","TUC","Jacob's","Carr's","McVitie's","Britannia","Monaco","Krack Jack","Parle","Haldiram's","Khong Guan","Roma","Malkist","Cheez-It","Triscuit","Wheat Thins","Saltines","Premium","Club","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Carr's Table Water","Jacob's Cream","Sunfeast","Unibic","Prince"};
			return crackerBrands;
		}
		if(productName=="wafers")
		{
			String wafersBrands[]={"KitKat","Loacker","Manner","Tango","Timba","Pocky","Hanuta","Kinder Bueno","Perk","Lotte","Knoppers","Bauducco","Delfi","Gery","Roma","Khong Guan","Haitai","Tasto","Haldiram's","Britannia","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Treat","Daily Crunch","Sweet Bite","Royal Delight"};
			return wafersBrands;
		}
		if(productName=="chocolates")
		{
			String chocolateBrands[]={"Cadbury","Nestle","Hershey's","Ferrero Rocher","Lindt","Toblerone","Mars","KitKat","Snickers","Galaxy","Milky Way","Bounty","M&M's","Twix","Kinder","Ghirardelli","Godiva","Perugina","Guylian","Ritter Sport","Patchi","Whittaker's","Dove Chocolate","Brookside","Lotte","Meiji","Amul","Campco","Tony's Chocolonely","Green & Black's","Hammond's","Valor","Côte d'Or","Neuhaus","Milka","Taza","Endangered Species"};
			return chocolateBrands;
		}
		if(productName=="rolls")
		{
			String rollBrands[]={"Britannia","Harvest Gold","Modern","Wonder","Bimbo","Sara Lee","Nature's Own","Pepperidge Farm","Hovis","Warburtons","Kingsmill","Sunfeast","English Oven","Fresho","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","L'oven Fresh","Country Harvest","Arnold","Brownberry","Thomas'","Baker's Delight","Prime Bake","Daily Fresh","Golden Crust","Royal Bake"};
			return rollBrands;
		}
		if(productName=="candies")
		{
			String candieBrands[]={"Skittles","Starburst","Jolly Rancher","Chupa Chups","Alpenliebe","Kopiko","Pulse","Mentos","Eclairs","Werther's Original","Tootsie Roll","Haribo","Laffy Taffy","Warheads","Sour Patch Kids","Airheads","Twizzlers","Smarties","KitKat Mini","Kinder Joy","Milkybar","Halls","Ricola","Fisherman's Friend","Tango","Fox's Candy","Center Fresh","Center Fruit","Boomer","Orbit","Extra","Trident","Bazooka","Big Babol","Sugus","Maoam","Fini"};
			return candieBrands;
		}
		if(productName=="noodles")
		{
			String noodlesBrands[]={"Maggi","Top Ramen","Yippee","Indomie","Nissin","Samyang","Maruchan","Mama","Koka","Knorr","Ching's Secret","Ottogi","Paldo","Wai Wai","Sapporo Ichiban","MyKuali","Lucky Me","Ve Wong","Vifon","Acecook","Baixiang","Master Kong","A-Sha","Nongshim","Mr. Lee's","Pot Noodle","Batchelors","Blue Dragon","Thai President","Mama Sita's","Unif","Prima Taste","Kabuto","Itsuki","Tokachimen","Chunsi","Sau Tao"};
			return noodlesBrands;
		}
		if(productName=="pasta")
		{
			String pastaBrands[]={"Barilla","De Cecco","Colavita","San Remo","Ronzoni","Buitoni","Mueller's","Garofalo","La Molisana","Divella","Rummo","Voiello","Panzani","Napolina","Delverde","Seggiano","Rustichella d'Abruzzo","Priano","Signature Select","Great Value","365 Everyday Value","Simply Nature","H-E-B","Kroger","Trader Joe's","Whole Foods Market","Borges","Pastificio Di Martino","Montebello","Alce Nero","Lensi","Garibaldi","Anna","American Beauty","Dakota Growers","Creamette","Cucina & Amore"};
			return pastaBrands;
		}
		if(productName=="wheatflour")
		{
			String wheatFlourBrands[]={"Aashirvaad","Pillsbury","Fortune","Annapurna","Nature Fresh","Shakti Bhog","24 Mantra Organic","Organic Tattva","Pro Nature","Samrat","Rajdhani","Golden Temple","Laxmi","Deep","Sujata","King Arthur","Gold Medal","Bob's Red Mill","White Lily","Hodgson Mill","Arrowhead Mills","Great Value","365 Everyday Value","Kroger","Signature Select","Heera","Elephant Atta","Ashoka","Tata Sampann","Farm Fresh","Swad","MTR","Vikram Mills","Healthy Choice","Natureland Organics","Patanjali","Ahaar"};
			return wheatFlourBrands;
		}
		if(productName=="cornflour")
		{
			String cornFlourBrands[]={"Argo","Kingsford","Clabber Girl","Bob's Red Mill","Rumford","Heera","Deep","Swad","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Tata Sampann","Fortune","Aashirvaad","Rajdhani","Samrat","Shakti Bhog","Golden Temple","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","White Wings","McKenzie's","Carey","Brown & Polson","Weikfield","Blue Bird","Laxmi","Ashoka","MTR","Farm Fresh","Healthy Choice","Annapurna"};
			return cornFlourBrands;
		}
		if(productName=="oats")
		{
			String oatsBrands[]={"Quaker","Kellogg's","Saffola","Bagrry's","Nature's Path","Bob's Red Mill","McCann's","Weetabix","Jordan's","Flahavan's","Alpen","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Tata Soulfull","True Elements","Yoga Bar","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Lion Oats","Morning Foods","Mornflake","Freedom Foods","Uncle Tobys","Coles","Woolworths","Waitrose","Tesco","Marks & Spencer","Nestle","PepsiCo","General Mills","Patel Brothers"};
			return oatsBrands;
		}
		if(productName=="cereal")
		{
			String cerealBrands[]={"Kellogg's","Nestle","General Mills","Post","Quaker","Weetabix","Cheerios","Corn Flakes","Froot Loops","Special K","Lucky Charms","Frosted Flakes","Cinnamon Toast Crunch","Raisin Bran","Rice Krispies","Cap'n Crunch","Honey Bunches of Oats","Shredded Wheat","Cocoa Puffs","Golden Grahams","Trix","Kix","Chex","Grape-Nuts","Alpen","Jordan's","Nature's Path","Bob's Red Mill","Bagrry's","True Elements","Yoga Bar","24 Mantra Organic","Great Value","365 Everyday Value","Kroger","Tesco","Marks & Spencer"};
			return cerealBrands;
		}
		if(productName=="cornflakes")
		{
			String cornflakesBrands[]={"Kellogg's","Nestle","Bagrry's","Mohun's","Weetabix","Post","General Mills","Quaker","Alpen","Jordan's","Nature's Path","Bob's Red Mill","24 Mantra Organic","True Elements","Yoga Bar","Saffola","Patel Brothers","Great Value","365 Everyday Value","Kroger","Tesco","Marks & Spencer","Waitrose","Coles","Woolworths","Lion","Freedom Foods","Uncle Tobys","Golden Morning","Mornflake","Signature Select","H-E-B","Natureland Organics","Pro Nature","Organic Tattva","Tata Soulfull","Britannia"};
			return cornflakesBrands;
		}		
		if(productName=="rice")
		{
			String riceBrands[]={"Daawat","India Gate","Kohinoor","Tilda","Lal Qilla","Fortune","Royal","Mahmood Rice","Falak","Guard","Shan","Alishan","Unity","Veetee","Carolina","Riceland","Lundberg","Nishiki","Kokuho Rose","Tamaki","Hinode","Botan","Three Ladies","Golden Phoenix","Elephant","Asian Best","SunRice","Riviana","Uncle Ben's","Ben's Original","Great Value","Kroger","365 Everyday Value","Signature Select","H-E-B","Coles","Tesco"};
			return riceBrands;
		}
		if(productName=="pulses")
		{
			String pulsesBrands[]={"Tata Sampann","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Aashirvaad","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Goya","Badshah","MTR","Patanjali","Organic India","Simply Organic","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Whole Foods","Trader Joe's","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Eastern","Double Horse","Annapurna","Kitchen Xpress","Farm Fresh","Healthy Choice","India Gate","Golden Harvest"};
			return pulsesBrands;
		}
		if(productName=="lentils")
		{
			String lentilBrands[]={"Tata Sampann","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Aashirvaad","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Goya","Badshah","MTR","Patanjali","Organic India","Simply Organic","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Whole Foods","Trader Joe's","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Eastern","Double Horse","Annapurna","Kitchen Xpress","Farm Fresh","Healthy Choice","Golden Harvest","India Pride"};
			return lentilBrands;
		}
		if(productName=="chickpeas")
		{
			String chickpeasBrands[]={"Goya","Bush's","Progresso","Eden Foods","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Tata Sampann","Aashirvaad","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Eastern","Double Horse","Patanjali","MTR","Kitchen Xpress","Farm Fresh","Healthy Choice","Golden Harvest","India Gate","Simply Nature"};
			return chickpeasBrands;
		}
		if(productName=="beans")
		{
			String beansBrands[]={"Bush's","Goya","Heinz","Eden Foods","B&M","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Tata Sampann","Aashirvaad","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Eastern","Double Horse","Patanjali","MTR","Kitchen Xpress","Farm Fresh","Healthy Choice","Golden Harvest","Simply Nature"};
			return beansBrands;
		}
		if(productName=="sugar")
		{
			String sugarBrands[]={"Domino","C&H","Tata","Madhur","Dhampure","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Fortune","Aashirvaad","Rajdhani","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Billington's","Wholesome","Florida Crystals","Silver Spoon","Lyle's","Mitr Phol","Mawana","Balrampur","Dalmia","Uttam","Shree Renuka","Golden Harvest","Simply Nature","India Gate"};
			return sugarBrands;
		}
		if(productName=="salt")
		{
			String saltBrands[]={"Tata Salt","Aashirvaad","Catch","Morton","Himalayan Chef","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Maldon","Saxa","Selina","Annapurna","Captain Cook","Keya","Eastern","Patanjali","Tata Sampann","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Golden Harvest","India Pride"};
			return saltBrands;
		}
		if(productName=="spices")
		{
			String spicesBrands[]={"MDH","Everest","Badshah","Catch","Eastern","MTR","Shan","National","Rajah","Schwartz","McCormick","Simply Organic","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland Organics","Tata Sampann","Aashirvaad","Fortune","Rajdhani","Laxmi","Deep","Swad","Heera","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Patanjali","Kitchen King"};
			return spicesBrands;
		}
		if(productName=="tea")
		{
			String teaBrands[]={"Tata Tea","Lipton","Tetley","Twinings","Dilmah","Yorkshire Tea","PG Tips","Red Label","Taj Mahal","Wagh Bakri","Brooke Bond","Typhoo","Bigelow","Harney & Sons","Numi","Celestial Seasonings","Teavana","Teekanne","Twinings of London","Ahmad Tea","Goodricke","Society Tea","Girnar","Teabox","Vahdam","24 Mantra Organic","Organic India","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Marks & Spencer"};
			return teaBrands;
		}
		if(productName=="coffee")
		{
			String coffeeBrands[]={"Nescafe","Bru","Starbucks","Lavazza","Illy","Folgers","Maxwell House","Peet's","Dunkin'","Tim Hortons","Tata Coffee","Blue Tokai","Davidoff","Jacobs","Carte Noire","McCafe","Death Wish","Eight O'Clock","Gevalia","Kicking Horse","Community Coffee","Mount Hagen","Cafe Bustelo","Segafredo","San Marco","Colombian Brew","Costa","Aroma","Tchibo","Lifeboost","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return coffeeBrands;
		}
		if(productName=="milk")
		{
			String milkBrands[]={"Amul","Mother Dairy","Nestle","Horizon","Lactaid","Aavin","Nandini","Verka","Kwality","Britannia","Dairy Pure","Fairlife","Organic Valley","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","President","Arla","Anchor","Devondale","Farm Fresh","Milma","Parmalat","Danone","Yakult","Vita","Pride of Cows","Heritage","Sarda"};
			return milkBrands;
		}
		if(productName=="butter")
		{
			String butterBrands[]={"Amul","President","Anchor","Lurpak","Kerrygold","Land O Lakes","Organic Valley","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Arla","Devondale","Milma","Mother Dairy","Nandini","Aavin","Verka","Britannia","Pillsbury","Challenge","Plugra","Finlandia","Tillamook","Cabot","Vermont Creamery","Lucerne","Danone","President Salted","President Unsalted"};
			return butterBrands;
		}
		if(productName=="cheese")
		{
			String cheeseBrands[]={"Amul","Britannia","President","Kraft","Velveeta","Sargento","Tillamook","Cabot","Arla","Anchor","Laughing Cow","Babybel","Philadelphia","Organic Valley","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Bega","Devondale","Milkana","Emmi","Galbani","BelGioioso","Saputo","Almarai","Dairyland","Mother Dairy","Nandini","Verka"};
			return cheeseBrands;
		}
		if(productName=="yogurt")
		{
			String yogurtBrands[]={"Danone","Chobani","Yoplait","Fage","Siggi's","Nestle","Amul","Mother Dairy","Nandini","Aavin","Verka","Britannia","Activia","Oikos","Stonyfield","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Arla","Milma","Almarai","Yakult","Epigamia","Pride of Cows","Organic Valley","Dannon","Noosa","Liberte","Glenisk"};
			return yogurtBrands;
		}
		if(productName=="icecream")
		{
			String icecreamBrands[]={"Amul","Kwality Walls","Magnum","Cornetto","Ben & Jerry's","Haagen-Dazs","Baskin Robbins","Blue Bell","Breyers","Walls","Mother Dairy","Vadilal","Arun","Creambell","Naturals","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Talenti","Cold Stone","Dairy Queen","Blue Bunny","Tillamook","Turkey Hill","Halo Top","Graeter's","London Dairy","Gelato Messina","Movenpick"};
			return icecreamBrands;
		}
		if(productName=="softdrinks")
		{
			String softdrinksBrands[]={"Coca-Cola","Pepsi","Sprite","Fanta","7UP","Mountain Dew","Mirinda","Dr Pepper","Thums Up","Limca","Slice","Maaza","Appy Fizz","Schweppes","Canada Dry","RC Cola","A&W","Sunkist","Crush","Fresca","Big Red","Irn-Bru","Tango","Jarritos","San Pellegrino","Vimto","Barq's","Bovonto","Inca Kola","Bundaberg","Ting","Solo","Lilt","Club Soda","Top Chico","Arizona","Britvic"};
			return softdrinksBrands;
		}
		if(productName=="fruitjuice")
		{
			String fruitjuiceBrands[]={"Tropicana","Real","Minute Maid","B Natural","Paper Boat","Ocean Spray","Del Monte","V8","Simply","Sunquick","Appy","Maaza","Slice","Frooti","Capri-Sun","Ribena","Welch's","Lakewood","Ceres","Happy Day","POM","Florida's Natural","Langers","Santa Cruz","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Arla","Almarai"};
			return fruitjuiceBrands;
		}
		if(productName=="energydrink")
		{
			String energydrinkBrands[]={"Red Bull","Monster","Rockstar","Burn","NOS","Amp","5-hour Energy","Gatorade Fast Twitch","Prime Energy","Celsius","Bang","Reign","Lucozade","Sting","Tzinga","Cloud 9","Hell","V","Mother","Relentless","Full Throttle","Adrenaline","Power Horse","Cobra","Bison","Predator","Oxyshred","Guru","XS Energy","Volt","XXX Energy","KMX","Wild Tiger","Emerge","Carabao","Shark","Hype"};
			return energydrinkBrands;
		}
		if(productName=="mineralwater")
		{
			String mineralwaterBrands[]={"Bisleri","Aquafina","Kinley","Evian","Perrier","Voss","Fiji","Dasani","Himalayan","Bailley","Nestle Pure Life","Volvic","San Pellegrino","Glaceau Smartwater","Essentia","Arrowhead","Ozarka","Poland Spring","Deer Park","Ice Mountain","Crystal Geyser","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Highland Spring","Buxton","Mount Franklin","Ganten","Al Ain"};
			return mineralwaterBrands;
		}
		if(productName=="conditioner")
		{
			String conditionerBrands[]={"Pantene","Dove","Sunsilk","Tresemme","Garnier","Herbal Essences","Head & Shoulders","L'Oreal","Matrix","Biolage","WOW","Mamaearth","OGX","Sebamed","Kerastase","Redken","Paul Mitchell","Aussie","Suave","TIGI","Schwarzkopf","Clairol","Aveeno","The Body Shop","Forest Essentials","Khadi","Vatika","Dabur","Loreal Professional","Himalaya","Clinic Plus","Rejoice","Clear","Johnson's Baby","Wella","Nexxus","Pureology"};
			return conditionerBrands;
		}
		if(productName=="hairoil")
		{
			String hairoilBrands[]={"Parachute","Dabur Amla","Indulekha","Navratna","Bajaj Almond","Himalaya","WOW","Mamaearth","Khadi","Vatika","Kesh King","Nihar","Emami","Patanjali","Biotique","Forest Essentials","Streax","Livon","L'Oreal","Pantene","Dove","Garnier","Amla Gold","Meera","Sesa","Coconut Care","Ayush","Organic India","24 Mantra Organic","Natureland","Pro Nature","Soulflower","UrbanBotanics","WishCare","Blue Nectar","Aaranyaa","Anveya"};
			return hairoilBrands;
		}
		if(productName=="facewash")
		{
			String facewashBrands[]={"Clean & Clear","Himalaya","Garnier","Pond's","Nivea","L'Oreal","Neutrogena","Cetaphil","WOW","Mamaearth","Biotique","Patanjali","The Body Shop","Forest Essentials","Khadi","Lakme","Olay","Dove","Simple","Plum","Minimalist","Aroma Magic","Lotus","VLCC","Everyuth","Sebamed","Aveeno","Clinique","Kiehl's","Innisfree","Cosrx","Tony Moly","Good Vibes","Re'equil","Derma Co","Aqualogica","Dot & Key"};
			return facewashBrands;
		}
		if(productName=="soap")
		{
			String soapBrands[]={"Lux","Dove","Lifebuoy","Dettol","Pears","Cinthol","Santoor","Mysore Sandal","Medimix","Hamam","Himalaya","Patanjali","Biotique","Khadi","Pond's","Nivea","Olay","Liril","Rexona","Irish Spring","Dial","Zest","Caress","Yardley","Palmolive","Sebamed","Aveeno","Cetaphil","The Body Shop","Forest Essentials","Godrej No.1","Johnson's Baby","Vivel","Fiama","Park Avenue","Old Spice","Safeguard"};
			return soapBrands;
		}
		if(productName=="toothpaste")
		{
			String toothpasteBrands[]={"Colgate","Pepsodent","Close-Up","Sensodyne","Oral-B","Crest","Aquafresh","Dabur Red","Meswak","Patanjali","Vicco","Himalaya","Arm & Hammer","Tom's of Maine","Parodontax","Elmex","Signal","Zendium","Biotene","Marvis","Closeup Herbal","Colgate MaxFresh","Colgate Total","Oral-B ProHealth","Sensodyne Rapid","Sensodyne Repair","TheraBreath","Hello","Jason","Desert Essence","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return toothpasteBrands;
		}
		if(productName=="toothbrush")
		{
			String toothbrushBrands[]={"Oral-B","Colgate","Pepsodent","Close-Up","Sensodyne","Aquafresh","Reach","Arm & Hammer","GUM","Dr. Fresh","Oral-B Pro-Health","Colgate Slim Soft","Colgate ZigZag","Oral-B CrossAction","Signal","Jordan","Curaprox","TePe","Radius","Nimbus","Preserve","Hello","Tom's of Maine","Biotene","Parodontax","Elmex","Vicco","Himalaya","Patanjali","Dabur","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return toothbrushBrands;
		}
		if(productName=="mouthwash")
		{
			String mouthwashBrands[]={"Listerine","Colgate","Oral-B","Crest","Scope","Act","Sensodyne","Close-Up","Pepsodent","Himalaya","Dabur","Patanjali","Biotene","TheraBreath","Hello","Tom's of Maine","Parodontax","Elmex","Signal","Zendium","Aquafresh","GUM","CloSYS","SmartMouth","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Dentyl","Corsodyl","Betadine","Reach","Dr. Fresh","Jason"};
			return mouthwashBrands;
		}
		if(productName=="deodorant")
		{
			String deodorantBrands[]={"Axe","Nivea","Dove","Rexona","Sure","Old Spice","Gillette","Adidas","Nike","Park Avenue","Fogg","Engage","Wild Stone","Denver","Brut","Yardley","Armaf","Calvin Klein","Armani","Gucci","Versace","Hugo Boss","Jaguar","Titan Skinn","Set Wet","Layer'r Shot","Cinthol","Beardo","The Man Company","Bombay Shaving Company","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return deodorantBrands;
		}
		if(productName=="perfume")
		{
			String perfumeBrands[]={"Chanel","Dior","Gucci","Versace","Armani","Calvin Klein","Hugo Boss","Burberry","Yves Saint Laurent","Dolce & Gabbana","Paco Rabanne","Tom Ford","Givenchy","Hermes","Bvlgari","Prada","Jaguar","Davidoff","Mont Blanc","Ralph Lauren","Elizabeth Arden","Armaf","Ajmal","Rasasi","Titan Skinn","Engage","Fogg","Denver","Layer'r Shot","Victoria's Secret","Bath & Body Works","Jo Malone","Maison Margiela","Carolina Herrera","Lancome","Guess","Nautica"};
			return perfumeBrands;
		}
		if(productName=="handwash")
		{
			String handwashBrands[]={"Dettol","Lifebuoy","Savlon","Dove","Palmolive","Lux","Santoor","Godrej No.1","Fiama","Pears","Himalaya","Patanjali","Biotique","Khadi","The Body Shop","Forest Essentials","Dial","Softsoap","Method","Mrs. Meyer's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Carex","Baylis & Harding","Bath & Body Works","Vivel","Cinthol","Medimix","Sebamed","Aveeno","Nivea","Johnson's"};
			return handwashBrands;
		}
		if(productName=="bodywash")
		{
			String bodywashBrands[]={"Dove","Lux","Lifebuoy","Pears","Palmolive","Fiama","Santoor","Nivea","Olay","Dettol","Himalaya","Patanjali","Biotique","Khadi","The Body Shop","Forest Essentials","Sebamed","Aveeno","Cetaphil","Neutrogena","Method","Dial","Irish Spring","Caress","Old Spice","Yardley","Cinthol","Johnson's","Bath & Body Works","Mrs. Meyer's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return bodywashBrands;
		}
		if(productName=="bodylotion")
		{
			String bodylotionBrands[]={"Vaseline","Nivea","Dove","Pond's","Olay","Aveeno","Cetaphil","Neutrogena","Himalaya","Patanjali","Biotique","Mamaearth","WOW","The Body Shop","Forest Essentials","Johnson's","Vivel","Parachute","Vaseline Intensive Care","Lubriderm","Eucerin","Palmer's","Jergens","Bath & Body Works","Victoria's Secret","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sebamed","Khadi","Plum","Minimalist","Aroma Magic"};
			return bodylotionBrands;
		}
		if(productName=="facesunscreen")
		{
			String facesunscreenBrands[]={"Neutrogena","Lotus","Lakme","Nivea","Biotique","Himalaya","Patanjali","Mamaearth","WOW","Minimalist","The Derma Co","Aqualogica","Dot & Key","Plum","Cetaphil","Aveeno","Sebamed","La Roche-Posay","Bioderma","Vaseline","Olay","Garnier","L'Oreal","The Body Shop","Forest Essentials","Banana Boat","Coppertone","Supergoop","Blue Lizard","ISDIN","Eucerin","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return facesunscreenBrands;
		}
		if(productName=="shavingcream")
		{
			String shavingcreamBrands[]={"Gillette","Old Spice","Nivea","Park Avenue","Bombay Shaving Company","The Man Company","Beardo","Dettol","Godrej","Supermax","Vi-John","Himalaya","Patanjali","Biotique","L'Oreal","Dove Men+Care","Axe","Arko","Proraso","Barbasol","Edge","Harry's","Cremo","Truefitt & Hill","Taylor of Old Bond Street","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Clinique","Neutrogena","Cetaphil","Sebamed","Aroma Magic"};
			return shavingcreamBrands;
		}
		if(productName=="razor")
		{
			String razorBrands[]={"Gillette","Schick","Wilkinson Sword","Supermax","Bic","Harry's","Dollar Shave Club","Bombay Shaving Company","The Man Company","Beardo","Park Avenue","Vi-John","Feather","Dorco","Personna","Kai","Panasonic","Philips","Braun","Remington","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Axe","Old Spice","Godrej","Laser","Topaz","LORD","Perma-Sharp","Zorrik","Treet","Derby"};
			return razorBrands;
		}
		if(productName=="detergentpowder")
		{
			String detergentpowderBrands[]={"Surf Excel","Ariel","Tide","Rin","Wheel","Ghadi","Nirma","Persil","OMO","Skip","Gain","Arm & Hammer","Sunlight","Fab","Bonux","Bold","Daz","Breeze","Attack","Foca","Roma","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Henko","Mr. White","Trimat","Biozet","Spinz"};
			return detergentpowderBrands;
		}
		if(productName=="detergentliquid")
		{
			String detergentliquidBrands[]={"Surf Excel","Ariel","Tide","Persil","OMO","Gain","Arm & Hammer","Sunlight","Fab","Bold","Daz","Breeze","Attack","Foca","Roma","Henko","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Biozet","Trimat","Spinz","Ecover","Seventh Generation","Method","Mrs. Meyer's","Aldi Almat","Coles Ultra","Woolworths Essentials"};
			return detergentliquidBrands;
		}
		if(productName=="dishwashliquid")
		{
			String dishwashliquidBrands[]={"Vim","Pril","Exo","Joy","Fairy","Dawn","Palmolive","Sunlight","Axion","Finish","Cascade","Morning Fresh","Ecover","Seventh Generation","Method","Mrs. Meyer's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Coles","Woolworths","Aldi","Sparkle","Clean & Clear","Gala","Triple Clean","Bio Clean","Maxkleen","Safewash"};
			return dishwashliquidBrands;
		}
		if(productName=="floorcleaner")
		{
			String floorcleanerBrands[]={"Lizol","Domex","Harpic","Dettol","Savlon","Colin","Mr. Muscle","Flash","Pine-Sol","Fabuloso","Lysol","Clorox","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Method","Ecover","Seventh Generation","Aldi","Coles","Woolworths","Pronto","Cif","Gala","Maxkleen","Clean Mate","Bio Fresh","Sparkle","Home Guard"};
			return floorcleanerBrands;
		}
		if(productName=="toiletcleaner")
		{
			String toiletcleanerBrands[]={"Harpic","Domex","Lizol","Clorox","Lysol","Duck","Flash","Cif","Dettol","Savlon","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Method","Ecover","Seventh Generation","Aldi","Coles","Woolworths","Sparkle","Maxkleen","Clean Mate","Bio Fresh","Home Guard","Vim","Pril","Mr. Muscle","Sanifresh","Toilet Duck"};
			return toiletcleanerBrands;
		}
		if(productName=="glasscleaner")
		{
			String glasscleanerBrands[]={"Colin","Windex","Mr. Muscle","Cif","Lysol","Clorox","Flash","Ajax","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Method","Ecover","Seventh Generation","Aldi","Coles","Woolworths","Sparkle","Maxkleen","Clean Mate","Bio Fresh","Home Guard","Pronto","Dettol","Savlon","Vim","Gala","Axion","Sunlight"};
			return glasscleanerBrands;
		}
		if(productName=="airfreshener")
		{
			String airfreshenerBrands[]={"Odonil","Ambi Pur","Air Wick","Glade","Febreze","Godrej Aer","Lysol","Dettol","Savlon","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Method","Ecover","Aldi","Coles","Woolworths","Sparkle","Maxkleen","Clean Mate","Bio Fresh","Home Guard","Pronto","Cif","Flash","Ajax","Room Fresh","Streax","Nature's Essence"};
			return airfreshenerBrands;
		}
		if(productName=="mosquitorepellent")
		{
			String mosquitorepellentBrands[]={"Goodknight","All Out","Mortein","Hit","Raid","Odomos","Godrej","Baygon","Dettol","Savlon","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Johnson's","Himalaya","Patanjali","Biotique","Khadi","Maxkleen","Sparkle","Bio Fresh","Home Guard","Combat","Cutter","OFF!","PIC","Buzz Away","Moskill","Shieldtox"};
			return mosquitorepellentBrands;
		}
		if(productName=="batteries")
		{
			String batteriesBrands[]={"Duracell","Energizer","Panasonic","Eveready","Rayovac","GP","Sony","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Aldi","Coles","Woolworths","Varta","Philips","Kodak","Fujitsu","Toshiba","Maxell","Powercell","Rocket","Camelion","Sunbeam","Super Heavy Duty","UltraCell","Tenergy","Ansmann","PKCell"};
			return batteriesBrands;
		}
		if(productName=="ledbulb")
		{
			String ledbulbBrands[]={"Philips","Syska","Wipro","Havells","Crompton","Bajaj","Eveready","Osram","GE","Panasonic","Surya","Halogenix","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Aldi","Coles","Woolworths","Feit Electric","Sylvania","TCP","Satco","Orient","Anchor","Goldmedal","Polycab","V-Guard","Moser Baer","Opple"};
			return ledbulbBrands;
		}
		if(productName=="mobilephone")
		{
			String mobilephoneBrands[]={"Apple","Samsung","Xiaomi","Redmi","Realme","OnePlus","Oppo","Vivo","Motorola","Nokia","Google Pixel","Huawei","Honor","Asus","Sony","HTC","Lenovo","Infinix","Tecno","Itel","Micromax","Lava","Karbonn","BlackBerry","ZTE","Alcatel","Panasonic","LG","Meizu","Sharp","Nothing","iQOO","Poco","Fairphone","TCL","Blu","Gionee"};
			return mobilephoneBrands;
		}
		if(productName=="laptop")
		{
			String laptopBrands[]={"Apple","Dell","HP","Lenovo","Asus","Acer","MSI","Samsung","Microsoft","Razer","LG","Huawei","Toshiba","Fujitsu","Panasonic","Sony","Alienware","Gigabyte","Honor","Xiaomi","Avita","Chuwi","Gateway","Google Pixelbook","Vaio","Infinix","Tecno","iBall","Micromax","Zebronics","Realme","Redmi","Origin","Framework","Dynabook","Medion","HCL"};
			return laptopBrands;
		}
		if(productName=="television")
		{
			String televisionBrands[]={"Samsung","LG","Sony","Panasonic","TCL","Hisense","Philips","Sharp","Vizio","Toshiba","Haier","OnePlus","Xiaomi","Redmi","Realme","Vu","Thomson","Nokia","Motorola","Sansui","Sanyo","Hitachi","Onida","BPL","Micromax","Intex","Kodak","JVC","Skyworth","Grundig","Metz","Bang & Olufsen","Insignia","Westinghouse","Element","Polaroid","RCA"};
			return televisionBrands;
		}
		if(productName=="refrigerator")
		{
			String refrigeratorBrands[]={"LG","Samsung","Whirlpool","Godrej","Haier","Bosch","Siemens","Panasonic","Hitachi","Sharp","Electrolux","GE","Kelvinator","Voltas","Midea","Toshiba","Beko","Liebherr","Hisense","Daewoo","Fisher & Paykel","Frigidaire","Maytag","KitchenAid","Sub-Zero","Amana","Gaggenau","IFB","Onida","Sansui","Videocon","Haier Thermocool","Ariston","Candy","Blomberg","Westinghouse","Mitsubishi"};
			return refrigeratorBrands;
		}
		if(productName=="washingmachine")
		{
			String washingmachineBrands[]={"LG","Samsung","Whirlpool","IFB","Bosch","Siemens","Haier","Panasonic","Godrej","Electrolux","GE","Maytag","Midea","Beko","Hitachi","Toshiba","Sharp","Onida","Sansui","Videocon","Voltas","Kelvinator","Lloyd","Candy","Ariston","Gaggenau","Fisher & Paykel","Frigidaire","Amana","Blomberg","Westinghouse","Mitsubishi","Aiwa","Hisense","Daewoo","Intex","Micromax"};
			return washingmachineBrands;
		}
		if(productName=="microwave")
		{
			String microwaveBrands[]={"LG","Samsung","Whirlpool","IFB","Panasonic","Godrej","Haier","Bosch","Siemens","Sharp","Electrolux","GE","Toshiba","Hitachi","Midea","Beko","Onida","Voltas","Morphy Richards","Bajaj","Prestige","Usha","Kenstar","Black+Decker","Cuisinart","KitchenAid","Frigidaire","Maytag","Amana","Gaggenau","Lloyd","Candy","Ariston","Westinghouse","Hisense","Daewoo","Inalsa"};
			return microwaveBrands;
		}
		if(productName=="mixie")
		{
			String mixieBrands[]={"Preethi","Philips","Bajaj","Prestige","Butterfly","Panasonic","Sujata","Bosch","Morphy Richards","Usha","Maharaja Whiteline","Kenstar","Havells","Crompton","Orient","V-Guard","Inalsa","Wonderchef","Lifelong","Pigeon","Jaipan","Black+Decker","KitchenAid","Hamilton Beach","Cuisinart","Glen","Sunflame","Khaitan","Singer","Anjali","Baltra","Cello","Longway","Agaro","Tesora","Skyline","Orbit"};
			return mixieBrands;
		}
		if(productName=="electrickettle")
		{
			String electrickettleBrands[]={"Philips","Prestige","Bajaj","Morphy Richards","Panasonic","Havells","Crompton","Kenstar","Usha","Butterfly","Pigeon","Orpat","Inalsa","Lifelong","Agaro","Glen","Black+Decker","Hamilton Beach","KitchenAid","Cuisinart","Russell Hobbs","Breville","Kenwood","Bosch","Siemens","Tefal","Sunflame","Baltra","Cello","Longway","Jaipan","Singer","V-Guard","Orient","Wonderchef","Skyline","Orbit"};
			return electrickettleBrands;
		}
		if(productName=="pressurecooker")
		{
			String pressurecookerBrands[]={"Prestige","Hawkins","Butterfly","Pigeon","Vinod","Panasonic","Wonderchef","Cello","Bajaj","Usha","Morphy Richards","Havells","Crompton","Sunflame","Glen","Jaipan","Baltra","Agaro","Bergner","Futura","Milton","Signoraware","Stahl","Tefal","Kuhn Rikon","WMF","Magefesa","Instant Pot","KitchenAid","Cuisinart","Black+Decker","Hamilton Beach","Bosch","Siemens","Kenwood","V-Guard","Longway"};
			return pressurecookerBrands;
		}
		if(productName=="ceilingfan")
		{
			String ceilingfanBrands[]={"Havells","Crompton","Orient","Bajaj","Usha","Atomberg","Polycab","V-Guard","Khaitan","Luminous","Hindware","Panasonic","Philips","Anchor","Goldmedal","Syska","Eveready","Surya","Westinghouse","Hunter","Emerson","Minka-Aire","Fanimation","Monte Carlo","Almonard","Gorilla","Airflow","KDK","Haiku","Kenstar","Morphy Richards","Voltas","Lloyd","Onida","Sansui","BPL","Micromax"};
			return ceilingfanBrands;
		}
		if(productName=="airconditioner")
		{
			String airconditionerBrands[]={"Daikin","Voltas","LG","Samsung","Blue Star","Hitachi","Panasonic","Whirlpool","Carrier","Mitsubishi Electric","Mitsubishi Heavy Industries","Haier","Godrej","Lloyd","Onida","Sansui","Videocon","Toshiba","Sharp","Hisense","Beko","Midea","Electrolux","GE","Trane","York","Fujitsu","Gree","Kelvinator","Westinghouse","Frigidaire","Amana","Bosch","Siemens","O General","Aux","Hyundai"};
			return airconditionerBrands;
		}
		if(productName=="waterpurifier")
		{
			String waterpurifierBrands[]={"Kent","Aquaguard","Pureit","Livpure","Blue Star","AO Smith","Tata Swach","Havells","LG","Panasonic","Whirlpool","Godrej","Eureka Forbes","V-Guard","Voltas","Brita","ZeroWater","Culligan","3M","GE","Aquasana","iSpring","Kangen","PurePro","Nasaka","HUL","Amway","Coway","AquaSure","AquaGuard Enhance","Aqua Fresh","Urban Company","Crystal","Wave","Hi-Tech","Doctor Fresh","Aqua Ultra"};
			return waterpurifierBrands;
		}
		if(productName=="vacuumcleaner")
		{
			String vacuumcleanerBrands[]={"Dyson","Philips","Eureka Forbes","LG","Samsung","Panasonic","Bosch","Siemens","Haier","Hitachi","Karcher","Black+Decker","Bissell","Shark","Hoover","Miele","Electrolux","iRobot","Kent","Inalsa","Prestige","Morphy Richards","Havells","Crompton","Voltas","Godrej","Whirlpool","Tefal","Kenstar","Agaro","Milagrow","Ecovacs","Proscenic","Roborock","Neato","Dreame","Ambrane"};
			return vacuumcleanerBrands;
		}
		if(productName=="ironbox")
		{
			String ironboxBrands[]={"Philips","Bajaj","Usha","Morphy Richards","Panasonic","Havells","Crompton","Orient","Black+Decker","Tefal","Rowenta","Bosch","Siemens","Prestige","Inalsa","Kenstar","Singer","Sunflame","Jaipan","Baltra","Pigeon","Cello","Longway","Agaro","V-Guard","Wonderchef","Hamilton Beach","Russell Hobbs","Kenwood","Sharp","Hitachi","LG","Samsung","Whirlpool","Godrej","Voltas","Butterfly"};
			return ironboxBrands;
		}
		if(productName=="heater")
		{
			String heaterBrands[]={"Bajaj","Usha","Havells","Crompton","Orient","V-Guard","Kenstar","Morphy Richards","Philips","Panasonic","Voltas","Lloyd","Orpat","Inalsa","Agaro","Black+Decker","DeLonghi","Honeywell","Dyson","Rowenta","Tefal","Bosch","Siemens","Prestige","Sunflame","Jaipan","Baltra","Pigeon","Cello","Longway","Singer","Khaitan","Hindware","Haier","LG","Samsung","Godrej"};
			return heaterBrands;
		}
		if(productName=="sofa")
		{
			String sofaBrands[]={"IKEA","Ashley Furniture","La-Z-Boy","Natuzzi","West Elm","Pottery Barn","Urban Ladder","Pepperfry","Nilkamal","Durian","Godrej Interio","HomeTown","Havertys","Wayfair","Article","CB2","Crate & Barrel","Room & Board","Joybird","Flexsteel","Broyhill","Herman Miller","Roche Bobois","BoConcept","Muji","Kartell","Ligne Roset","Dunelm","DFS","Sofa.com","ScS","Raymour & Flanigan","Living Spaces","Ethan Allen","Thomasville","Restoration Hardware","Cello"};
			return sofaBrands;
		}
		if(productName=="chair")
		{
			String chairBrands[]={"IKEA","Nilkamal","Godrej Interio","Durian","Urban Ladder","Pepperfry","Herman Miller","Steelcase","Haworth","La-Z-Boy","Ashley Furniture","West Elm","Pottery Barn","CB2","Crate & Barrel","Room & Board","Flexsteel","Broyhill","BoConcept","Muji","Kartell","Ligne Roset","Dunelm","DFS","Raymour & Flanigan","Living Spaces","Ethan Allen","Thomasville","Restoration Hardware","Cello","Featherlite","Green Soul","Da Urban","Wakefit","Innowin","Chairwale","Savya Home"};
			return chairBrands;
		}
		if(productName=="table")
		{
			String tableBrands[]={"IKEA","Nilkamal","Godrej Interio","Durian","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","CB2","Crate & Barrel","Room & Board","Flexsteel","Broyhill","BoConcept","Muji","Kartell","Ligne Roset","Dunelm","DFS","Raymour & Flanigan","Living Spaces","Ethan Allen","Thomasville","Restoration Hardware","Cello","Featherlite","Green Soul","Da Urban","Wakefit","Innowin","HomeTown","Havertys","Wayfair","Article","Sauder","Bush Furniture"};
			return tableBrands;
		}
		if(productName=="bed")
		{
			String bedBrands[]={"IKEA","Nilkamal","Godrej Interio","Durian","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","CB2","Crate & Barrel","Room & Board","Flexsteel","Broyhill","BoConcept","Muji","Kartell","Ligne Roset","Dunelm","DFS","Raymour & Flanigan","Living Spaces","Ethan Allen","Thomasville","Restoration Hardware","Cello","Wakefit","Sleepwell","Kurlon","Duroflex","Peps","Springfit","Centuary","Featherlite","HomeTown","Havertys","Wayfair"};
			return bedBrands;
		}
		if(productName=="mattress")
		{
			String mattressBrands[]={"Sleepwell","Kurlon","Duroflex","Peps","Wakefit","Springfit","Centuary","Sealy","Serta","Tempur-Pedic","King Koil","Beautyrest","Sleepyhead","Sunday","Emma","IKEA","Nilkamal","Godrej Interio","Durian","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Casper","Purple","Nectar","Saatva","Avocado","Helix","Leesa","Tuft & Needle","DreamCloud","Restonic","Havertys","Wayfair","Article"};
			return mattressBrands;
		}
		if(productName=="pillow")
		{
			String pillowBrands[]={"Sleepwell","Kurlon","Duroflex","Peps","Wakefit","Springfit","Centuary","Sealy","Serta","Tempur-Pedic","King Koil","Sleepyhead","Sunday","Emma","IKEA","Nilkamal","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Casper","Purple","Nectar","Saatva","Avocado","Helix","Leesa","Tuft & Needle","DreamCloud","Restonic","Havertys","Wayfair","Article","Coop Home Goods","MyPillow","Pacific Coast"};
			return pillowBrands;
		}
		if(productName=="bedsheet")
		{
			String bedsheetBrands[]={"Bombay Dyeing","Spaces","Trident","Welspun","Portico","Raymond Home","D'Decor","IKEA","Nilkamal","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Marks & Spencer","Swayam","Story@Home","HomeTown","Havertys","Wayfair","Article","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Solimo","Amazon Basics","Utopia Bedding","California Design Den","Bedsure","Wakefit"};
			return bedsheetBrands;
		}
		if(productName=="blanket")
		{
			String blanketBrands[]={"Bombay Dyeing","Spaces","Trident","Welspun","Portico","Raymond Home","D'Decor","IKEA","Nilkamal","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Marks & Spencer","Swayam","Story@Home","HomeTown","Havertys","Wayfair","Article","Utopia Bedding","Bedsure","Sleepwell","Kurlon","Duroflex","Peps","Wakefit","Centuary","Sealy","Serta","Pendleton","Sunbeam","Biddeford","Great Value","365 Everyday Value","Amazon Basics"};
			return blanketBrands;
		}
		if(productName=="curtain")
		{
			String curtainBrands[]={"D'Decor","Bombay Dyeing","Spaces","Trident","Welspun","Portico","Raymond Home","IKEA","Nilkamal","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Marks & Spencer","Swayam","Story@Home","HomeTown","Havertys","Wayfair","Article","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Amazon Basics","Solimo","Utopia Bedding","Exclusive Home","Sun Zero","NICETOWN"};
			return curtainBrands;
		}
		if(productName=="carpet")
		{
			String carpetBrands[]={"D'Decor","Bombay Dyeing","Welspun","Portico","IKEA","Nilkamal","Urban Ladder","Pepperfry","Ashley Furniture","West Elm","Pottery Barn","Marks & Spencer","HomeTown","Havertys","Wayfair","Article","Jaipur Rugs","Safavieh","Mohawk","Shaw Floors","Karastan","Oriental Weavers","Loloi","Nourison","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Amazon Basics","Ruggable","Surya"};
			return carpetBrands;
		}
		if(productName=="backpack")
		{
			String backpackBrands[]={"American Tourister","Wildcraft","Skybags","Safari","VIP","Samsonite","Nike","Adidas","Puma","Reebok","Under Armour","F Gear","Tommy Hilfiger","UCB","Woodland","The North Face","JanSport","Herschel","Targus","Dell","HP","Lenovo","Aristocrat","IT Luggage","SwissGear","High Sierra","Quechua","Decathlon","Amazon Basics","Fastrack","Gear","Mi","Puma Motorsport","Caprese","Lavie","Baggit","Da Milano"};
			return backpackBrands;
		}
		if(productName=="handbag")
		{
			String handbagBrands[]={"Caprese","Lavie","Baggit","Da Milano","Hidesign","Allen Solly","Van Heusen","Tommy Hilfiger","Calvin Klein","Guess","Michael Kors","Coach","Kate Spade","Fossil","Charles & Keith","Zara","H&M","Forever 21","Aldo","Nine West","Louis Vuitton","Gucci","Prada","Chanel","Hermes","Baggallini","Tory Burch","Rebecca Minkoff","Lino Perros","Esbeda","AccessHer","Amazon Basics","Wildcraft","Skybags","Safari","VIP","Aristocrat"};
			return handbagBrands;
		}
		if(productName=="wallet")
		{
			String walletBrands[]={"Wildhorn","Urban Forest","Tommy Hilfiger","Calvin Klein","Louis Philippe","Allen Solly","Van Heusen","Woodland","Levi's","Fossil","Titan","Hidesign","Da Milano","Baggit","Caprese","Lavie","Nike","Adidas","Puma","Reebok","Guess","Michael Kors","Coach","Gucci","Prada","Louis Vuitton","Hermes","UCB","Amazon Basics","Wildcraft","Skybags","Safari","VIP","Aristocrat","Lino Perros","Esbeda","Accessorize"};
			return walletBrands;
		}
		if(productName=="shoes")
		{
			String shoesBrands[]={"Nike","Adidas","Puma","Reebok","Skechers","Woodland","Bata","Red Tape","Lee Cooper","Clarks","Hush Puppies","Vans","Converse","New Balance","Asics","Under Armour","Fila","Campus","Sparx","Relaxo","Crocs","Timberland","Dr. Martens","Gucci","Prada","Louis Vuitton","Armani","Tommy Hilfiger","Calvin Klein","Steve Madden","Aldo","ECCO","Geox","Brooks","Saucony","Merrell","Columbia"};
			return shoesBrands;
		}
		if(productName=="watch")
		{
			String watchBrands[]={"Titan","Fastrack","Casio","Timex","Sonata","Fossil","Seiko","Citizen","Rolex","Omega","Tag Heuer","Tissot","Rado","Longines","Michael Kors","Guess","Armani Exchange","Tommy Hilfiger","Calvin Klein","Daniel Wellington","Skagen","Swatch","G-Shock","Police","Diesel","Movado","Bulova","Invicta","Orient","Hublot","Cartier","Breitling","Panerai","Breguet","IWC","Montblanc","Kenneth Cole"};
			return watchBrands;
		}
		if(productName=="sunglasses")
		{
			String sunglassesBrands[]={"Ray-Ban","Oakley","Fastrack","Polaroid","Carrera","Vogue","Gucci","Prada","Armani Exchange","Tommy Hilfiger","Calvin Klein","Police","Diesel","Michael Kors","Guess","Persol","Maui Jim","Arnette","Smith","Costa","Bvlgari","Chanel","Dior","Versace","Hugo Boss","Montblanc","Burberry","Lenskart","IDEE","Vincent Chase","Titan Eye+","Flying Machine","Roadster","United Colors of Benetton","Puma","Nike","Adidas"};
			return sunglassesBrands;
		}
		if(productName=="helmet")
		{
			String helmetBrands[]={"Studds","Vega","Steelbird","LS2","MT Helmets","Axor","KYT","HJC","AGV","Shoei","Arai","Bell","Nolan","Shark","THH","SMK","Royal Enfield","TVS","Yamaha","Honda","Suzuki","Kawasaki","Harley-Davidson","BMW","Triumph","O'Neal","Fox Racing","Fly Racing","Torc","Scorpion","Icon","Just1","Sparx","Bilmola","BluArmor","Ignite","Forma"};
			return helmetBrands;
		}
		if(productName=="bicycle")
		{
			String bicycleBrands[]={"Hero","Hercules","Atlas","Firefox","Montra","Mach City","Btwin","Trek","Giant","Specialized","Scott","Merida","Cannondale","Schwinn","Bianchi","Cube","Polygon","Santa Cruz","Kona","Raleigh","Felt","Focus","Orbea","Colnago","Pinarello","Cervelo","GT","Avon","Suncross","United","FitTrip","Urban Terrain","Leader","Cradiac","Cosmic","Ridley","Lapierre"};
			return bicycleBrands;
		}
		if(productName=="football")
		{
			String footballBrands[]={"Nike","Adidas","Puma","Reebok","Under Armour","Nivia","Cosco","Spartan","Mitre","Select","Umbro","Wilson","Molten","Decathlon","Kipsta","Sondico","Mikasa","Champion","Vector X","SG","Slazenger","Diadora","Joma","Hummel","Uhlsport","Derbystar","Brine","Rawlings","Baden","Franklin","Macron","New Balance","Lotto","Asics","Kookaburra","Gray-Nicolls","Speedo"};
			return footballBrands;
		}
		if(productName=="cricketbat")
		{
			String cricketbatBrands[]={"MRF","SS","SG","Kookaburra","Gray-Nicolls","Spartan","GM","New Balance","Adidas","Puma","Reebok","Nike","Ton","BAS","BDM","Hero","Stanford","CEAT","Slazenger","Woodworm","Chase","Gunn & Moore","CA","Ihsan","MB Malik","HS","BoomBoom","Aldred","RNS","Willow Premium","SM","Stanford Pro","Maxx","Protos","Royal","Vicky","D&P"};
			return cricketbatBrands;
		}
		if(productName=="basketball")
		{
			String basketballBrands[]={"Spalding","Wilson","Nike","Adidas","Puma","Under Armour","Molten","Cosco","Nivia","Decathlon","Kipsta","Rawlings","Baden","Franklin","Champion","Mitre","Reebok","Lotto","Asics","New Balance","Diadora","Vector X","SG","Slazenger","Macron","Hummel","Joma","Tarmak","Peak","Anta","Li-Ning","And1","Everlast","Pro Touch","Mikasa","Voit","Wilson Evolution"};
			return basketballBrands;
		}
		if(productName=="badmintonracket")
		{
			String badmintonracketBrands[]={"Yonex","Li-Ning","Victor","Carlton","Wilson","Head","Babolat","Ashaway","Apacs","Cosco","Nivia","Decathlon","Kipsta","SG","Adidas","Puma","Reebok","Lining Windstorm","Fleet","Karakal","Prince","ProKennex","Gosen","Ashaway Phantom","Silver's","Vector X","RSL","Forza","Black Knight","Tecnifibre","Maxbolt","Kawasaki","Talbot-Torro","Wish","Powermax","Zigma","Viva"};
			return badmintonracketBrands;
		}
		if(productName=="yogamat")
		{
			String yogamatBrands[]={"Nike","Adidas","Reebok","Puma","Under Armour","Lululemon","Manduka","Gaiam","Aurion","Boldfit","Strauss","Cosco","Nivia","Decathlon","Kipsta","SG","Amazon Basics","ProsourceFit","Heathyoga","Jade Yoga","Hugger Mugger","Liforme","BalanceFrom","Fitbit","Tunturi","Everlast","Vector X","Silver's","Kobo","Bodylastics","Sivan","Sportneer","Retrospec","Bean Products","Clever Yoga","TriggerPoint","Yoloha"};
			return yogamatBrands;
		}
		if(productName=="dumbbells")
		{
			String dumbbellsBrands[]={"Nike","Adidas","Reebok","Puma","Under Armour","Cosco","Nivia","Decathlon","Kipsta","SG","Amazon Basics","Proline","Kobo","Aurion","Boldfit","Strauss","Bodylastics","PowerMax","Cockatoo","Viva Fitness","IBS","USI Universal","Lifelong","Flexnest","Bullrock","Tunturi","Everlast","York Fitness","Domyos","Caper","Fitkit","Kore","Burnlab","Headly","Gymx","Protoner","Vinex"};
			return dumbbellsBrands;
		}
		if(productName=="treadmill")
		{
			String treadmillBrands[]={"NordicTrack","ProForm","Sole","Horizon","Life Fitness","Precor","Technogym","Matrix","Bowflex","Reebok","Nike","Adidas","Proline","PowerMax","Cockatoo","Durafit","Fitkit","Lifelong","Flexnest","Kobo","Aurion","Boldfit","Strauss","USI Universal","Viva Fitness","York Fitness","Domyos","Caper","Burnlab","Headly","Gymx","Protoner","Sparnod","Cosco","Nivia","Decathlon","Kipsta"};
			return treadmillBrands;
		}
		if(productName=="proteinpowder")
		{
			String proteinpowderBrands[]={"Optimum Nutrition","MuscleBlaze","Dymatize","BSN","MyProtein","Isopure","Ultimate Nutrition","GNC","Labrada","MuscleTech","ON Gold Standard","BigMuscles","Asitis","Fast&Up","Protinex","Herbalife","Amway","Oziva","Wellbeing Nutrition","RiteBite","HealthKart","Boldfit","MuscleXP","Scitron","Avvatar","Nakpro","Power Gummies","Six Pack Nutrition","Redcon1","Rule 1","Cellucor","BPI Sports","Gaspari","EAS","Vega","Garden of Life","Orgain"};
			return proteinpowderBrands;
		}
		if(productName=="facemask")
		{
			String facemaskBrands[]={"3M","Honeywell","Dettol","Savlon","Wildcraft","Puma","Nike","Adidas","Reebok","Under Armour","Himalaya","Patanjali","Mamaearth","WOW","The Body Shop","Forest Essentials","Nykaa","Miniso","Xiaomi","Realme","Amazon Basics","Proline","Boldfit","Strauss","Decathlon","Kipsta","Nivia","Cosco","Jockey","Van Heusen","Allen Solly","Marks & Spencer","H&M","Zara","Uniqlo","Gucci","Louis Vuitton"};
			return facemaskBrands;
		}
		if(productName=="thermometer")
		{
			String thermometerBrands[]={"Omron","Dr. Morepen","Beurer","Rossmax","Braun","Microlife","Equinox","Citizen","BPL","AccuSure","Hicks","Vicks","Flamingo","iProven","EasyCare","HealthSense","Dr Trust","ChoiceMMed","GlucoOne","Tynor","Medtech","Vandelay","Welch Allyn","Exergen","Kinsa","Safety 1st","Little Martin's","Fairhaven Health","Pigeon","Chicco","Philips","Panasonic","Prestige","Bajaj","Havells","Lifelong","Amazon Basics"};
			return thermometerBrands;
		}
		if(productName=="bloodpressuremonitor")
		{
			String bloodpressuremonitorBrands[]={"Omron","Dr. Morepen","Beurer","Rossmax","Braun","Microlife","Citizen","BPL","AccuSure","Hicks","HealthSense","Dr Trust","ChoiceMMed","Equinox","Tynor","Medtech","iHealth","Withings","A&D Medical","Welch Allyn","Panasonic","Philips","Prestige","Bajaj","Havells","Lifelong","Amazon Basics","EasyCare","Vandelay","Care Touch","Greater Goods","LotFancy","Paramed","ReliOn","GlucoOne","Rossmax Elite","Diamond"};
			return bloodpressuremonitorBrands;
		}
		if(productName=="firstaidkit")
		{
			String firstaidkitBrands[]={"Johnson & Johnson","Dettol","Savlon","3M","Band-Aid","Vicks","Dr. Morepen","Beurer","Rossmax","Omron","Flamingo","Tynor","Hicks","Medtech","AccuSure","Equinox","Amazon Basics","Proline","Boldfit","Strauss","Lifeline","Reliance","Safety First","Adventure Medical Kits","Lifesystems","Swiss Safe","Be Smart Get Prepared","First Aid Only","Surviveware","Protect Life","MediKit","Rapid Care","Care Plus","MedSource","ReliOn","Curad","Honeywell"};
			return firstaidkitBrands;
		}
		if(productName=="cooking oil")
		{
			String cookingoilBrands[]={"Fortune","Saffola","Dhara","Sundrop","Gemini","Freedom","Gold Winner","Nature Fresh","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Tata Sampann","Aashirvaad","Emami","Healthy & Tasty","Del Monte","Figaro","Borges","Oleev","Coco Soul","Maxcare","Hudson","Vimal","Engine","Sunrich","Ruchi","Gokul","Annapurna","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return cookingoilBrands;
		}
		if(productName=="vinegar")
		{
			String vinegarBrands[]={"Heinz","Del Monte","American Garden","Figaro","Borges","Colavita","Pompeian","Bragg","Spectrum","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Pro Nature","Organic Tattva","24 Mantra Organic","Natureland","Patanjali","Urban Platter","Weikfield","Crosse & Blackwell","Maille","Kuhne","Mizkan","Ponti","Aspall","Sarsons","Ching's Secret","Veeba","Wingreens"};
			return vinegarBrands;
		}
		if(productName=="baking powder")
		{
			String bakingpowderBrands[]={"Weikfield","Blue Bird","Rumford","Clabber Girl","Bob's Red Mill","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Dr. Oetker","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","Happilo","Keya","Cooks & Co","Heera","Swad","Laxmi","Deep","MTR","Rajdhani","Aashirvaad","Tata Sampann","Sunrise","Catch","Everest"};
			return bakingpowderBrands;
		}
		if(productName=="custard powder")
		{
			String custardpowderBrands[]={"Bird's","Weikfield","Brown & Polson","Blue Bird","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Dr. Oetker","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","MTR","Rajdhani","Aashirvaad","Tata Sampann","Sunrise","Catch","Everest","Happilo","Keya","Heera","Swad","Laxmi","Deep","Del Monte","Wingreens"};
			return custardpowderBrands;
		}
		if(productName=="jam")
		{
			String jamBrands[]={"Kissan","Smucker's","Bonne Maman","Hero","St. Dalfour","Hartley's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Del Monte","Borges","American Garden","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","MTR","Veeba","Wingreens","Hershey's","Skippy","Nutella","Zulekha","Chivers","Tiptree","Polaner","Welch's"};
			return jamBrands;
		}
		if(productName=="ketchup")
		{
			String ketchupBrands[]={"Heinz","Kissan","Del Monte","Maggi","Veeba","Wingreens","American Garden","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Hunt's","French's","Annie's","Sir Kensington's","Stokes","Chef's","Dr. Oetker","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","MTR","Urban Platter","Keya","Sunrise","Catch","Everest","Borges"};
			return ketchupBrands;
		}
		if(productName=="mayonnaise")
		{
			String mayonnaiseBrands[]={"Hellmann's","Veeba","Wingreens","Heinz","Del Monte","American Garden","Kraft","Best Foods","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Sir Kensington's","Annie's","Duke's","Blue Plate","Stokes","Dr. Oetker","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","FunFoods","Remia","Thomy","Calve","Kewpie","Borges"};
			return mayonnaiseBrands;
		}
		if(productName=="peanutbutter")
		{
			String peanutbutterBrands[]={"Skippy","Jif","Peter Pan","Pintola","Alpino","MyFitness","Sundrop","Happy Jars","Yoga Bar","Dr. Oetker","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","American Garden","Del Monte","Kissan","Nutella","Hershey's","Justin's","Smucker's","Teddie","PB2","Adams"};
			return peanutbutterBrands;
		}
		if(productName=="honey")
		{
			String honeyBrands[]={"Dabur","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Himalaya","Capilano","Billy Bee","Nature Nate's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Comvita","Manuka Health","Little Bee","Hitkari","Apis Himalaya","Lion Honey","Zandu","Baidyanath","Emami","Organic India","Urban Platter","Weikfield","American Garden","Langnese","Rowse","Sue Bee"};
			return honeyBrands;
		}
		if(productName=="pickles")
		{
			String picklesBrands[]={"Mother's Recipe","Priya","Patanjali","Aachi","Eastern","MTR","Bedekar","Nilon's","Ramdev","Annapurna","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sainsbury's","Tesco","Waitrose","Marks & Spencer","Vlasic","Heinz","Mt. Olive","B&G","Del Monte","American Garden","Ching's Secret","Veeba","Wingreens","Brooklyn Brine","Grillo's"};
			return picklesBrands;
		}
		if(productName=="toothpastegel")
		{
			String toothpastegelBrands[]={"Colgate Gel","Closeup Gel","Pepsodent Gel","Oral-B Gel","Crest Gel","Aquafresh Gel","Sensodyne Gel","Signal Gel","Zendium Gel","Arm & Hammer Gel","Tom's Gel","Hello Gel","Parodontax Gel","Elmex Gel","Biotene Gel","TheraBreath Gel","Dabur Gel","Himalaya Gel","Patanjali Gel","Vicco Gel","Meswak Gel","Great Value Gel","365 Everyday Value Gel","Kroger Gel","Signature Select Gel","H-E-B Gel","Trader Joe's Gel","Whole Foods Gel","Marvis Gel","Jason Gel","Desert Essence Gel","Spry Gel","Dr. Organic Gel","Ecodenta Gel","Curaprox Gel","Foramen Gel","Lion Gel"};
			return toothpastegelBrands;
		}
		if(productName=="shavinggel")
		{
			String shavinggelBrands[]={"Gillette Gel","Old Spice Gel","Nivea Gel","Park Avenue Gel","Bombay Shaving Gel","The Man Company Gel","Beardo Gel","Vi-John Gel","Supermax Gel","Himalaya Gel","Patanjali Gel","Biotique Gel","L'Oreal Gel","Dove Men Gel","Axe Gel","Arko Gel","Proraso Gel","Barbasol Gel","Edge Gel","Harry's Gel","Cremo Gel","Truefitt Gel","Taylor Gel","Great Value Gel","365 Everyday Value Gel","Kroger Gel","Signature Select Gel","H-E-B Gel","Trader Joe's Gel","Whole Foods Gel","Clinique Gel","Neutrogena Gel","Cetaphil Gel","Sebamed Gel","Aroma Magic Gel","Wild Stone Gel","Denver Gel"};
			return shavinggelBrands;
		}
		if(productName=="aftershave")
		{
			String aftershaveBrands[]={"Old Spice","Nivea","Gillette","Axe","Brut","Denim","Park Avenue","The Man Company","Bombay Shaving Company","Beardo","Aramis","Calvin Klein","Armani","Gucci","Versace","Hugo Boss","Jaguar","Davidoff","Paco Rabanne","Yves Saint Laurent","Dior","Chanel","Prada","Hermes","Mont Blanc","Ralph Lauren","Tabac","Clubman","Proraso","Truefitt & Hill","Taylor of Old Bond Street","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return aftershaveBrands;
		}
		if(productName=="hairgel")
		{
			String hairgelBrands[]={"Set Wet","Gatsby","L'Oreal","Schwarzkopf","TIGI","American Crew","AXE","Old Spice","Park Avenue","Beardo","The Man Company","Himalaya","Patanjali","Biotique","WOW","Mamaearth","Garnier","Matrix","Redken","Wella","Osmo","Johnny B","Suavecito","Dove","Tresemme","Pantene","Nivea","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","UrbanGabru","Bryan & Candy","Ustraa"};
			return hairgelBrands;
		}
		if(productName=="hairspray")
		{
			String hairsprayBrands[]={"L'Oreal Elnett","Tresemme","Schwarzkopf","Wella","Matrix","TIGI","Garnier","Pantene","Herbal Essences","Dove","Nivea","John Frieda","Got2b","Osis+","Kenra","Sebastian","Redken","Paul Mitchell","Aussie","Suave","Bed Head","Biotique","Himalaya","Patanjali","WOW","Mamaearth","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Marc Anthony","Living Proof","Oribe","Moroccanoil"};
			return hairsprayBrands;
		}
		if(productName=="hairserum")
		{
			String hairserumBrands[]={"Livon","Streax","L'Oreal","Matrix","Biolage","Garnier","WOW","Mamaearth","Schwarzkopf","Wella","Tresemme","Pantene","Dove","John Frieda","Moroccanoil","OGX","Kerastase","Redken","Paul Mitchell","Biotique","Himalaya","Patanjali","Khadi","UrbanGabru","Ustraa","Bryan & Candy","Bare Anatomy","Minimalist","Plum","Arata","Good Vibes","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return hairserumBrands;
		}
		if(productName=="haircolor")
		{
			String haircolorBrands[]={"Garnier","L'Oreal","Revlon","Clairol","Godrej Expert","Streax","Schwarzkopf","Matrix","Wella","Biotique","Himalaya","Patanjali","Indus Valley","BBlunt","Naturtint","Herbatint","Khadi","Radico","Tints of Nature","Just For Men","Manic Panic","Arctic Fox","Adore","Pravana","Ion","Color Mate","VIP","Vasmol","Keune","Framesi","Davines","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return haircolorBrands;
		}
		if(productName=="lipbalm")
		{
			String lipbalmBrands[]={"Nivea","Maybelline","Lakme","Vaseline","Himalaya","Biotique","Patanjali","Mamaearth","WOW","Neutrogena","ChapStick","Burt's Bees","Carmex","EOS","Baby Lips","Forest Essentials","Khadi","Plum","Minimalist","Laneige","Clinique","Kiehl's","Revlon","NYX","Colorbar","Faces Canada","Lotus","Aroma Magic","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sebamed","Dot & Key"};
			return lipbalmBrands;
		}
		if(productName=="lipsticks")
		{
			String lipsticksBrands[]={"MAC","Maybelline","Lakme","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","Sugar","Huda Beauty","Chambor","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","Charlotte Tilbury","Pat McGrath","NARS","Sephora","Wet n Wild","Insight","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Kiko Milano","Milani","Bourjois","Great Value","365 Everyday Value","Kroger","Signature Select"};
			return lipsticksBrands;
		}
		if(productName=="lipgloss")
		{
			String lipglossBrands[]={"Maybelline","Lakme","Revlon","NYX","Colorbar","Faces Canada","MAC","Huda Beauty","Bobbi Brown","Clinique","Dior","Chanel","YSL","Estee Lauder","Sugar","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Insight","LA Girl","Fenty Beauty","Rare Beauty","Sephora","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return lipglossBrands;
		}
		if(productName=="nailpolish")
		{
			String nailpolishBrands[]={"Lakme","Colorbar","Faces Canada","Maybelline","Revlon","NYX","O.P.I","Sally Hansen","Essie","Chambor","Sugar","Swiss Beauty","Elle 18","Nykaa","Plum","Mamaearth","WOW","Lotus","Innisfree","Etude House","Zoya","Deborah Milano","Kiko Milano","Milani","Bourjois","Orly","China Glaze","Ciaté","Barry M","Lottie London","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return nailpolishBrands;
		}
		if(productName=="nailremover")
		{
			String nailremoverBrands[]={"Lakme","Colorbar","Faces Canada","Maybelline","Revlon","NYX","O.P.I","Sally Hansen","Essie","Chambor","Sugar","Swiss Beauty","Elle 18","Nykaa","Plum","Mamaearth","WOW","Lotus","Innisfree","Etude House","Zoya","Deborah Milano","Kiko Milano","Milani","Bourjois","Orly","Cutex","Kara","Bella Vita","Blue Heaven","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods"};
			return nailremoverBrands;
		}
		if(productName=="foundation")
		{
			String foundationBrands[]={"MAC","Maybelline","Lakme","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","Charlotte Tilbury","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Fenty Beauty","Rare Beauty","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B"};
			return foundationBrands;
		}
		if(productName=="compactpowder")
		{
			String compactpowderBrands[]={"Lakme","Maybelline","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","MAC","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","Charlotte Tilbury","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Insight","Blue Heaven","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B"};
			return compactpowderBrands;
		}
		if(productName=="eyeliner")
		{
			String eyelinerBrands[]={"Lakme","Maybelline","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","MAC","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","Charlotte Tilbury","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Insight","Blue Heaven","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B"};
			return eyelinerBrands;
		}
		if(productName=="kajal")
		{
			String kajalBrands[]={"Lakme","Maybelline","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","MAC","Sugar","Huda Beauty","Chambor","Bobbi Brown","Clinique","Dior","Chanel","YSL","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Insight","Blue Heaven","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return kajalBrands;
		}
		if(productName=="mascara")
		{
			String mascaraBrands[]={"Maybelline","Lakme","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","MAC","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Benefit","Too Faced","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return mascaraBrands;
		}
		if(productName=="blush")
		{
			String blushBrands[]={"MAC","Maybelline","Lakme","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Benefit","Rare Beauty","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return blushBrands;
		}
		if(productName=="highlighter")
		{
			String highlighterBrands[]={"MAC","Maybelline","Lakme","Revlon","L'Oreal","NYX","Colorbar","Faces Canada","Sugar","Huda Beauty","Bobbi Brown","Estee Lauder","Clinique","Dior","Chanel","YSL","NARS","Sephora","Wet n Wild","Swiss Beauty","Elle 18","Lotus","Plum","Mamaearth","WOW","Nykaa","Milani","Kiko Milano","Bourjois","Benefit","Fenty Beauty","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's"};
			return highlighterBrands;
		}
		if(productName=="makeupremover")
		{
			String makeupremoverBrands[]={"Garnier","Lakme","Maybelline","L'Oreal","Neutrogena","Nivea","Himalaya","Biotique","Patanjali","Mamaearth","WOW","Plum","Minimalist","Cetaphil","Simple","Clinique","Estee Lauder","Bioderma","The Body Shop","Forest Essentials","Lotus","Colorbar","Faces Canada","Swiss Beauty","Nykaa","Kiko Milano","Bourjois","Milani","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Sebamed","Aroma Magic"};
			return makeupremoverBrands;
		}
		if(productName=="sanitizer")
		{
			String sanitizerBrands[]={"Dettol","Lifebuoy","Savlon","Himalaya","Patanjali","Sterillium","Purell","Godrej Protekt","BoroPlus","Dabur","ITC Savlon","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Walgreens","CVS Health","Carex","Lysol","Colgate","Protex","Dr. Morepen","HealthKart","Boldfit","Wow Life","Good Vibes","Nykaa","Miniso","Clean & Clear","Bath & Body Works","Palmolive","Nivea","Johnson's"};
			return sanitizerBrands;
		}
		if(productName=="wetwipes")
		{
			String wetwipesBrands[]={"Huggies","Pampers","Johnson's","Himalaya","Mamaearth","WOW","Patanjali","Biotique","Clean & Clear","Dettol","Savlon","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Walgreens","CVS Health","Kara","Bella Vita","Plum","Nykaa","Miniso","The Body Shop","Forest Essentials","Nivea","Dove","Cetaphil","Sebamed","Aveeno","Pigeon","Chicco","Mee Mee","Little's"};
			return wetwipesBrands;
		}
		if(productName=="tissuepaper")
		{
			String tissuepaperBrands[]={"Kleenex","Puffs","Scotties","Presto","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Walgreens","CVS Health","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Origami","Bella","Premier","Lotus","Selpak","Zewa","Tempo","Floralys","Regina","Renova","Softy","Butterfly","Sofy","Velvet","Plenty","Sparkle","Clean Mate"};
			return tissuepaperBrands;
		}
		if(productName=="toiletpaper")
		{
			String toiletpaperBrands[]={"Charmin","Scott","Cottonelle","Quilted Northern","Angel Soft","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Walgreens","CVS Health","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Origami","Bella","Premier","Lotus","Selpak","Zewa","Tempo","Floralys","Regina","Renova","Softy","Velvet","Plenty","Sparkle","Clean Mate","Cushelle"};
			return toiletpaperBrands;
		}
		if(productName=="papertowels")
		{
			String papertowelsBrands[]={"Bounty","Brawny","Viva","Sparkle","Scott","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Walgreens","CVS Health","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Origami","Bella","Premier","Lotus","Selpak","Zewa","Tempo","Regina","Renova","Plenty","Floralys","Cushelle","Velvet","Softy","Clean Mate","Presto"};
			return papertowelsBrands;
		}
		if(productName=="aluminiumfoil")
		{
			String aluminiumfoilBrands[]={"Reynolds","Glad","Presto","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Pigeon","Prestige","Butterfly","Milton","Cello","Wonderchef","Sunfoil","Freshwrapp","Diamond","Durafit","Home One","Sparkle","Clean Mate","Eco Wrap","SafeFoil","Daily Fresh","Prime Wrap","UltraFoil","Kitchen Pro","Home Guard"};
			return aluminiumfoilBrands;
		}
		if(productName=="clingfilm")
		{
			String clingfilmBrands[]={"Glad","Reynolds","Presto","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Pigeon","Prestige","Milton","Cello","Wonderchef","Freshwrapp","Sunwrap","Diamond","Home One","Sparkle","Clean Mate","Eco Wrap","SafeSeal","Daily Fresh","Prime Wrap","UltraSeal","Kitchen Pro","Home Guard","WrapEasy","QuickCover"};
			return clingfilmBrands;
		}
		if(productName=="garbagebags")
		{
			String garbagebagsBrands[]={"Glad","Hefty","Presto","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Clean Mate","Sparkle","Home Guard","EcoSafe","BioGreen","FreshClean","Tuffy","Durabag","TrashPro","WasteCare","CityLife","UltraStrong","Prime Trash","Daily Use","Easy Tie","StrongHold","Green Earth","BioFresh","SafeDispose","MaxClean"};
			return garbagebagsBrands;
		}
		if(productName=="matchbox")
		{
			String matchboxBrands[]={"Ship","Three Mangoes","Cycle","Homelite","National","Aim","Royal","Tiger","Elephant","Ship Safety","Home Lite","Super Match","Fire King","Spark","Quick Light","Sun Match","Bright","FlamePro","Safe Light","Daily Match","Prime Match","Eco Match","Ultra Light","Home Spark","City Flame","Gold Star","Silver Flame","Red Torch","Blue Spark","Green Light","Max Match","Power Flame","Easy Strike","Sparkle","Clean Burn","HotShot","LightPro"};
			return matchboxBrands;
		}
		if(productName=="candles")
		{
			String candlesBrands[]={"Yankee Candle","Bath & Body Works","IKEA","Marks & Spencer","Glade","Air Wick","Homesake","Ekam","Soulflower","Miniso","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Village Candle","Diptyque","Jo Malone","Woodwick","Paddywax","Colonial Candle","True Living","AuraDecor","Home Centre","D'Light","Pure Home","Sparkle","Bright Flame","EcoGlow"};
			return candlesBrands;
		}
		if(productName=="incense")
		{
			String incenseBrands[]={"Cycle","Mangaldeep","Zed Black","Hem","Satya","Darshan","Auroshikha","Balaji","Tulasi","Hari Darshan","Padmini","Nandita","Shubham","Mysore Deep","Vasu","Aroma Magic","Soulflower","Forest Essentials","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Eco Aroma","Divine Fragrance","Temple Bliss","Sacred Light","Holy Essence","Pure Prayer"};
			return incenseBrands;
		}
		if(productName=="poojasamagri")
		{
			String poojasamagriBrands[]={"Cycle","Mangaldeep","Zed Black","Hem","Satya","Darshan","Auroshikha","Balaji","Tulasi","Hari Darshan","Padmini","Nandita","Shubham","Mysore Deep","Vasu","Giri","Pooja Store","Temple Essentials","Divine Rituals","Sacred Home","Holy Needs","Bhakti","Shubh Kart","Om Traders","Spiritual Hub","Eco Prayer","Prime Pooja","Daily Ritual","Pure Devotion","Gold Temple","Silver Temple","Aarti Plus","Camphor King","Agni Dev","Faith Products","Blessings","Tradition House"};
			return poojasamagriBrands;
		}
		if(productName=="agarbatti")
		{
			String agarbattiBrands[]={"Cycle","Mangaldeep","Zed Black","Hem","Satya","Darshan","Auroshikha","Balaji","Tulasi","Hari Darshan","Padmini","Nandita","Shubham","Mysore Deep","Vasu","Aroma Magic","Soulflower","Forest Essentials","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Eco Aroma","Divine Stick","Temple Fragrance","Sacred Smoke","Holy Stick","Pure Aroma"};
			return agarbattiBrands;
		}
		if(productName=="camphor")
		{
			String camphorBrands[]={"Mangaldeep","Cycle","Zed Black","Balaji","Tulasi","Hari Darshan","Padmini","Nandita","Shubham","Vasu","Giri","Temple Essentials","Divine Rituals","Sacred Home","Holy Needs","Bhakti","Om Traders","Spiritual Hub","Eco Prayer","Prime Pooja","Daily Ritual","Pure Devotion","Gold Temple","Silver Temple","Aarti Plus","CamPure","Kapoor King","Camphor Pro","Fresh Flame","Bright Burn","Ultra Cam","Spark Cam","Faith Cam","Blessing Cam","Tradition Cam","Agni Kapoor","Sacred Kapoor"};
			return camphorBrands;
		}
		if(productName=="dryfruits")
		{
			String dryfruitsBrands[]={"Happilo","Nutraj","Tulsi","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Nutty Gritties","True Elements","Yoga Bar","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Dryfruit","Golden Nuts","Premium Harvest","Fresh Basket","Daily Nuts","Prime Dryfruit","Healthy Bites","NutriChoice"};
			return dryfruitsBrands;
		}
		if(productName=="almonds")
		{
			String almondsBrands[]={"Happilo","Nutraj","Tulsi","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Nutty Gritties","True Elements","Yoga Bar","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Nuts","Golden Harvest","Premium Basket","Daily Crunch","NutriDelight","Healthy Harvest","Prime Nuts","Fresh Valley"};
			return almondsBrands;
		}
		if(productName=="cashews")
		{
			String cashewsBrands[]={"Happilo","Nutraj","Tulsi","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Nutty Gritties","True Elements","Yoga Bar","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Nuts","Golden Harvest","Premium Basket","Daily Crunch","NutriDelight","Healthy Harvest","Prime Nuts","Fresh Valley"};
			return cashewsBrands;
		}
		if(productName=="raisins")
		{
			String raisinsBrands[]={"Happilo","Nutraj","Tulsi","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Nutty Gritties","True Elements","Yoga Bar","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Raisins","Golden Harvest","Premium Basket","Daily Crunch","NutriDelight","Healthy Harvest","Prime Fruits","Fresh Valley"};
			return raisinsBrands;
		}
		if(productName=="pista")
		{
			String pistaBrands[]={"Happilo","Nutraj","Tulsi","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Nutty Gritties","True Elements","Yoga Bar","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Pistachio","Golden Harvest","Premium Basket","Daily Crunch","NutriDelight","Healthy Harvest","Prime Nuts","Fresh Valley"};
			return pistaBrands;
		}
		if(productName=="dates")
		{
			String datesBrands[]={"Lion Dates","Bateel","Al Barakah","Al Madina","Al Foah","Happilo","Nutraj","Urban Platter","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Rostaa","Farmley","Vedaka","Amazon Basics","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Coles","Woolworths","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Royal Dates","Golden Harvest","Premium Basket","Daily Fruits","NutriDelight","Healthy Harvest","Fresh Valley"};
			return datesBrands;
		}
		if(productName=="noodlespack")
		{
			String noodlespackBrands[]={"Maggi","Top Ramen","Yippee","Indomie","Nissin","Samyang","Maruchan","Mama","Koka","Knorr","Ching's","Ottogi","Paldo","Wai Wai","Sapporo","Lucky Me","Vifon","Acecook","Nongshim","Mr. Lee's","Batchelors","Blue Dragon","Prima Taste","Kabuto","Itsuki","Sau Tao","Great Value","365 Everyday Value","Kroger","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Asian Best","Quick Bowl","Hot Bowl","Daily Noodles"};
			return noodlespackBrands;
		}
		if(productName=="oatsmeal")
		{
			String oatsmealBrands[]={"Quaker","Kellogg's","Saffola","Bagrry's","Nature's Path","Bob's Red Mill","McCann's","Weetabix","Jordan's","Flahavan's","Alpen","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Tata Soulfull","True Elements","Yoga Bar","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Lion Oats","Morning Foods","Mornflake","Freedom Foods","Uncle Tobys","Healthy Bowl","Prime Oats","Daily Harvest"};
			return oatsmealBrands;
		}
		if(productName=="energybar")
		{
			String energybarBrands[]={"Clif Bar","Quest","Kind","RXBAR","Yoga Bar","RiteBite","MuscleBlaze","MyProtein","Optimum Nutrition","Gatorade","PowerBar","Nature Valley","Kellogg's","Happilo","True Elements","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Fit & Flex","Boldfit","Fast&Up","Max Protein","Prime Bar","Daily Fuel"};
			return energybarBrands;
		}
		if(productName=="granola")
		{
			String granolaBrands[]={"Kellogg's","Nature Valley","Bagrry's","Yoga Bar","True Elements","Nature's Path","Bob's Red Mill","Jordan's","Alpen","Mornflake","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Happilo","RiteBite","Kind","Clif","RXBAR","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Lion","Freedom Foods","Uncle Tobys","Healthy Bowl","Prime Crunch","Daily Harvest"};
			return granolaBrands;
		}
		if(productName=="proteinbar")
		{
			String proteinbarBrands[]={"Quest","Clif","RXBAR","Kind","MuscleBlaze","MyProtein","Optimum Nutrition","Gatorade","PowerBar","Yoga Bar","RiteBite","PhD","Grenade","ONE Bar","BSN","Labrada","Six Star","Pure Protein","Think!","Herbalife","Amway","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Fit & Flex","Boldfit","Max Protein","Prime Bar","Daily Fuel"};
			return proteinbarBrands;
		}
		if(productName=="chips")
		{
			String chipsBrands[]={"Lay's","Pringles","Doritos","Cheetos","Ruffles","Kurkure","Bingo","Uncle Chips","Haldiram's","Balaji","Utz","Kettle","Tostitos","Fritos","Walkers","Smith's","Tyrrells","Cape Cod","Herr's","Wise","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Too Yumm","Popchips","Late July","Beanitos","Takis","Garden of Eatin'"};
			return chipsBrands;
		}
		if(productName=="namkeen")
		{
			String namkeenBrands[]={"Haldiram's","Bikaji","Balaji","Bikanervala","Garden","Lays","Kurkure","Bingo","Too Yumm","Pratap Snacks","Evergreen","Annapurna","Rajdhani","MTR","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Peppy","Yellow Diamond","Jabsons","Ganesh","Bhujialalji","Om Namkeen","Daily Snacks"};
			return namkeenBrands;
		}
		if(productName=="popcorn")
		{
			String popcornBrands[]={"Act II","Pop Secret","Orville Redenbacher's","Jolly Time","Kettle Corn","Pop Weaver","Weaver","Angie's","SkinnyPop","BoomChickaPop","Too Yumm","Haldiram's","Bikaji","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Propercorn","Butterkist","Joe & Seph's","Pipers","Popz","Cornitos","PopWorks","Prime Pop","Daily Pop","Snack Pop","Golden Crunch","Fresh Corn","Yum Pop"};
			return popcornBrands;
		}
		if(productName=="nachos")
		{
			String nachosBrands[]={"Doritos","Tostitos","Cornitos","Late July","Garden of Eatin'","Santitas","Mission","Old El Paso","El Paso","Que Pasa","Utz","On The Border","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Takis","Paqui","Frito-Lay","El Sabroso","Xochitl","Beanfields","Simply 7","Prime Nacho","Daily Crunch","Golden Bite","Snack House","Corn King","Fresh Fiesta","Yum Nacho"};
			return nachosBrands;
		}
		if(productName=="tortilla")
		{
			String tortillaBrands[]={"Mission","Old El Paso","Guerrero","La Banderita","Toufayan","Chi-Chi's","Casa Sanchez","Ortega","El Milagro","Azteca","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Wrapmaster","Santa Maria","La Tortilla Factory","Garden of Eatin'","Cornitos","Prime Wrap","Daily Flat","Golden Grain","Fresh Press","Casa Fiesta","Wrap King","Flourish","Soft Roll","MexiWrap","Yum Wrap","Fiesta Fresh"};
			return tortillaBrands;
		}
		if(productName=="frozenpeas")
		{
			String frozenpeasBrands[]={"Birds Eye","Green Giant","McCain","Bonduelle","Iceland","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Ardo","Pictsweet","Seabrook","Cascadian Farm","Nature's Touch","Prime Veg","Daily Fresh","Golden Harvest","Farm Fresh","Green Valley","Healthy Choice","Veggie Delight","Freshco","Simply Nature","Nature's Basket","Pure Harvest","Harvest Gold","Veg King","Garden Fresh"};
			return frozenpeasBrands;
		}
		if(productName=="frozenvegetables")
		{
			String frozenvegetablesBrands[]={"Birds Eye","Green Giant","McCain","Bonduelle","Iceland","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Ardo","Pictsweet","Seabrook","Cascadian Farm","Nature's Touch","Prime Veg","Daily Fresh","Golden Harvest","Farm Fresh","Green Valley","Healthy Choice","Veggie Delight","Freshco","Simply Nature","Nature's Basket","Pure Harvest","Harvest Gold","Veg King","Garden Fresh"};
			return frozenvegetablesBrands;
		}
		if(productName=="frozenfries")
		{
			String frozenfriesBrands[]={"McCain","Lamb Weston","Ore-Ida","Birds Eye","Green Giant","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Iceland","Ardo","Seabrook","Pictsweet","Cascadian Farm","Nature's Touch","Prime Fries","Daily Fresh","Golden Harvest","Farmhouse","Crispy King","Snack Time","FreshCo","Simply Nature","Harvest Gold","Veg Delight","Urban Fry","Bella Fries","Yum Crisps"};
			return frozenfriesBrands;
		}
		if(productName=="sausages")
		{
			String sausagesBrands[]={"Johnsonville","Jimmy Dean","Tyson","Hillshire Farm","Oscar Mayer","Smithfield","Hormel","Applegate","Aidells","Beyond Meat","Impossible","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Iceland","Farmhouse","Prime Cuts","Daily Fresh","Golden Harvest","Butcher's","FreshCo","Meat King","Urban Grill","Bella Meats","Yum Sausage","Pure Protein","Nature's Best"};
			return sausagesBrands;
		}
		if(productName=="salami")
		{
			String salamiBrands[]={"Columbus","Daniele","Applegate","Hormel","Oscar Mayer","Hillshire Farm","Smithfield","Boar's Head","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Iceland","Prime Cuts","Daily Fresh","Golden Harvest","Butcher's","FreshCo","Meat King","Urban Deli","Bella Meats","Yum Deli","Nature's Best","Pure Protein","Farmhouse","Italiano","Casa Deli","Gourmet Select"};
			return salamiBrands;
		}
		if(productName=="mayonnaiseeggless")
		{
			String mayonnaiseegglessBrands[]={"Veeba","Del Monte","Dr. Oetker","FunFoods","Wingreens","American Garden","Hellmann's","Heinz","Remia","Kewpie","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Spread","Daily Cream","Golden Taste","Urban Dip","Bella Spread","Yum Mayo","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Kitchen King","Simply Good","Taste Maker"};
			return mayonnaiseegglessBrands;
		}
		if(productName=="saladcream")
		{
			String saladcreamBrands[]={"Heinz","Kraft","Hellmann's","Remia","Thomy","Calve","American Garden","Del Monte","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Cream","Daily Fresh","Golden Taste","Urban Dip","Bella Spread","Yum Dressing","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Kitchen King","Simply Good","Taste Maker","Farmhouse","Creamy Select"};
			return saladcreamBrands;
		}
		if(productName=="soysauce")
		{
			String soysauceBrands[]={"Kikkoman","Lee Kum Kee","Pearl River Bridge","ABC","Healthy Boy","Yamasa","Maggi","Ching's Secret","Kimlan","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Sauce","Daily Taste","Golden Brew","Urban Wok","Bella Asian","Yum Sauce","Pure Soy","FreshCo","Nature's Best","Healthy Choice","Kitchen King","Simply Good","Taste Maker","Oriental Select","Asia Gold"};
			return soysauceBrands;
		}
		if(productName=="redchillisauce")
		{
			String redchillisauceBrands[]={"Maggi","Ching's Secret","Lee Kum Kee","Kikkoman","ABC","Veeba","Del Monte","American Garden","Heinz","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Sauce","Daily Spice","Golden Heat","Urban Wok","Bella Asian","Yum Sauce","Pure Spice","FreshCo","Nature's Best","Healthy Choice","Kitchen King","Simply Good","Taste Maker","Spice King","Hot Drop"};
			return redchillisauceBrands;
		}
		if(productName=="greentea")
		{
			String greenteaBrands[]={"Lipton","Tetley","Twinings","Dilmah","Bigelow","Tata Tea","Girnar","Teabox","Vahdam","Organic India","24 Mantra Organic","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Tea","Daily Brew","Golden Leaf","Urban Sip","Bella Tea","Yum Brew","Pure Green","FreshCo","Nature's Best","Healthy Choice","Tea King","Simply Good","Herbal Gold"};
			return greenteaBrands;
		}
		if(productName=="blacktea")
		{
			String blackteaBrands[]={"Lipton","Tetley","Twinings","Dilmah","PG Tips","Tata Tea","Red Label","Yorkshire Tea","Typhoo","Bigelow","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Tea","Daily Brew","Golden Leaf","Urban Sip","Bella Tea","Yum Brew","Pure Black","FreshCo","Nature's Best","Healthy Choice","Tea King","Simply Good","Classic Brew","Royal Leaf"};
			return blackteaBrands;
		}
		if(productName=="instantcoffee")
		{
			String instantcoffeeBrands[]={"Nescafe","Bru","Folgers","Maxwell House","Davidoff","Tata Coffee","Mount Hagen","Cafe Bustelo","Jacobs","Carte Noire","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Coffee","Daily Brew","Golden Roast","Urban Sip","Bella Brew","Yum Coffee","Pure Roast","FreshCo","Nature's Best","Healthy Choice","Coffee King","Simply Good","Classic Roast","Royal Brew"};
			return instantcoffeeBrands;
		}
		if(productName=="coffeebeans")
		{
			String coffeebeansBrands[]={"Lavazza","Illy","Starbucks","Peet's","Blue Tokai","Davidoff","Jacobs","Tata Coffee","Eight O'Clock","Death Wish","Kicking Horse","Segafredo","San Marco","Costa","Tchibo","Mount Hagen","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Roast","Daily Brew","Golden Bean","Urban Roast","Bella Coffee","Pure Bean","FreshCo","Royal Roast"};
			return coffeebeansBrands;
		}
		if(productName=="coffeepowder")
		{
			String coffeepowderBrands[]={"Nescafe","Bru","Lavazza","Illy","Starbucks","Peet's","Davidoff","Jacobs","Tata Coffee","Mount Hagen","Cafe Bustelo","Eight O'Clock","Folgers","Maxwell House","Segafredo","Costa","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Blend","Daily Brew","Golden Roast","Urban Coffee","Bella Brew","Pure Roast","FreshCo","Royal Blend"};
			return coffeepowderBrands;
		}
		if(productName=="milkpowder")
		{
			String milkpowderBrands[]={"Nestle","Amul","Nido","Lactogen","Aptamil","Enfamil","Similac","Danone","Cow & Gate","Kabrita","Britannia","Everyday","Dairy Whitener","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Dairy","Daily Milk","Golden Cream","Urban Dairy","Bella Milk","Pure Powder","FreshCo","Nature's Best","Healthy Choice","Royal Dairy","Milk King"};
			return milkpowderBrands;
		}
		if(productName=="condensedmilk")
		{
			String condensedmilkBrands[]={"Nestle","Amul","Milkmaid","Carnation","Eagle Brand","Longevity","Fraser & Neave","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Dairy","Daily Sweet","Golden Cream","Urban Dairy","Bella Milk","Pure Sweet","FreshCo","Nature's Best","Healthy Choice","Royal Dairy","Milk King","Sweet Delight","Creamy Select","Kitchen King","Taste Maker","Classic Sweet","Dairy Gold"};
			return condensedmilkBrands;
		}
		if(productName=="whippingcream")
		{
			String whippingcreamBrands[]={"Amul","Nestle","President","Anchor","Arla","Devondale","Milma","Mother Dairy","Organic Valley","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Cream","Daily Dairy","Golden Whip","Urban Cream","Bella Dairy","Pure Cream","FreshCo","Nature's Best","Healthy Choice","Royal Cream","Dairy King","Creamy Select","Kitchen King","Taste Maker","Classic Whip"};
			return whippingcreamBrands;
		}
		if(productName=="paneer")
		{
			String paneerBrands[]={"Amul","Mother Dairy","Nandini","Milky Mist","Britannia","Gowardhan","Paras","Verka","Aavin","Milma","Organic Valley","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Dairy","Daily Fresh","Golden Farm","Urban Dairy","Bella Fresh","Pure Paneer","FreshCo","Nature's Best","Healthy Choice","Royal Dairy","Farmhouse","Dairy King","Classic Farm"};
			return paneerBrands;
		}
		if(productName=="tofu")
		{
			String tofuBrands[]={"Mori-Nu","Nasoya","House Foods","Wildwood","Hodo","Simple Truth","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Soy","Daily Fresh","Golden Harvest","Urban Veg","Bella Tofu","Pure Soy","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Farmhouse","Soy King","Green Valley","Plant Fresh","Vegan Select","Kitchen King","Taste Maker","Natural Farm"};
			return tofuBrands;
		}
		if(productName=="soyamilk")
		{
			String soyamilkBrands[]={"Silk","Alpro","So Good","Pacific Foods","Vitasoy","Westsoy","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Soy","Daily Fresh","Golden Harvest","Urban Dairy","Bella Soy","Pure Plant","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Plant Power","Green Valley","Soy King","Farmhouse","Vegan Select","Kitchen King","Taste Maker","Natural Farm"};
			return soyamilkBrands;
		}
		if(productName=="almondmilk")
		{
			String almondmilkBrands[]={"Silk","Alpro","Blue Diamond","Califia Farms","Pacific Foods","So Good","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Almond","Daily Fresh","Golden Harvest","Urban Dairy","Bella Almond","Pure Plant","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Plant Power","Green Valley","Nutri Milk","Farmhouse","Vegan Select","Kitchen King","Taste Maker","Natural Farm"};
			return almondmilkBrands;
		}
		if(productName=="oatmilk")
		{
			String oatmilkBrands[]={"Oatly","Silk","Alpro","Califia Farms","Pacific Foods","So Good","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Oat","Daily Fresh","Golden Harvest","Urban Dairy","Bella Oat","Pure Plant","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Plant Power","Green Valley","Nutri Milk","Farmhouse","Vegan Select","Kitchen King","Taste Maker","Natural Farm"};
			return oatmilkBrands;
		}
		if(productName=="coconutmilk")
		{
			String coconutmilkBrands[]={"Thai Kitchen","Aroy-D","Chaokoh","Grace","Goya","Kara","Ayam","Native Forest","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Coconut","Daily Fresh","Golden Harvest","Urban Kitchen","Bella Coco","Pure Tropics","FreshCo","Nature's Best","Healthy Choice","Island Gold","Tropical Sun","Farmhouse","Vegan Select","Kitchen King","Taste Maker","Natural Farm"};
			return coconutmilkBrands;
		}
		if(productName=="buttercookies")
		{
			String buttercookiesBrands[]={"Walkers","Danisa","Royal Dansk","Pepperidge Farm","LU","Kelsen","Britannia","Parle","Unibic","Good Day","McVitie's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bakes","Daily Treat","Golden Bite","Urban Cookies","Bella Bake","Pure Butter","FreshCo","Nature's Best","Sweet Delight","Cookie King","Taste Maker","Classic Crunch","Royal Treat"};
			return buttercookiesBrands;
		}
		if(productName=="chocolatedrink")
		{
			String chocolatedrinkBrands[]={"Bournvita","Horlicks","Boost","Complan","Milo","Ovaltine","Cadbury","Nestle","Hershey's","Amul","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Choco","Daily Sip","Golden Cocoa","Urban Drink","Bella Choco","Pure Malt","FreshCo","Nature's Best","Healthy Choice","Energy Plus","Choco King","Taste Maker","Classic Cocoa","Royal Malt"};
			return chocolatedrinkBrands;
		}
		if(productName=="malteddrink")
		{
			String malteddrinkBrands[]={"Horlicks","Boost","Bournvita","Ovaltine","Milo","Complan","Amul","Nestle","Cadbury","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Malt","Daily Energy","Golden Malt","Urban Health","Bella Malt","Pure Boost","FreshCo","Nature's Best","Healthy Choice","Energy Plus","Malt King","Taste Maker","Classic Malt","Royal Boost","Power Sip"};
			return malteddrinkBrands;
		}
		if(productName=="cornchips")
		{
			String cornchipsBrands[]={"Doritos","Tostitos","Fritos","Mission","Late July","Old El Paso","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Crunch","Daily Snack","Golden Corn","Urban Chips","Bella Crunch","Pure Snack","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Crunch","Royal Bite","Crispy Corn","Farmhouse","Yum Chips","Spice Delight"};
			return cornchipsBrands;
		}
		if(productName=="potatonuggets")
		{
			String potatonuggetsBrands[]={"McCain","Birds Eye","Ore-Ida","Lamb Weston","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bites","Daily Snack","Golden Crisp","Urban Fry","Bella Nuggets","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Bites","Royal Snack","Farmhouse","Yum Nuggets","Veg Delight","Kitchen King","Crispy Treat","Spice Delight","Quick Fry"};
			return potatonuggetsBrands;
		}
		if(productName=="frozenpizza")
		{
			String frozenpizzaBrands[]={"DiGiorno","Red Baron","Totino's","California Pizza Kitchen","Amy's","Dr. Oetker","McCain","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Slice","Daily Bake","Golden Crust","Urban Pizza","Bella Slice","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Pizza King","Taste Maker","Classic Slice","Royal Crust","Farmhouse","Yum Pizza","Cheesy Delight","Quick Bake"};
			return frozenpizzaBrands;
		}
		if(productName=="frozenveg")
		{
			String frozenvegBrands[]={"Birds Eye","Green Giant","McCain","Ardo","Pictsweet","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Harvest","Daily Fresh","Golden Farm","Urban Veg","Bella Fresh","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Veg Delight","Farmhouse","Green Valley","Kitchen King","Taste Maker","Classic Veg","Royal Harvest","Quick Freeze","Natural Farm","Healthy Harvest"};
			return frozenvegBrands;
		}
		if(productName=="fishfingers")
		{
			String fishfingersBrands[]={"Birds Eye","Young's","Gorton's","McCain","Iceland","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Catch","Daily Sea","Golden Fish","Urban Catch","Bella Sea","Pure Ocean","FreshCo","Nature's Best","Healthy Choice","Sea King","Taste Maker","Classic Catch","Royal Sea","Farmhouse","Ocean Delight","Quick Fry","Sea Harvest","Crispy Catch","Blue Ocean"};
			return fishfingersBrands;
		}
		if(productName=="chickenpopcorn")
		{
			String chickenpopcornBrands[]={"Tyson","Perdue","Foster Farms","McCain","Yummy","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bites","Daily Snack","Golden Chicken","Urban Fry","Bella Bites","Pure Protein","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Bites","Royal Snack","Farmhouse","Yum Chicken","Spice Delight","Quick Fry","Crispy King","Protein Plus"};
			return chickenpopcornBrands;
		}
		if(productName=="nuggetsveg")
		{
			String nuggetsvegBrands[]={"McCain","Birds Eye","Yummy","Green Giant","MorningStar","Quorn","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Veg","Daily Snack","Golden Bite","Urban Fry","Bella Bites","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Veg","Royal Snack","Farmhouse","Veg Delight","Quick Fry","Crispy Treat","Green Harvest"};
			return nuggetsvegBrands;
		}
		if(productName=="springrolls")
		{
			String springrollsBrands[]={"Ajinomoto","Ching's Secret","Tai Pei","PF Chang's","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Snacks","Daily Fresh","Golden Roll","Urban Wok","Bella Bites","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Roll","Royal Snack","Farmhouse","Veg Delight","Quick Fry","Crispy King","Asia Delight","Spice Treat","Kitchen King"};
			return springrollsBrands;
		}
		if(productName=="samosa")
		{
			String samosaBrands[]={"Haldiram's","Bikanervala","Deep","Tasty Bite","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Snacks","Daily Fresh","Golden Samosa","Urban Bite","Bella Snacks","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Snack King","Taste Maker","Classic Bite","Royal Snack","Farmhouse","Veg Delight","Quick Fry","Spice Delight","Kitchen King","Yum Treat","Crispy Corner"};
			return samosaBrands;
		}
		if(productName=="readyparatha")
		{
			String readyparathaBrands[]={"Haldiram's","MTR","ITC","Deep","Ashoka","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Foods","Daily Fresh","Golden Wheat","Urban Kitchen","Bella Bites","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Paratha","Royal Taste","Farmhouse","Kitchen King","Yum Delight","Spice Treat","Desi Fresh","Quick Heat","Tandoor King"};
			return readyparathaBrands;
		}
		if(productName=="idlibatter")
		{
			String idlibatterBrands[]={"ID Fresh","MTR","Aashirvaad","Haldiram's","Deep","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Foods","Daily Fresh","Golden Batter","Urban Kitchen","Bella Foods","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Batter","Royal Taste","Farmhouse","Kitchen King","Yum Delight","Desi Fresh","Quick Mix","South Delight","Tradition Foods"};
			return idlibatterBrands;
		}
		if(productName=="dosabatter")
		{
			String dosabatterBrands[]={"ID Fresh","MTR","Aashirvaad","Haldiram's","Deep","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Foods","Daily Fresh","Golden Batter","Urban Kitchen","Bella Foods","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Batter","Royal Taste","Farmhouse","Kitchen King","Yum Delight","Desi Fresh","Quick Mix","South Delight","Tradition Foods"};
			return dosabatterBrands;
		}
		if(productName=="paneerbuttermasala")
		{
			String paneerbuttermasalaBrands[]={"MTR","Haldiram's","Ashoka","Deep","Tasty Bite","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Curry","Daily Fresh","Golden Taste","Urban Kitchen","Bella Foods","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Curry","Royal Taste","Farmhouse","Kitchen King","Yum Delight","Desi Fresh","Spice Treat","Curry King","Tradition Foods"};
			return paneerbuttermasalaBrands;
		}
		if(productName=="pastasauce")
		{
			String pastasauceBrands[]={"Barilla","Ragu","Prego","Bertolli","Classico","Dolmio","Colavita","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Sauce","Daily Taste","Golden Tomato","Urban Kitchen","Bella Sauce","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Sauce","Royal Taste","Farmhouse","Kitchen King","Italiano","Spice Delight","Cucina Fresh"};
			return pastasauceBrands;
		}
		if(productName=="barbecuesauce")
		{
			String barbecuesauceBrands[]={"Sweet Baby Ray's","Heinz","KC Masterpiece","Stubbs","Bull's-Eye","Jack Daniel's","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Grill","Daily Taste","Golden Smoke","Urban BBQ","Bella Sauce","Pure Grill","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic BBQ","Royal Smoke","Farmhouse","Kitchen King","Smoky Delight","Grill Master","Spice King","Texas Gold"};
			return barbecuesauceBrands;
		}
		if(productName=="mustard")
		{
			String mustardBrands[]={"Heinz","French's","Colman's","Maille","Grey Poupon","Gulden's","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Sauce","Daily Taste","Golden Spice","Urban Kitchen","Bella Sauce","Pure Spice","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Mustard","Royal Taste","Farmhouse","Kitchen King","Spice Delight","Dijon Gold","Yellow King","Hot Blend"};
			return mustardBrands;
		}
		if(productName=="chilliflakes")
		{
			String chilliflakesBrands[]={"Everest","Catch","Keya","MDH","Badshah","Eastern","Aachi","MTR","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Urban Platter","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Spice","Daily Fresh","Golden Sprinkle","Urban Kitchen","Bella Spice","Pure Spice","FreshCo","Nature's Best","Spice King","Taste Maker"};
			return chilliflakesBrands;
		}
		if(productName=="oregano")
		{
			String oreganoBrands[]={"Keya","Everest","Catch","MDH","Badshah","Eastern","Aachi","MTR","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Patanjali","Urban Platter","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Herb","Daily Fresh","Golden Leaf","Urban Kitchen","Bella Herb","Pure Herb","FreshCo","Nature's Best","Herb King","Taste Maker"};
			return oreganoBrands;
		}
		if(productName=="pastashells")
		{
			String pastashellsBrands[]={"Barilla","De Cecco","Colavita","San Remo","Ronzoni","Buitoni","Garofalo","La Molisana","Divella","Rummo","Panzani","Napolina","Delverde","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Pasta","Daily Fresh","Golden Grain","Urban Kitchen","Bella Pasta","Pure Wheat","FreshCo","Nature's Best","Italiano","Taste Maker","Cucina Fresh"};
			return pastashellsBrands;
		}
		if(productName=="macaroni")
		{
			String macaroniBrands[]={"Barilla","Ronzoni","Mueller's","American Beauty","De Cecco","Colavita","San Remo","Buitoni","Garofalo","La Molisana","Divella","Panzani","Napolina","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Pasta","Daily Fresh","Golden Grain","Urban Kitchen","Bella Pasta","Pure Wheat","FreshCo","Nature's Best","Italiano","Taste Maker","Cucina Fresh"};
			return macaroniBrands;
		}
		if(productName=="spaghetti")
		{
			String spaghettiBrands[]={"Barilla","De Cecco","Colavita","San Remo","Ronzoni","Buitoni","Garofalo","La Molisana","Divella","Rummo","Panzani","Napolina","Delverde","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Pasta","Daily Fresh","Golden Grain","Urban Kitchen","Bella Pasta","Pure Wheat","FreshCo","Nature's Best","Italiano","Taste Maker","Cucina Fresh"};
			return spaghettiBrands;
		}
		if(productName=="vermicelli")
		{
			String vermicelliBrands[]={"Bambino","MTR","Aashirvaad","Roasted Delight","Patanjali","24 Mantra Organic","Organic Tattva","Pro Nature","Natureland","Urban Platter","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Foods","Daily Fresh","Golden Grain","Urban Kitchen","Bella Foods","Pure Wheat","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Delight","Farmhouse","Desi Fresh","Tradition Foods"};
			return vermicelliBrands;
		}
		if(productName=="noodlescup")
		{
			String noodlescupBrands[]={"Maggi Cup","Nissin Cup","Top Ramen Cup","Yippee Cup","Indomie Cup","Samyang Cup","Ottogi Cup","Paldo Cup","Maruchan Cup","Mama Cup","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Noodles","Daily Snack","Golden Bowl","Urban Wok","Bella Cup","Pure Spice","FreshCo","Nature's Best","Snack King","Taste Maker","Classic Bowl","Royal Cup","Asia Delight","Spice King"};
			return noodlescupBrands;
		}
		if(productName=="readysoup")
		{
			String readysoupBrands[]={"Knorr","Campbell's","Maggi","Heinz","Baxters","Batchelors","Lipton","Nissin","MTR","Ashoka","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Soup","Daily Fresh","Golden Bowl","Urban Kitchen","Bella Foods","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Soup King","Taste Maker","Classic Bowl","Farmhouse","Kitchen King"};
			return readysoupBrands;
		}
		if(productName=="souppowder")
		{
			String souppowderBrands[]={"Knorr","Maggi","Lipton","Campbell's","Batchelors","Heinz","Baxters","MTR","Ashoka","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Soup","Daily Fresh","Golden Mix","Urban Kitchen","Bella Foods","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Soup King","Taste Maker","Classic Mix","Farmhouse","Kitchen King","Spice Delight"};
			return souppowderBrands;
		}
		if(productName=="tomatopuree")
		{
			String tomatopureeBrands[]={"Del Monte","Heinz","Mutti","Cirio","Hunt's","Colavita","American Garden","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Tomato","Daily Fresh","Golden Harvest","Urban Kitchen","Bella Sauce","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Puree","Farmhouse","Kitchen King","Italiano","Spice Delight","Red Gold","Cucina Fresh"};
			return tomatopureeBrands;
		}
		if(productName=="tomatoketchup")
		{
			String tomatoketchupBrands[]={"Heinz","Kissan","Del Monte","Maggi","Veeba","Hunt's","French's","American Garden","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Sauce","Daily Taste","Golden Tomato","Urban Kitchen","Bella Sauce","Pure Veg","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Ketchup","Farmhouse","Kitchen King","Red Gold","Spice Delight","Royal Taste"};
			return tomatoketchupBrands;
		}
		if(productName=="schezwansauce")
		{
			String schezwansauceBrands[]={"Ching's Secret","Maggi","Lee Kum Kee","Veeba","Del Monte","Urban Platter","Keya","American Garden","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Spice","Daily Taste","Golden Heat","Urban Wok","Bella Sauce","Pure Spice","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Spice","Farmhouse","Kitchen King","Asia Delight","Spice King","Hot Blend"};
			return schezwansauceBrands;
		}
		if(productName=="pizzabase")
		{
			String pizzabaseBrands[]={"Britannia","Ready2Cook","Old El Paso","Mission","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Bake","Daily Fresh","Golden Crust","Urban Kitchen","Bella Bake","Pure Wheat","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Base","Farmhouse","Kitchen King","Italiano","Spice Delight","Royal Crust","Bake Master","Yum Delight","Cucina Fresh","Quick Bake"};
			return pizzabaseBrands;
		}
		if(productName=="burgerbuns")
		{
			String burgerbunsBrands[]={"Wonder","Sara Lee","Britannia","Nature's Own","Pepperidge Farm","Arnold","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Bake","Daily Fresh","Golden Wheat","Urban Bakery","Bella Bake","Pure Grain","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Bun","Farmhouse","Kitchen King","Bake Master","Yum Delight","Royal Bake","Soft Bite","Bread King"};
			return burgerbunsBrands;
		}
		if(productName=="hotdogbuns")
		{
			String hotdogbunsBrands[]={"Wonder","Sara Lee","Britannia","Nature's Own","Pepperidge Farm","Arnold","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Bake","Daily Fresh","Golden Wheat","Urban Bakery","Bella Bake","Pure Grain","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Bun","Farmhouse","Kitchen King","Bake Master","Yum Delight","Royal Bake","Soft Roll","Bread King"};
			return hotdogbunsBrands;
		}
		if(productName=="tortillas")
		{
			String tortillasBrands[]={"Mission","Old El Paso","Guerrero","La Banderita","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Wrap","Daily Fresh","Golden Wheat","Urban Kitchen","Bella Wrap","Pure Grain","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Wrap","Farmhouse","Kitchen King","Mexicana","Spice Delight","Royal Wrap","Soft Bite","Wrap Master","Yum Delight","Bake Fresh"};
			return tortillasBrands;
		}
		if(productName=="tacoshells")
		{
			String tacoshellsBrands[]={"Old El Paso","Mission","Ortega","Guerrero","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Prime Crunch","Daily Fresh","Golden Corn","Urban Kitchen","Bella Shell","Pure Corn","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Shell","Farmhouse","Kitchen King","Mexicana","Spice Delight","Royal Shell","Crispy Bite","Wrap Master","Yum Delight","Bake Fresh"};
			return tacoshellsBrands;
		}
		if(productName=="cheeseslices")
		{
			String cheeseslicesBrands[]={"Amul","Britannia","Kraft","Velveeta","Sargento","President","Arla","Laughing Cow","Dairyland","Bega","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Dairy","Daily Fresh","Golden Slice","Urban Dairy","Bella Cheese","Pure Milk","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Slice","Farmhouse","Dairy King","Creamy Delight"};
			return cheeseslicesBrands;
		}
		if(productName=="cheesespread")
		{
			String cheesespreadBrands[]={"Amul","Britannia","Kraft","President","Arla","Laughing Cow","Bega","Dairylea","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Dairy","Daily Fresh","Golden Spread","Urban Dairy","Bella Cheese","Pure Milk","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Spread","Farmhouse","Dairy King","Creamy Delight","Cheese King","Soft Cream"};
			return cheesespreadBrands;
		}
		if(productName=="chocolatesyrup")
		{
			String chocolatesyrupBrands[]={"Hershey's","Nestle","Smucker's","Bosco","Fox's","Amul","Cadbury","Ghirardelli","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Choco","Daily Sweet","Golden Cocoa","Urban Treat","Bella Syrup","Pure Choco","FreshCo","Nature's Best","Healthy Choice","Taste Maker","Classic Syrup","Farmhouse","Dessert King","Sweet Delight","Royal Choco","Cocoa Gold"};
			return chocolatesyrupBrands;
		}
		if(productName=="brownie")
		{
			String brownieBrands[]={"Betty Crocker","Duncan Hines","Ghirardelli","Pillsbury","Cadbury","Nestle","Hershey's","Britannia","MTR","Epigamia","Theobroma","Monginis","Baker's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bake","Daily Treat","Golden Bite","Urban Dessert","Bella Bakes","Pure Cocoa","FreshCo","Nature's Best","Sweet Delight","Dessert King","Royal Bake"};
			return brownieBrands;
		}
		if(productName=="cupcakes")
		{
			String cupcakesBrands[]={"Hostess","Little Debbie","Betty Crocker","Duncan Hines","Cadbury","Nestle","Hershey's","Britannia","Monginis","Theobroma","Baker's","Great Value","365 Everyday Value","Kroger","Signature Select","H-E-B","Trader Joe's","Whole Foods","Tesco","Sainsbury's","Waitrose","Marks & Spencer","Coles","Woolworths","Prime Bake","Daily Treat","Golden Cup","Urban Dessert","Bella Bakes","Pure Sweet","FreshCo","Nature's Best","Sweet Delight","Dessert King","Royal Bake","Cupcake Corner","Bake Master"};
			return cupcakesBrands;
		}
		return new String[]{"Product not available"};
	}
}