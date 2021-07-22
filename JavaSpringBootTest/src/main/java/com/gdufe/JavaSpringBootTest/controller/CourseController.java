package com.gdufe.JavaSpringBootTest.controller;

import com.gdufe.JavaSpringBootTest.Bean.Course;
import com.gdufe.JavaSpringBootTest.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CourseController {

    @Resource
    private CourseService courseService;

    @ApiOperation(value = "获取课程列表")
    @GetMapping("/getCourse")
    public List<Course> getCourseList(){
        return courseService.getCourseList(1,2);
    }

}
