# Java_Features
## Java5:-
1. Enhanced For Loopr:- Simplifies iteration over the collections and arrays.
Ex:- for(int num:numbers){
    //Do something
}
2. Generics:- Enables type safety in collections and methods.
Ex:- 
 <T> void methods(T[] numbers) :- method declaration
 List<Integer> numbers = new ArrayList<>(); :- collection declaration.
3. Enums:- Provides a type-safe way to define list of constants.
Ex:-
    enum Season{
        WINTER, SPRING, SUMMER, FALL
    }
4. Autoboxing && Unboxing:- Automatically converts primitives to wrapper classes and Wrapper classes to primitives.
Ex:- 
    Integer integer = 5;
    int i = integer;

## Java7:-
1. Try-With-Resources: Automates resource management in try-catch bolcks.
Ex:- try(BufferedReader br = new BufferedReader(new         FileReader("file.txt"))){

    } catch(Exception e){
    e.pritStackTrace();
    }
2. String in Switch:- Allows String values in switch statements.
Ex:- switch(day){
    case "Monday": // do something;
    case "Friday": // do something;
    default: // do something;
    }
## Java8:-
1. Lambda Expressions:- Allows Writing concise, functional-style code.
Ex:- public Predicate<Integer> createPredicate(int value){
    return integer -> integer > value;
}
2. Stream API:- Provides a powerful way to process collections:-
Ex:-
List<Integer> above2List = numList.stream().filter((i)-> i>2).collect(Collectors.toList());
        System.out.println(above2List);
3. Functional Programming - introduces higher-order functions and immutability.
sort list in reverse order
Ex:- numList.stream().sorted((b,c)-> c-b).forEach(System.out::println);
## Java9:-
1. Modularization:- Splits Jdk into modules for better scalability.
2. Jshell(Repl):- interactive command-line tool for testing java code.
Ex:-  jshell> System.out.println("Hello, Java!");
## Java10:-
1. Local Variable Type Inference(var):- Allows type inference for local variables.
    // Infered as ArrayList<Integer>();
Ex:- var numbers = new ArrayList<String>();
## Java14:- 
1. Switch Expressions :- Enables switch to return values, reducing boilerplate code.
Ex:- String result = switch(day){
    case MONDAY, FRIDAY -> "Weekend is near!";
    default -> "Regular day.";
};
## Java15:-
1. Text blocks :- Simplifies working with multi-line Strings.
    String json = """
    {
        "name":"King",
        "age":30
    }
    """;
<!-- //json ==> "{\n  \"name\": \"John\",\n  \"age\": 30\n}\n" -->
## java 16:-
1. Pattern Matching for instaceOf :- Simplify code making use of instaneOf
    if (obj instanceof string s){
        sout("Message:"+s);
    }
2. Record classes :- provide a compact syntax for immutable data objects.
## Java 17:-
1. Sealed classes :- controlled inheritence of your hierarchies applied for classes and interfaces. 
 sealed class Vehicle permits Car, Truck, Bike {}
 //No further subclassing
 final class Car extends Vehicle {}
 // Can be extended freely
 non-sealed class Truck extends Vehicle {}

 sealed class Bike extends Vehicle permits ElectricBike {}
 // No further subclassing
 final class ElectricBike extends Bike {}
 ## Java21:-
 1. Virtual Threads:- Improves Concurrency with lightWeight Threads.
    Thread.startVirtualThread(()->sout("Hello from virtual thread"));
    // previously java uses platform thread when pt created it also create os thread 1pt needs 1ost so we were able to create only fewer 1ooo of threads can be created but 
    when coming virtual thread it is not directly propotional to ost, ost can have 1000's of vt so jvm can able to create millions of threads
2. Sequenced Collections :- adds operations for ordered collections
    Ex:- 
    interface SequencedCollection<E> extends Collection<E> {
        void addFirst(E element);
        void addLast(E element);
        E getFirst();
        E getLast();
        void removeFirst();
        void removeLast();
        SequencedCollection<E> reverse();
    }
3. Record Patterns:- supports deconstructions, including nested patterns. 
Ex:- record Transaction(String sender,String reciever, double amount){}
    public void processTransaction(Object obj){
        if(obj instanceof Transaction(String sender, String reciever, double amount)){
            sout("processing transaction"+sender+" -> "+reciever+":$"+amount);
        }
    }
4. Pattern Matching for Switch:- More expensive and type-safe switch statements
Ex:- interface CustomerMessage{}
    record TextMessage(String text) implements CustomerMessage{}
    record Ticket(int ticketNumber) implements CustomerMessage {}
    CustomerMessage message = new Ticket(2020);
    String repsonse = Switch(message){
        case TextMessage(String text) -> "processing text message: "+ text;
        case Ticket(int ticketNum) -> "Processing support ticket: #"+ticketNumber;
    };
    sout(response);
## Java22:-
1. Unnamed Variables & Patterns:- Allows ignoring unused variables in code.
    Ex:- switch(obj){ // I will not use the value!
        case String _ -> sout("String");
        case Integer _ -> sout("Integer");
        default -> sout("Unkonwn Type.");
    }
## Java23:-
1. Markdown Documentation Comments:- Enhance Javadoc with Markdown support.

Ex:-     /// This is the **traditional**
        /// *Hello World!* program.

        /// This is the <Strong>traditional</Strong>
        ///<em>Hello World!</em> program.
## Java24:-
1. Stream Gatherers:- Introduces new ways to aggregate stream data.
Ex:-//A new way to group 
    // tranform, and aggregate stream elements
    List<List<Integer>> windows = numbers.stream()
    .gather(Gatherers.windowsFixedSize(3))
    .toList();
    // [1,2,3]
    // [4,5,6]
    // [7,8,9]
    // [10]
