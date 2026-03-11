class KettleExe
{
    public static void main(String[] args)
    {
        Kettle.powerOn(true);
        Kettle.increaseTemperature();
        Kettle.increaseTemperature();
        Kettle.decreaseTemperature();
    }
}