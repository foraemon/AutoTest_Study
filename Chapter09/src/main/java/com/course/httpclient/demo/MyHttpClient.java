package com.course.httpclient.demo;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro
 * @date 2019/9/5 0005 下午 10:46
 */
public class MyHttpClient {
    CloseableHttpClient httpClient = null;

    @Test
    public void testCase1() {

        try {
            httpClient = HttpClients.createDefault();
            HttpGet get = new HttpGet("http://www.baidu.com");
            HttpResponse response = httpClient.execute(get);
            int ststusCode = response.getStatusLine().getStatusCode();
            System.out.println(ststusCode);
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * 带参数的get方法请求
     */
    @Test
    public void testCase2() {
        try {
            httpClient = HttpClients.createDefault();
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("name", "huhansan"));
            params.add(new BasicNameValuePair("age", "18"));
            String str = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));
            HttpGet httpGet = new HttpGet("http://127.0.0.1:8888/getWithParam?" + str);
            HttpResponse execcte = httpClient.execute(httpGet);
            int statusCode = execcte.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            HttpEntity entity = execcte.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCase3()  {
        try {
            httpClient = HttpClients.createDefault();
            List<NameValuePair> pairs = new ArrayList<>();
            pairs.add(new BasicNameValuePair("uoid","oaM_25TBWDID7-oJh3yGKiyHCze0 "));
            pairs.add(new BasicNameValuePair("uuid","oTTOlv1aRv0oQymBD58AxUXv9KS8"));
            String string = EntityUtils.toString(new UrlEncodedFormEntity(pairs,Consts.UTF_8));
            HttpGet httpGet = new HttpGet("http://ys.yfttech.cn/wechat/api2/activeh?" + string);
            HttpResponse execute = httpClient.execute(httpGet);
            int statusCode = execute.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            HttpEntity entity = execute.getEntity();
            String result = EntityUtils.toString(entity,"utf-8");
            System.out.println(result);
            String[] resultList = result.substring(1,result.length()-1).replaceAll("\"","")
                    .split(",");
            if ("code:200".equals(resultList[0])){
                System.out.println("pass");
            }else {
                System.out.println( resultList[0] +"\n"+ resultList[1]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (httpClient != null){
             try {
                 httpClient.close();
             }catch (IOException e){
                 e.printStackTrace();
             }
            }
        }

    }
}