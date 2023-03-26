
class Animal{
    Animal(){
        System.out.println("Animal Cons");
    }
    public void getName(){
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Cons");
    }
    public void getName(){
        System.out.println("Dog");
        super.getName();
    }
}
public class Overriding{
    public static void main(String[] args){
        Dog dalley = new Dog();
        dalley.getName();
    }
}