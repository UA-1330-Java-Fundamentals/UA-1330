package com.softserve.edu16lambda;

public class MyGreetingService {

    interface GreetingService {
        void sayMessage(String message);

    }

    public static void main(String args[]) {
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        GreetingService greetService2 = (message) ->
                System.out.println("Hello from second service " + message);

        greetService1.sayMessage("Alice");
        greetService2.sayMessage("Bob");
    }

}
