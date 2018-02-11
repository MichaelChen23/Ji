package com.mc.ji.common.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http工具类
 * @author MC
 * @date 2017-11-9
 */
public class HttpUtil {

    public static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public static String httpGetByJson(String url) {
        HttpGet httpGet = new HttpGet(url);
        String respContent = null;
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();

            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(20000).setConnectTimeout(20000).build();
            httpGet.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpGet, new BasicHttpContext());

            // 检验返回码
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity he = response.getEntity();
                respContent = EntityUtils.toString(he, "UTF-8");
                logger.info("调用接口url=" + url + ", respContent=" + respContent);
            } else {
                logger.info("调用接口url=" + url + ",返回码statusCode=" + statusCode);
            }
        } catch (Exception e) {
            logger.error("调用接口url=" + url + ",错误: " + e.getMessage());
        } finally {
            if (null != httpGet){
                httpGet.releaseConnection();
            }
        }
        return respContent;
    }


}
