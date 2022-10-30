import java.util.Scanner;

public class task7Main {
    public static void main(String[] args){
        Scanner readStr = new Scanner(System.in);
        String word = readStr.nextLine();
        System.out.println(word.matches("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"));
        readStr.close();
    }
}
