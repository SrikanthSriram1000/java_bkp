package com.test.sb;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Retryable(
        retryFor = { RemoteServiceException.class }, 
        maxAttempts = 3, 
        backoff = @Backoff(delay = 2000, multiplier = 2)
    )
    public String callExternalApi() {
    	int n=1/0;
        // Code that might fail
        return "Success";
    }

    @Recover	
    public String recover(RemoteServiceException e) {
        return "Fallback response: " + e.getMessage();
    }
}
