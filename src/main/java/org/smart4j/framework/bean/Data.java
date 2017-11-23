package org.smart4j.framework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by 28016 on 2017/11/23.
 * 返回数据对象
 */
public class Data {

  /**
   * 模型数据
   */
  private Object model;

  public Data(Object model) {
    this.model = model;
  }

  public Object getModel() {
    return model;
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
