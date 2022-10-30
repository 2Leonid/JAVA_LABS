public class task8Main {
    public static void main(String[] args){
        vector v1 = new vector(1, 1, 1);
        vector v2 = new vector(2, 2, 2);
        vector v3 = vector.sum(v1, v2);
        System.out.println(v3.x+" "+ v3.y+" "+ v3.z);
    }  
}
class vector {
        int x = 0;
        int y = 0;
        int z = 0;

        vector() {
            x = 0;
            y = 0;
            z = 0;
        }

        vector(int x_v, int y_v, int z_v){
            x = x_v;
            y = y_v;
            z = z_v;
        }

        public static vector sum(vector one, vector two){
            return new vector(one.x + two.x, one.y + two.y, one.z + two.z);
        }

        public static vector difference(vector one, vector two){
            return new vector(one.x - two.x, one.y - two.y, one.z - two.z);
        }

        public static int scal(vector one, vector two){
            return one.x * two.x + one.y * two.y + one.z * two.z;
        }

        public static double norm(vector v){
            return  Math.sqrt(scal(v, v));
        }
    }