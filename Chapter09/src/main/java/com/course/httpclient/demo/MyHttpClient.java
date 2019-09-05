package com.course.httpclient.demo;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

/**
 * @author zoro
 * @date 2019/9/5 0005 下午 10:46
 */
public class MyHttpClient{
    @Test
    public void testCase1() throws IOException {
        String result;
        HttpGet get =  new HttpGet("http://www.baidu.com");
        HttpClient client = new DefaultHttpClient();
       HttpResponse response = client.execute(get);
       result  = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }

}
