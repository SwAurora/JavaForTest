package Ch31;

class 호빵<T>
{
    private T material;
    
    호빵(T material)
    {
        this.material = material;
    }
    
    void ShowInfo()
    {
        System.out.println(material.toString() + "으로 만든 호빵");
    }
}

class 팥
{
    String material;
    
    팥(String material)
    {
        this.material = material;
    }

    @Override
    public String toString()
    {
        return material;
    }
}

class 슈크림
{
    String material;
    
    슈크림(String material)
    {
        this.material = material;
    }

    @Override
    public String toString()
    {
        return material;
    }
}

class 피자
{
    String material;

    피자(String material)
    {
        this.material = material;
    }
}

public class C01GenericMain
{
    public static void main(String[] args)
    {
        호빵 ob1 = new 호빵<팥>(new 팥("단팥"));
        ob1.ShowInfo();
        호빵 ob2 = new 호빵<슈크림>(new 슈크림("맛있는 슈크림"));
        ob2.ShowInfo();
    }
}
