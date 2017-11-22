package org.smart4j.framework.bean;

import java.lang.reflect.Method;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by 28016 on 2017/11/22.
 * 封装Action信息
 */
public class Handler {

  /**
   * Controller类
   */
  private Class<?> controllerClass;

  /**
   * Action方法
   */
  private Method actionMethod;

  public Handler(Class<?> controllerClass, Method actionMethod) {
    this.controllerClass = controllerClass;
    this.actionMethod = actionMethod;
  }

  public Class<?> getControllerClass() {
    return controllerClass;
  }

  public Method getActionMethod() {
    return actionMethod;
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }
}
