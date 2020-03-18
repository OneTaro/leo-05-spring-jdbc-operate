package com.spring.jdbc.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Foo
 * @Description
 * @Author wangss
 * @date 2020.03.19 00:31
 * @Version 1.0
 */
@Data
@Builder
public class Foo {
    private Long id;

    private String bar;
}
