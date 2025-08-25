public class Java16Features {
    public static void main(String[] args) {
        // 1. Pattern matching for instaceof 
        Object obj = "Hello";
        if(obj instanceof String s){
            System.out.println(s);
        } else if(obj instanceof Integer i){
            System.out.println(i);
        }
        // 2.Record classes :- acces Person.java
        Person person = new Person("king","mad@gmail.com","000000");
        System.out.println(person.email());
        System.out.println(person.toString());
    }
}
