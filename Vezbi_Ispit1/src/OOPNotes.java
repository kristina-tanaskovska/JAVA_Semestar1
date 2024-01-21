public class OOPNotes {
    /*
    public -accessible  to all classes
    protected-within package and subclasses
    private-only within the class its defined at
    with nothing-within class and package its defined at

    -Set the parameters in one method
    -Get the parameters to print in another method
    -Call them in main function to execute

        static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }

    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String args[]) {
        GFG.set("Cathode Avinash", 10000.0f);
        GFG.get();
    }

    -Encapsulation
        -write all variables private
        -write public getters and setters for these variables in the class
    -Inheritance
        -parent class has methods
        -subclass extends parent
            -has parent methods + its own declared ones
    -Polymorphism
       -differentiation of similar
           -sleep(1000) //millis
            -sleep(1000,2000) //millis,nanos
     -Static
        -can function without an object in it
        -cant be called by name.function()
        -cant be called by class object defining object-oriented feature


     try{
            Class cls = Class.forName("GFG");
            // Creating object of main class
            // using instance method
            GFG obj = (GFG)cls.newInstance();

     }
     catch(ClassNotFoundException e || InstantiationException e || IllegalAccessException e) {
        e.printStackTree();
     }

     Super(); //refers to upper class

     HOW TO CREATE A METHOD
     public static void main(String[] args)
    {
        GFG obj1 = new GFG();
        // Try block to check for exceptions
        try {
            GFG obj2 = (GFG)obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    INITIALIZING OBJECTS
    public class Dog{
        int age
        String name
            public Dog( int age, String name){      //CONSTRUCTOR
                this.age = age;
                this.name = name;
            }

        public String getName() { return name; }    //GETTER

        @Override public String toString()          //OUTPUT
    {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
        main(){
        Dog NAME = new Dog("Name", 50);
        sout(NAME.toString());

        //GETERS AND SETTERS

        public void set(String n){
            name = n;
        }
        public void get(){
            sout(""+name)
        }
        main(){
            ClassName.set("bla bla");
            ClassName.get();
        }

        CLASS- blueprint in object
        OBJECT-instance of class
        CONSTRUCTOR - special method used for initializing objects
        COMPILE TIME POLYMORPHISM
            -METHOD OVERLOADING- have same name different signatures
        DYNAMIC RUN TIME POLYMORPHISM

        MULTIPLE INHERITANCE
        interface Three extends One, Two { //TO HAVE MULTIPLE PARENTS INTERFACE
    public void print_geek();
}
class Child implements Three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

        TYPES OF INHERITANCE
        -single
        -multiple
        -hierarchical
        -hybrid


       public abstract void NAME(); // IN ABSTRACT CLASS
       public void NAME            // IN SUBCLASS METHOD

       //INTERFACE use IMPLEMENT
interface {
    // declare constant fields
    // declare methods that abstract
    // by default.
    -all methods are empty
    -all variables are public static
    -must inherits all methods of interface

    // A simple interface
interface Player
{
    final int id = 10;
    int move();
}
interface NAME_INTERFACE extends ClassA, ClassB{} //how to implement

}
ABSTRACT METHODS
Any class that contains one or more abstract methods must also be declared abstract.
If a class contains an abstract method it needs to be abstract and vice versa is not true.
If a non-abstract class extends an abstract class, then the class must implement all the abstract methods of the abstract class else the concrete class has to be declared as abstract as well.
The following are various illegal combinations of other modifiers for methods with respect to abstract modifiers:
final
abstract native
abstract synchronized
abstract static
abstract private
abstract strictfp


     */
}
