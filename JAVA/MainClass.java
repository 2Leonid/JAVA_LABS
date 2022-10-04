import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner readobj = new Scanner(System.in);
        int data = 0;
        data = readobj.nextInt();
        data = Math.abs(data);
        while (data % 2 == 0){
            data /= 2;
        }
        System.out.println(data==1);
        readobj.close();
    }
}