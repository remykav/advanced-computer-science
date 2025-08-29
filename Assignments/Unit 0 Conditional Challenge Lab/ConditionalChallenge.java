public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here

        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        boolean isCold = true;
        double temperature = 40;
        if (isCold == true) {
            temperature = temperature - 15;
        } else {
            temperature = temperature + 10;
        }
        System.out.println("The temperature is " + temperature);
        // Part 2: Grade Calculator
        System.out.println("---Grade Calculator---");
        int score = 80;
        if (score > 70) {
            System.out.println("You got " + score + " and Passed");
        } else {
            System.out.println("You got " + score + " and Failed");
        }

        // Part 3: Season Determiner
        System.out.println("---Season Determiner---");
        int temp = 90;
        if (temp > 80) {
            System.out.println(" It is " + temp + " And its summer");
        } else if (temp > 60 && temp < 80) {
            System.out.println(" It is " + temp + " And its spring");
        } else if (temp > 40 && temp < 59) {
            System.out.println(" It is " + temp + " And its fall");
        } else {
            System.out.println(" It is " + temp + " And its winter");
        }

        // Part 4: Number Classifier
        System.out.println("---Number Classifier---");
        int number = 1000;
        if (number < 0) {
            System.out.println(number + " Is Negative");
        } else if (number == 0) {
            System.out.println(number + " Is zero");
        } else if (number > 100) {
            System.out.println(number + " Is large");
        } else if (number < -100) {
            System.out.println(number + "Is Very Negative");
        }

    }
}


