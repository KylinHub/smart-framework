package org.smart4j.framework.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 28016 on 2017/11/23.
 * 流操作工具类
 */
public final class StreamUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(StreamUtil.class);

  /**
   * 从输入流中获取字符串
   *
   * @param is
   * @return
   */
  public static String getString(InputStream is) {
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(is));
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line);
      }
    } catch (IOException e) {
      LOGGER.error("get string failure", e);
      throw new RuntimeException(e);
    }
    return sb.toString();
  }

}
