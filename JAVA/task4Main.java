import java.util.Scanner;

public class task4Main {
    public static void main(String[] args){
        Scanner readStr = new Scanner(System.in);
        String str = readStr.nextLine();
        System.out.println(pol(str));
        readStr.close();
    }

    private static boolean pol(String str){
        String newStr = str.replaceAll("^[A-Za-z0-9]", "").toLowerCase();
        StringBuilder STR = new StringBuilder(newStr);
        return STR.equals(STR.reverse()); 
    }
}
