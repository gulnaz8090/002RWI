interface I{
    String str1 = "Hello";
    public static final String str2 = " Hi ";
    void showstr1();
    void showstr2();
    
} 
class S implements I {
    public void showstr1(){
        System.out.println(str1);
    }
    public void showstr2(){
        System.out.println(str2);
    }
}
class Mainclass{
    public static void main(String args[]){
        S c = new S();
        c.showstr1();
        c.showstr2();
        
    }
}