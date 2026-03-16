class KoFi
{
    static void donateCoffee(String user)
    {
        System.out.println("Buying coffee for creator:");
        System.out.println(user);
    }

    static void donateCoffee(String user,String creator,int cups)
    {
        System.out.println("User: " + user);
        System.out.println("Creator: " + creator);
        System.out.println("Cups: " + cups);
    }
}

