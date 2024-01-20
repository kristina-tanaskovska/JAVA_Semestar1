public abstract class specialColor {
    String color;
    public specialColor(String color){
        this.color=color;
    }
    public abstract void changeColor();
    public void printColor(){
        System.out.println("Color: "+color);
    }

    public static void main(String[] args) {
        Yellow y = new Yellow();
        Red r = new Red();

        r.printColor();
        y.printColor();

        r.changeColor();
        y.changeColor();

        r.printColor();
        y.printColor();
    }


}
