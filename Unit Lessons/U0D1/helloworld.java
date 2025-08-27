// a class is a collection of related attributes and behaviors

public class helloworld {

    // Main -> an entrypoint for your computer to start running code

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("my name is Remy");

        System.out.print("My favorite pizza topping is sausage.");
        System.out.println(" My favorite caffeinated drink is redbull");

        // 8 primitive data types 
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal number
        
        // INT ALTERNATIVES
        byte age = 25;
        short population = 3200;
        long bigInteger = 10000;

        String myName = "remy"; // String is a CLASS not a primitive data type
        // a colleciton of Primitive characters to describe text
        //print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this then that
        // conditions are always BOOLEAN meaning ture/false
        int value = 5;
        if (value ==5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;

        if (isCompSciFun == false){
            System.out.println("Comp SCi Sucks");
        } else if (isCompSciFun == true); {
            System.out.println("Comp SCi is fun!")
        }
        
        if(isCompSciFun){
            System.out.println("Comp sci is fun")

        } else {
            System.out.println("Comp sci stresses me out");
        }

        // Challenge: write a conditional if else statement where you do something if you ate five apples vs 10
        
        int applecount = 5;
        if(applecount == 5){
            System.out.println("You ate five apples");
        } else {
            System.out.println("You ate a different amount of apples");
        }
        if (appleCount == 5 || applecount ==10){
            System.out.println("You ate " + applecount + "apples.");
        } else { 
            System.out.println("You ate a different ammount");
        }

    }
}
