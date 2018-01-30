import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TmonQ2 {

    public static void main(String... args) {
        System.out.println(countBits(7));
    }

    private static int countBits(int number){
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        int calcNumber = number;

        int mok, nmg; //몫과 나머지 변수
        do {
            mok = calcNumber / 2;
            nmg = calcNumber % 2;
            stack.push(nmg);

            calcNumber = mok;

        } while(mok != 0);

        stack.push(mok);

        int oneCount = 0;
        while(!stack.empty()) {

            int binaryNumber = stack.pop();

            result.add(binaryNumber);
            if (binaryNumber == 1) {
                oneCount += 1;
            }
        }

        StringBuilder resultString = new StringBuilder();
        for (Integer integer : result) {
            resultString.append(integer).append(" ");
        }
        System.out.println("10진 "+number+"를 2진수로 바꾸면 "+resultString+"입니다");

        return oneCount;
    }

}
