package org.smart4j.framework.bean;

import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smart4j.framework.util.CastUtil;

/**
 * Created by 28016 on 2017/11/23.
 * 请求参数对象
 */
public class Param {

  private Map<String, Object> paramMap;

  public Param(Map<String, Object> paramMap) {
    this.paramMap = paramMap;
  }

  /**
   * 根据参数名获取int型参数值
   *
   * @param name
   * @return
   */
  public int getInt(String name) {
    return CastUtil.castInt(paramMap.get(name));
  }

  /**
   * 根据参数名获取long型参数值
   *
   * @param name
   * @return
   */
  public long getLong(String name) {
    return CastUtil.castLong(paramMap.get(name));
  }

  /**
   * 根据参数名获取double型参数值
   *
   * @param name
   * @return
   */
  public double getDouble(String name) {
    return CastUtil.castDouble(paramMap.get(name));
  }

  /**
   * 根据参数名获取boolean型参数值
   *
   * @param name
   * @return
   */
  public boolean getBoolean(String name) {
    return CastUtil.castBoolean(paramMap.get(name));
  }

  /**
   * 根据参数名获取String型参数值
   *
   * @param name
   * @return
   */
  public String getString(String name) {
    return CastUtil.castString(paramMap.get(name));
  }

  /**
   * 获取所有字段信息
   *
   * @return
   */
  public Map<String, Object> getMap() {
    return paramMap;
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
