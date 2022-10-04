public class task2Main {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for ( int i = 0; i < 10; i++) {
            int temp = b;
            b += a;
            a = temp;
            System.out.println(b);
        }
    }
}
