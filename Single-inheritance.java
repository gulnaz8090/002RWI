// Single - Inheritance.
class Parent{
    void showParent(){
        System.out.println(" Hello From Parent! ");
    }
}

class Child extends Parent {
    void showChild(){
        System.out.println(" Hello from Child! ");
    }

}

class Mainclass{
    public static void main(String args[]){
        Child c = new Child();
        c.showChild();
        c.showParent();
    }
}