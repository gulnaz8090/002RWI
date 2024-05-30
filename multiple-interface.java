class parent{
    void showParent(){
        System.out.println(" Hello From Parent ");
    }
}

interface I{
    String str = " Hello From MyInterface ";
    void showI();

    }
    class Child  extends parent implements I{
        public void showI(){
            System.out.println(str);

        }
    }
    class Mainclass {
        public static void main(String args []){
            Child c = new Child();
            c.showParent();
            c.showI();
        }
    }




