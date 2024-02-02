public abstract class Plant {
    String name;
    int age;
    public Plant(){
        this.name = name;
        this.age= age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void giveWater();
    public void  display(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }



}

