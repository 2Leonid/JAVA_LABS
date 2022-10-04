import java.util.Scanner;

public class task6Main {
    public static void main(String[] args){
        Scanner readStr = new Scanner(System.in);
        String str = readStr.nextLine();
        String[] word = str.split(" ");
        int counter = 0;
        for (String i: word) {
            counter += (i.matches("(.*)[А-Яа-я0-9](.*)") ? 1 : 0);
            // System.out.println(i.toString());
            // System.out.println(i.matches("(.*)[А-Яа-я0-9](.*)"));
        }
        System.out.println(counter);
        readStr.close();
    }
}
