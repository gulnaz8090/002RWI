class Parent{
     void show(){
    System.out.println(" Hello From Parent ");
    }                                                                           
}
class Child extends Parent{
    void show(){
        System.out.println(" Hello From Child ");
    }
}
class Mainclass{
    public static void main(String args[]){
        Child c = new Child();
        c.show();
        c.show();
    }
}
 