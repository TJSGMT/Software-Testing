public class thissdemo
{

    private String name;

    public thissdemo()
    {
        this("Tejas Gamit");
    }

    public thissdemo(String name)
    {
        this.name = name;
        System.out.println("name = "+this.name);
    }
    public static void main(String[] args) {
        thissdemo t1 = new thissdemo();
        
    }
}