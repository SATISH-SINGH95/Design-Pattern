package ThreadSafeSingleton;

public class Car{

    private static Car car;

    private Car(){

    }

    public static Car getCar(){
        
        if(car == null){
            synchronized(Car.class){ // sysnchornized block is user here. If thread saftey is needed then use this approach
                if(car == null){
                    car = new Car();
                }
            }
        }
        return car;
    }
    
}