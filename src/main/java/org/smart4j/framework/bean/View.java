package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by 28016 on 2017/11/23.
 * 返回视图对象
 */
public class View {

  /**
   * 视图路径
   */
  private String path;

  /**
   * 模型数据
   */
  private Map<String, Object> model;

  public View(String path) {
    this.path = path;
    model = new HashMap<String, Object>();
  }

  public View addModel(String key, Object value) {
    model.put(key, value);
    return this;
  }

  public String getPath() {
    return path;
  }

  public Map<String, Object> getModel() {
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
