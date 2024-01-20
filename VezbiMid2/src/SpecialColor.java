public abstract class SpecialColor {

    String color;
    abstract void changeColor();
    public void printColor(){

    }

    public static void main(String[] args) {
        Yellow y = new Yellow();
        y.changeColor();
        y.printColor();
    }

}

