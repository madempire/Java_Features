import java.util.ArrayList;
import java.util.List;

public class Java5Features {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        //1. Enhanced For Loop
        for(int n:numbers){
            System.out.println(n);
        }
        //2. Generics for collections and methods
        
        List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(num);
        print("Hello");
        print(10);
        //3.Enum
        String currentSeason = Season.SPRING.toString();
        System.out.println(currentSeason);

        //4.Autoboxing && unboxing:-
        Integer integer = 5;
        int i = integer;
        System.out.println(i);
    }
    static <T> void print(T data){
        System.out.println(data);
    }

}
