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
