package BreakingSingletonDesingPattern;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception{

        Samosa s1 = Samosa.getSamosa();

        //Reflection API Start
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Samosa s2 = constructor.newInstance();

        if(s1 != s2){
            System.out.println("Singleton Design pattern is broken");
            System.out.println("Hashcode of s1 is : "+ s1.hashCode());
            System.out.println("Hashcode of s2 is : "+ s2.hashCode());
        }
        
        
    }
    
}
