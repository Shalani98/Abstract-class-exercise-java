abstract class Animal{
    public abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        System.out.println("wee");}
       public void eat(){
         System.out.println("ban");

    }
}
class Pig extends Animal{
    public void sound(){
        System.out.println("uoo");
    }
    public void eat(){
        System.out.println("ban");
    }
}

public class Main{
    public static void main (String[]args){
        Lion myLio = new Lion();
        Pig myPig = new Pig();

        myLio.sound();
        myPig.sound();
        myLio.eat();
        myPig.eat();
    }
}