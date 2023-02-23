package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Find no of times a word/number got repeated
* input : 5,3,4,1,3,7,2,9,9,4
* output: 1-1,2-1,3-2,4-2,5-1,7-1,9-2
*
* input:"Amanda", "Rob", "Rob","Ammanda","Roy"
* output: Amanda-2,Roy-1,Rob-2
* */
public class FindDuplicatesUsingStreams {
    public static void main(String [] args){
        List<Integer> numList = Arrays.asList(5,4,3,1,3,7,2,9,9,4);
        List<String> strList = Arrays.asList("Amanda","Rob","Amanda","Rob","Roy");

        Map<Integer, Long> output = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output.forEach((key,value)->{
            System.out.println(key + "-" + value);
        });

        Map<String, Long> printData = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        printData.forEach((key,value)->{
            System.out.println(key + "-" + value);
        });
    }
}
