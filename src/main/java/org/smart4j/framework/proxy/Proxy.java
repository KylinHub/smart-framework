package org.smart4j.framework.proxy;

/**
 * Created by 28016 on 2017/11/24.
 * 代理接口
 */
public interface Proxy {

  /**
   * 执行链式代理
   *
   * @param proxyChain
   * @return
   * @throws Throwable
   */
  Object doProxy(ProxyChain proxyChain) throws Throwable;

}
