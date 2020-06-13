package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404
    private Integer code;
    private String message;
    private T      data;
    //可能没有T泛型数据
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}