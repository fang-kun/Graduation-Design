package com.wit.content;

import com.wit.base.model.PageParams;
import com.wit.base.model.PageResult;
import com.wit.content.model.dto.QueryCourseParamsDto;
import com.wit.content.model.po.CourseBase;
import com.wit.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Fangkun
 * @version 1.0
 * @description 课程信息Service测试类
 * @date 2023/4/3 19:23
 */
@SpringBootTest
public class CourseBaseInfoServiceTests {

    //按照类型注入 从容器中拿到接口代理对象并注入
    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseInfoService(){

        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java");//课程名称查询条件
        courseParamsDto.setAuditStatus("202004");//课程审核状态查询条件
        courseParamsDto.setPublishStatus("203002");//课程发布状态查询条件

        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1L);
        pageParams.setPageSize(2L);

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
        System.out.println(courseBasePageResult);
    }
}
