package org.smart4j.framework.helper;

import java.util.Properties;
import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropsUtil;

/**
 * Created by 28016 on 2017/11/21.
 * 属性文件助手类
 */
public final class ConfigHelper {

  private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

  /**
   * 获取JDBC驱动
   *
   * @return
   */
  private static String getJdbcDriver() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
  }

  /**
   * 获取JDBC URL
   *
   * @return
   */
  private static String getJdbcUrl() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
  }

  /**
   * 获取JDBC用户名
   *
   * @return
   */
  private static String getJdbcUsername() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
  }

  /**
   * 获取JDBC密码
   *
   * @return
   */
  private static String getJdbcPassword() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
  }

  /**
   * 获取应用基础包名
   *
   * @return
   */
  private static String getAppBasePackage() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
  }

  /**
   * 获取应用JSP路径
   *
   * @return
   */
  private static String getAppJspPath() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
  }

  /**
   * 获取应用静态资源路径
   *
   * @return
   */
  private static String getAppAssetPath() {
    return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH, "/asset/");
  }
}