package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class MineTestnMainClass {
public static void main(String[] args) throws InterruptedException {
	MineTesting mineTesting = new MineTesting();
	Thread thread= new Thread(mineTesting);
	mineTesting.start();
	//one way
	thread.start();
	thread.join();
	thread.yield();
	//second way
	ThreadFactory namedThreadFactory = 
			  new ThreadFactoryBuilder().setNameFormat("my-sad-thread-%d").build();
	ExecutorService executorService = Executors.newFixedThreadPool(3);
	for (int i = 0; i < 4; i++) {
		System.out.println(executorService);
		executorService.execute(new MineTesting());
	}
}
}
