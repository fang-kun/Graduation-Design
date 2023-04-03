package com.wit.content.service;

import com.wit.base.model.PageParams;
import com.wit.base.model.PageResult;
import com.wit.content.model.dto.QueryCourseParamsDto;
import com.wit.content.model.po.CourseBase;

/**
 * @author Fangkun
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2023/4/3 23:34
 */
public interface CourseBaseInfoService {

    /**
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 查询条件
     * @return com.wit.base.model.PageResult<com.wit.content.model.po.CourseBase>
     * @author Fangkun
     * @date 2023/4/3 23:34
     **/
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
