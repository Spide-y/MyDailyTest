package com.gdufe.JavaSpringBootTest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdufe.JavaSpringBootTest.Bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {

    List<Course> selectList(@Param("course") Course course);

}
