package com.dev.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Data permission filter annotation
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {
  /*
   * Alias of department table
   */
  public String deptAlias() default "";

  /*
   * Alias of user table
   */
  public String userAlias() default "";
}
