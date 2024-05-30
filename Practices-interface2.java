interface I{
    String showstr();
    public abstract String showstr1();
    String showstr2(String s);
}
class Child implements I {
   public String showstr(){
    
      String s="Hello";
      return s;
    }
    public  String showstr1(){
    
         String s1="Hii";
        return s1 ;
       
    } 
    public String showstr2(String s){
       
            String s2=" Bye "+s;
            return s2;
       }
    
}
class Mainclass{
    public static void main(String args[]){
        Child c = new Child();
       System.out.println(c.showstr());
       System.out.println (c.showstr1());
       System.out.println (c.showstr2("Gulnaz"));
    }
}