abstract class SpecialColor1 {
    String color;
    public SpecialColor1(String color){
        this.color = color;
    }

    public abstract void changeColor();
    public void printColor{
        System.out.println("This color is: "+color);
    }

    public static void main(String[] args) {
        Yellow y= new Yellow();
        y.changeColor();
        y.changeColor();
        y.printColor();
    }
}
