public class GabUserExecutor
{
    public static void main(String[] args)
    {
        GabUser.logIn("user@gmail.com", "pass123");
        GabUser.logIn(9876543210L, "pass456");
    }
}