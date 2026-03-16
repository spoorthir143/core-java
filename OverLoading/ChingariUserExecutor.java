public class ChingariUserExecutor
{
    public static void main(String[] args)
    {
        ChingariUser.logIn("user@gmail.com", "pass123");
        ChingariUser.logIn(9876543210L, "pass456");
    }
}