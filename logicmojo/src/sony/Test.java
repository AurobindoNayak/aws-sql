package sony;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String s = "this this is is done by Saket Saket";
        List<String> l = Arrays.asList(s.split(" "));
        System.out.println(l);
        Map<String,Long> map = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
