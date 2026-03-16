public class HiveUserExecutor
{
    public static void main(String[] args)
    {
        HiveUser.logIn("user@gmail.com", "pass123");
        HiveUser.logIn(9876543210L, "pass456");
    }
}