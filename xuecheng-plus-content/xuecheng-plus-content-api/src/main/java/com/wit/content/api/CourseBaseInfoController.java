package com.wit.content.api;

import com.wit.base.model.PageParams;
import com.wit.base.model.PageResult;
import com.wit.content.model.dto.QueryCourseParamsDto;
import com.wit.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fangkun
 * @version 1.0
 * @description 课程信息编辑接口
 * @date 2023/4/2 17:27
 */
@Api(value = "课程信息管理接口", tags = "课程信息管理接口")
@RestController// 相当于@controller和responseBody  响应json数据
public class CourseBaseInfoController {

    // pageParams分页参数通过url的key/value传入，queryCourseParams通过json数据传入
    // 使用@RequestBody注解将json转成QueryCourseParamsDto对象
    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){

        //目前是测试代码 后期进行替换
        CourseBase courseBase = new CourseBase();
        courseBase.setName("测试名称");
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> courseBases = new ArrayList();
        courseBases.add(courseBase);
        PageResult pageResult = new PageResult<CourseBase>(courseBases,10,1,10);
        return pageResult;
    }
}
