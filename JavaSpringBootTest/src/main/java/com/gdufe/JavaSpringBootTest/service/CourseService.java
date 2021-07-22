package com.gdufe.JavaSpringBootTest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdufe.JavaSpringBootTest.Bean.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CourseService extends IService<Course> {

    List<Course> getCourseList(int pageIndex,int pageSize);

}
