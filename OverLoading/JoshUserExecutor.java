public class JoshUserExecutor
{
    public static void main(String[] args)
    {
        JoshUser.logIn("user@gmail.com", "pass123");
        JoshUser.logIn(9876543210L, "pass456");
    }
}