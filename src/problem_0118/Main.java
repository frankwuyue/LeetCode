package problem_0118;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.generate(5);
        lists.stream().forEach(t -> {
            t.stream().forEach(System.out::println);
        });
    }
}
