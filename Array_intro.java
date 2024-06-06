// Array :- Collection of similar type of element, stored in 
//consecutive memory locations.
// Every Array in java by default an Object of array class. 

// Element By Element Initialization.

class ArrayDemo{
    public static void main(String args[]){
        //Syntax to create array in java:-
        //<datatype> <arrayName> [] = new <dataType> [<arraySize>]
        String days[] = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednessday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Staurday";
        for(int i=0; i<=6;i++){
            System.out.println(days[i]);
        }
        
    }
}