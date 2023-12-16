package ThreadSafeSingleton;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(Car.getCar().hashCode());
        System.out.println(Car.getCar().hashCode());

    }
    
}
