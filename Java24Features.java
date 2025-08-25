
import java.util.List;
import java.util.stream.Gatherers;

public class Java24Features {
    public static void main(String[] args) {
        // 1. Stream Gatherers
        List<Integer> numList = List.of(1,2,3,4,5,6,7,8,9,10);
        List<List<Integer>> windows = numList.stream().gather(Gatherers.windowFixed(3)).toList();
        for (List<Integer> list : windows) {
            System.out.println(list);
        }
    }
}
