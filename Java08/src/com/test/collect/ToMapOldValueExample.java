package com.test.collect;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapOldValueExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "dd", "a");

        // Key: Length of string, Value: the string itself
        // If keys are duplicates (e.g., both "bb" and "dd" have length 2), keep the oldValue
        Map<Integer, String> map = list.stream().collect(
            Collectors.toMap(
                String::length,
                s -> s,
                (oldValue, newValue) -> oldValue+""+newValue // Keep the existing value in the map
                //{1=a, 2=bb, 3=ccc}
            )
        );

        System.out.println(map); 
        // Output might be {1=a, 2=bb, 3=ccc} or similar, depending on stream implementation but the 'oldValue' rule is applied for duplicates.
    
    
    }
}
