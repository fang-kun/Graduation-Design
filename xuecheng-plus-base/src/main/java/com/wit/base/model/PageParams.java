package com.wit.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author fangkun
 * @version 1.0
 * @description 分页查询通用参数
 * @date 2023/4/2 1:51
 */
@Data
@ToString
public class PageParams {

    //当前页码 long型对标数据库表
    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;

    //每页记录数默认值
    @ApiModelProperty("每页记录数默认值")
    private Long pageSize =10L;

    public PageParams(){

    }

    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }



}
