class parent
{
    void show(){
        System.out.println("parent class");
    }
}

class child extends parent {
    void show() {
        System.out.println("Child class");
    }
    public static void main(String[] args)
    {
        child c = new child();
        c.show();
    }
}