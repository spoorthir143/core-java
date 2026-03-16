class Foursquare
{
    static void checkIn(String user)
    {
        System.out.println("User checking in:");
        System.out.println(user);
    }

    static void checkIn(String user,String location,int rating)
    {
        System.out.println("User: " + user);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
    }
}

