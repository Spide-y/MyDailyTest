package com.gdufe.JavaSpringBootTest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class NormalTest {
    public static void main(String[] args) {
//        JSONArray object = JSONArray.parseArray("[{\"rid\":\"70d0cc87-3e07-4102-b961-ef5ab144f61f\",\"cs\":\"{\\\"password\\\":\\\"123456\\\",\\\"idType\\\":\\\"\\\",\\\"mailbox\\\":\\\"36@163.com\\\",\\\"mobilePhone\\\":\\\"15435140427\\\",\\\"accountType\\\":\\\"个人\\\",\\\"loginName\\\":\\\"a36\\\",\\\"userName\\\":\\\"a36\\\",\\\"ZJFJ\\\":[],\\\"WRID\\\":\\\"7aec329b-2141-4530-8616-ad2480141907\\\",\\\"validate\\\":\\\"1\\\"}\",\"tb\":\"{\\\"content-type\\\":\\\"application/json\\\",\\\"user-agent\\\":\\\"PostmanRuntime/7.28.1\\\",\\\"accept\\\":\\\"*/*\\\",\\\"postman-token\\\":\\\"5b3aa279-1920-4bef-9300-38935cd766fe\\\",\\\"host\\\":\\\"172.16.50.73:8801\\\",\\\"accept-encoding\\\":\\\"gzip, deflate, br\\\",\\\"connection\\\":\\\"keep-alive\\\",\\\"content-length\\\":\\\"223\\\",\\\"cookie\\\":\\\"JSESSIONID=6E2785E3762166C8AA74F1E58BB3180A\\\"}\",\"jk\":\"/Login/dchy/public/Register\",\"sj\":\"2021-07-08 11:34:09\",\"zt\":\"0\"}]");
//        JSONObject strObj = (JSONObject) object.get(0);
//        String str = strObj.getString("cs");
//        JSONObject Obj = JSONObject.parseObject(str);
//        System.out.println(Obj.toString());
//        System.out.println(Obj.get("accountType"));
        String s1 = "abcde@GD";
        String s2 = s1.split("@")[0];
        System.out.println(s2);

    }
}
