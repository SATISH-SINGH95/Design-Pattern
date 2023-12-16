package SingeltonDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();

        if(s1.hashCode()==s2.hashCode()){
            System.out.println("Singleton Design pattern is followed here");
            System.out.println("hashcode of s1 is "+ s1);
            System.out.println("hashcode of s2 is "+ s2);
        }else{
            System.out.println("Singleton Design pattern is not followed here");
        }
    }
    
}
