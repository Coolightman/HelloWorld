public class Dog
{
    private int size;
    private String breed;
    private String name;

    public void setSize(int sizeA)
    {
        size=sizeA;
    }
    public void setName(String nameA)
    {
        name=nameA;
    }
    public void setBreed(String breedA)
    {
        breed=breedA;
    }

    public int getSize()
    {
        return size;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }

    void bark(int NumOfBarks)  //метод
    {
        System.out.print(name+": ");
        while(NumOfBarks>0)
        {
            if (size>40)
                System.out.print("Вуф!");
            else if (size>20)
                System.out.print("Гав!");
            else
                System.out.print("Тяф!");
            NumOfBarks=NumOfBarks-1;
        }
        System.out.println();
    }
}
