public class LikeeUserExecutor
{
    public static void main(String[] args)
    {
        LikeeUser.logIn("user@gmail.com", "pass123");
        LikeeUser.logIn(9876543210L, "pass456");
    }
}