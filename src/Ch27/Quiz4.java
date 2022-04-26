package Ch27;

class Km2Mile extends Converter
{
    @Override
    protected double convert(double val)
    {
        return val / ratio;
    }

    @Override
    protected String getSrcString()
    {
        return "Km";
    }

    @Override
    protected String getDestString()
    {
        return "mile";
    }

    public Km2Mile(double ratio)
    {
        this.ratio = ratio;
    }

    @Override
    public void run()
    {
        super.run();
    }
}

public class Quiz4
{
    public static void main(String[] args)
    {
        Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6km
        toMile.run();
    }
}
