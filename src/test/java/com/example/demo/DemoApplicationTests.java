package com.example.demo;

import com.example.demo.model.MyComparator;
import com.example.demo.model.StudentVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.TreeSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		TreeSet<StudentVo> stu = new TreeSet<StudentVo>(new MyComparator());

		StudentVo s6 = new StudentVo("zhangsan",18);
		StudentVo s2 = new StudentVo("lisi",20);
		StudentVo s3 = new StudentVo("wangwu",17);
		StudentVo s4 = new StudentVo("maliu",23);
		StudentVo s5 = new StudentVo("heiqi",16);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);

		for (StudentVo s : stu){
			System.out.println(s.getName()+"=============="+s.getAge());
		}
	}

}
