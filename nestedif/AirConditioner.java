class AirConditioner
{
    static int maxTemperature = 30;
    static int minTemperature = 16;
    static int currentTemperature = 24;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The air conditioner power is On");
        }
        else
        {
            System.out.println("The air conditioner power is Off");
        }
    }

    static void increaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature < maxTemperature)
            {
                currentTemperature++;
                System.out.println("Temperature increased to: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached maximum temperature");
            }
        }
        else
        {
            System.out.println("The air conditioner is Off");
        }
    }

    static void decreaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature > minTemperature)
            {
                currentTemperature--;
                System.out.println("Temperature decreased to: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached minimum temperature");
            }
        }
        else
        {
            System.out.println("The air conditioner is Off");
        }
    }
}

