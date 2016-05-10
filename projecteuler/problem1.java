import java.util.stream.IntStream;

/**
 * Created by sdth on 2016-05-10.
 *
 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */

public class problem1{

    public static void main(String[] args) {

        IntStream result = IntStream.rangeClosed(1,999);
        System.out.println(
                result.filter( i->i%3 == 0 || i%5 == 0 ).sum()
        );

    }

}