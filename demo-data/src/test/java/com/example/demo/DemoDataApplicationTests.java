package com.example.demo;

import com.example.demo.dao.read.custom.AbcDao;
import com.example.demo.dao.read.custom.TestReadDao;
import com.example.demo.dao.write.custom.TestWriteDao;
import com.example.demo.service.TestServerService;
import com.example.demo.service.TestService;
import com.sun.jmx.snmp.tasks.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDataApplicationTests {

	@Autowired
	private TestReadDao testReadDao;
	@Autowired
	private TestWriteDao testWriteDao;
	@Test
	public void contextLoads() {
		ExecutorService executor = Executors.newScheduledThreadPool(10);
		List<Future<?>> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Future<?> future = executor.submit(new Task() {
				@Override
				public void cancel() {

				}

				@Override
				public void run() {
					System.out.println(testReadDao.getSite().getSiteUrl() + "------------@@@@@@@@@@@@@@@@@@@@@@@@@@@" + Thread.currentThread().getId());
					System.out.println(testWriteDao.getSite().getSiteUrl() + "------------##########################" + Thread.currentThread().getId());
				}
			});
			list.add(future);
		}

		for (int i = 0; i < list.size(); i++) {
			try {
				list.get(i).get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

	}

	@Autowired
	private AbcDao abcDao;

	@Test
	public void test() {
		System.out.println(abcDao.getSite().getSiteUrl() + "------------@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	@Autowired
	private TestService testService;

	@Test
	public void test1() {
		System.out.println(testService.getSiteUrl() + "-----------------------------------------");
	}

}
