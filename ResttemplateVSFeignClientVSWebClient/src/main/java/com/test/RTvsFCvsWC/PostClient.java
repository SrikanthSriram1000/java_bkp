package com.test.RTvsFCvsWC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {
    @GetMapping("/posts/{id}")
    String getPostById(@PathVariable("id") int id);
}