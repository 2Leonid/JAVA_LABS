public class task9Main {
    public static void main (String[] args){

    }
}

class Student {
    String FirstName = " ";
    String LastName = " ";
    double AR = 0;

    Student () {
        FirstName = "Not value";
        LastName = "Not value";
        AR = 0;
    }

    Student(String FirstName, String LastName, double AR){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AR = AR;
    }

    public int getScholarship(){
        if (AR < 5.0){
            return 40;
        } else {
            return 80;
        }
    }        
}
class PostGraduateStudent extends Student{
    public int getScholarship(){
        if (AR < 5.0){
            return 100;
        } else {
            return 150;
        }
    }        
}
