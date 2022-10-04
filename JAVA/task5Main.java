import java.util.Scanner;

public class task5Main {
    public static void main(String[] args){
        int amount = 0;
        Scanner  readobj = new Scanner(System.in);
        amount = readobj.nextInt();
        Scanner readStr = new Scanner(System.in);
        String str = readStr.nextLine();
        int minStr = str.length();
        int maxStr = str.length();
        String strMax = str;
        String strMin = str;

        for (int i = 0; i < amount; ++i){
            str = readStr.nextLine();
            strMax = str.length() > maxStr ? str : strMax;
            maxStr = str.length() > maxStr ? str.length() : maxStr;
            strMin = str.length() < minStr ? str : strMin;
            minStr = str.length() < minStr ? str.length() : minStr;
        }

        System.out.println(strMin.toString());
        System.out.println(minStr);
        System.out.println(strMax.toString());
        System.out.println(maxStr);
        readobj.close();
        readStr.close();
    }

}
