package com.test.hashmapsorting;
import java.util.WeakHashMap;
import java.util.Map;

class BigImage {
    // ... large image data and methods ...
    public void finalize() {
        System.out.println("BigImage object garbage collected");
    }
}

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String, BigImage> map = new WeakHashMap<>();
        String key = new String("imageKey1");
        map.put(key, new BigImage());

        System.out.println("Map initially: " + map.size()); // Size is 1
        
        // Remove the strong reference to the key outside the map
        key = null; 

        // Request the garbage collector to run (not guaranteed, but likely in this example)
        System.gc(); 

        // Wait a moment for GC to clean up
        Thread.sleep(1000); 

        System.out.println("Map after GC: " + map.size()); // Size will likely be 0
        // Output might include "BigImage object garbage collected"
    }
}
