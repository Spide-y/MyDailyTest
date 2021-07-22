package com.gdufe.JavaSpringBootTest;

import com.gdufe.JavaSpringBootTest.Bean.Course;
import com.gdufe.JavaSpringBootTest.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JavaSpringBootTestApplicationTests {

	@Resource
	private CourseService courseService;

	@Test
	void contextLoads() {
		List<Course> courseList = courseService.getCourseList(0, 4);
		for (Course c:courseList){
			System.out.println(c);
		}
	}

	@Test
	void StringTest(){
		String s1 = "abcde@GD";
		String s2 = s1.split("@")[0];
		System.out.println(s2);
	}

}
