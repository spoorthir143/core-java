class BuyMeACoffee
{
    static void donate(String supporter)
    {
        System.out.println("Donating coffee:");
        System.out.println(supporter);
    }

    static void donate(String supporter,String creator,int amount)
    {
        System.out.println("Supporter: " + supporter);
        System.out.println("Creator: " + creator);
        System.out.println("Amount: " + amount);
    }
}

