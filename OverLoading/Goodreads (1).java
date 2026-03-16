class Goodreads
{
    static void reviewBook(String user)
    {
        System.out.println("Reviewing book:");
        System.out.println(user);
    }

    static void reviewBook(String user,String book,int rating)
    {
        System.out.println("User: " + user);
        System.out.println("Book: " + book);
        System.out.println("Rating: " + rating);
    }
}

