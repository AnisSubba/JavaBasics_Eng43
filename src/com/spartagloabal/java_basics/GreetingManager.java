package com.spartagloabal.java_basics;

public class GreetingManager {
//member variables, variable stated (public or private)
    private String greeting;
//    public void printGreeting(){
//        String greeting = "hello";
//        System.out.println(greeting);
//        //method will look what is in method first then object
//    }
    //adding constructor which is similar to the class, it is a definition of the class
    public GreetingManager(String greetingMessage){
        this.greeting = greetingMessage;
    }

    //Getter and Setter
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getOverlyHappyGreeting(){
        return this.greeting + " o m g, life is good all the time.";
    }

    public String getAngryGreeting(){
        return this.greeting + " .... WHAT BRU";
    }

//    public int add(int num1, int num2){
//        return num1 + num2;
//    }
}
