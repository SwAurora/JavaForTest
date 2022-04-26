package Ch31;

class Material
{
    @Override
    public String toString()
    {
        return "그냥재료";
    }
}

class caramel extends Material
{
    @Override
    public String toString()
    {
        return "캬라멜";
    }
}

class onion extends Material
{
    @Override
    public String toString()
    {
        return "어니언";
    }
}

class Mincho extends Material
{
    @Override
    public String toString()
    {
        return "민트초코";
    }
}

class PopCorn<T extends Material>
{
    private T material;

    public T getMaterial()
    {
        return material;
    }

    public void setMaterial(T material)
    {
        this.material = material;
    }

    public void Fry()
    {
        System.out.println(material + "맛 팝콘을 만듭니다.");
    }
}

public class C05GenericMain
{
    public static void main(String[] args)
    {
        PopCorn<caramel> corn1 = new PopCorn<caramel>();
        corn1.setMaterial(new caramel());
        corn1.Fry();

        PopCorn<onion> corn2 = new PopCorn<onion>();
        corn2.setMaterial(new onion());
        corn2.Fry();

        PopCorn<Mincho> corn3 = new PopCorn<Mincho>();
        corn3.setMaterial(new Mincho());
        corn3.Fry();
    }
}
