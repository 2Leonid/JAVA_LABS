public class task10Main {
    public static void main(String[] args){

    }

}

interface vehicle {
    public default void go (){
        System.out.println("Go!");
    } 

    public default void stop(){
        System.out.println("Stop!");
    }

    public void getColour(); 
}

abstract class publicTransport implements vehicle {
    String colour;
    int NOP; 
}

class tram extends publicTransport{
    String colour = "";
    int NOP = 0;
    public void getColour(){
        System.out.println(colour);
    }

    tram(String Colour, int NOP){
        this.colour = Colour;
        this.NOP = NOP;
    }

    tram(){
        this.colour = "not colour";
        this.NOP = 0;
    }
}