import java.util.Scanner;

public class task3Main {
    public static void main(String[] args){
        int amount = 0;
        Scanner  readobj = new Scanner(System.in);
        amount = readobj.nextInt();
        Integer[] myArray = new Integer[amount];
        for (int i = 0; i < amount; i++){
            int temp = readobj.nextInt();
            if( Math.abs(temp) % 2 == 1) {
                myArray[i] = temp;
            } 
        }
        //System.out.println(Arrays.deepToString(myArray));
        for( Integer i: myArray){
            System.out.print(i != null ? i + ", " : "");
        }
        readobj.close();

    }
}
