package com.hmdp.dto;

import lombok.Data;

import java.util.List;

// 用于滚动分页返回结果
@Data
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;
}
