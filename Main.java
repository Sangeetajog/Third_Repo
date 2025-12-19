// Use of Object and Classes in Java
class Main 
{
    // Properties
    private int a;
    private int b;

    // Methods
    public void sum() { System.out.println(a + b); }

    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {
        // Creating Instance of Class
        // Object
        Main obj = new Main();

        // Assigning Values to the Properties
        obj.a = 1;
        obj.b = 2;

        // Using the Methods
        obj.sum();
        obj.sub();
    }
}