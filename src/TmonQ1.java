import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TmonQ1 {


    private static List<Stack<Integer>> doDo() {
        final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);

        // 이곳 코드에 해당하는 코드를 작성하시요
        List<Stack<Integer>> result = new ArrayList<>();

        int weight = 0;

        Stack<Integer> stack = new Stack<>();
        for (Integer element : elements) {
            if (weight + element <= 20) {
                weight += element;
                stack.push(element);
            }
            else {
                result.add(stack);
                weight = 0;
                weight += element;

                stack = new Stack<>();
                stack.push(element);
            }
        }


        //마지막 스택은 for문 내에서 result에 담을수가 없기 때문에 조건식으로 추가.
        if (!stack.empty()) {
            result.add(stack);
        }

        return result;
    }

    public static void main(String... args) {
        List<Stack<Integer>> stackList = doDo();
        for (Stack<Integer> stack : stackList) {
            for (Integer element : stack) {
                System.out.print(element.toString() +  " ");
            }
            System.out.println();
        }
    }

}
