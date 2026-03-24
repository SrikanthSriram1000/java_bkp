package com.test.RTvsFCvsWC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {

    @Autowired
    private PostClient postClient;

    @GetMapping("/post")
    public String getPost() {
        return postClient.getPostById(1);
    }
}