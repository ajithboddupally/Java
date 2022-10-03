import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequency {

    public static void main(String args[])
    {
        Map<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");


        String str="the cat is in the bag";

        List<String> words= Arrays.asList(str.split(" "));

        for (String word : words) {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }else {
                map.put(word,1);
            }
        }

        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> descSortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> descSortedMap.put(x.getKey(), x.getValue()));

        descSortedMap.forEach((k,v)->{
            System.out.println(v+" "+k);
        });



    }
}