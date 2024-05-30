// Hierarchical - Inheritance.
class Parent{
    void showParent(){
        System.out.println(" Hello From Parent! ");
    }
}

class ChildOne extends Parent {
    void showChildOne(){
        System.out.println(" Hello from ChildOne! ");
    }

}

class ChildTwo extends Parent{
    void showChildTwo(){
        System.out.println(" Hello From Childtwo! ");
    }
}

class Mainclass{
    public static void main(String args[]){
        ChildOne c1 = new ChildOne();
        c1.showChildOne();
        c1.showParent();
        ChildTwo c2 = new ChildTwo();
        c2.showChildTwo();
        c2.showParent();  
    }
}