package com.gdy.roy.spring.boot.annotation;

import java.lang.annotation.*;

/**
 * Created by apple on 2019/6/30.
 *
 * 是否开启 roy starter
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableRoyConfiguration {
}
