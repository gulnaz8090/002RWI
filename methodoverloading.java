// Method Overoading :- A single class can have more than one methods with same name,but diffrent signature.
class Student{
     void show( int msg,String str){
     System.out.println(" I am "+msg+" year old ");
}
void show(String name){
    System.out.println("Hey I'm student My Name is:"+name);

}
}

class Mainclass{
    public static void main( String args[]){

    Student Stud = new Student();
    Stud.show(" Gulnaz " );
    Stud.show(18 ,"Aakash");
}
}
