package com.gdufe.JavaSpringBootTest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdufe.JavaSpringBootTest.Bean.Course;
import com.gdufe.JavaSpringBootTest.mapper.CourseMapper;
import com.gdufe.JavaSpringBootTest.service.CourseService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper,Course> implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList(int pageIndex, int pageSize) {
        Course course = new Course();
        PageHelper.startPage(pageIndex,pageSize);
        List<Course> courses = courseMapper.selectList(course);
        return courses;
    }
}
