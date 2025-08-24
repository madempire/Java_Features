import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args) {
        //1. Lambda Expressions
        List<Integer> numList = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> above2List = numList.stream().filter(createPredicate(2)).collect(Collectors.toList());
        System.out.println(above2List);

        //  2. Stream API
        List<Integer> above2List1 = numList.stream().filter((i)-> i>2).collect(Collectors.toList());
        System.out.println(above2List);
        //  3.Functional Programming
        // sorted in reverse order
        numList.stream().sorted((b,c)-> c-b).forEach(System.out::println);
    }
    //1. Lambda Expressions
    public static Predicate<Integer> createPredicate(int value){
        //1. Lambda Expressions
        return i -> i > value;
    }


}
