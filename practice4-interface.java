interface I {
   String strI=" Hello From I ";
   void showstrI();
}
interface J{
    String strJ=" Hello From J ";
    void showstrJ();
}
class  Child implements I,J{
    public void showstrI(){
        System.out.println(strI);
    }
    public void showstrJ(){
        System.out.println(strJ);
    }
}
class Mainclass{
    public static void main(String args[]){
        Child C = new Child();
        C.showstrI();
        C.showstrJ();
    }
}
