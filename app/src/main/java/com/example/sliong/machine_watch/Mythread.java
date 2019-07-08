package com.example.sliong.machine_watch;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Mythread extends Thread {
    private static final String DeviceID="532594608";
   private static final String ApiKey ="wqUEXXvwhzjnZxvSdd=Icb87GRw=";
   // private static final String DeviceID = "31575086";
 //  private static final String ApiKey = "8wg10RuXXFMVboeeTnxHd8X25pE=";
    private static final String Soil = "soil";

    public String Gettemp(String temp) {  //获取数据流zzz的数据，返回zzz的当前值，默认是数值型
        String respon = "";
        try {
            URL url = new URL("http://api.heclouds.com/devices/" + DeviceID + "/datastreams/"+temp);//1创建一个URL对象，并传入目标网络地址
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();      //2然后用openConnection方法
            conn.setConnectTimeout(15 * 1000);   //设置连接超时的时间
            conn.setRequestMethod("GET");      //3HTTP请求的方法是GET
            conn.setRequestProperty("api-key", ApiKey); //4消息头
            if (conn.getResponseCode() == 200) {  //返回码是200，网络正常
                InputStream is = conn.getInputStream();            //读取获得的输入流
                ByteArrayOutputStream os = new ByteArrayOutputStream();//字节数组输出流在内存中创建一个字节数组缓冲区，
                int len = 0;                                          //所有发送到输出流的数据保存在该字节数组缓冲区中。
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {        // // 将内容读到buffer中，读到末尾为-1
                    os.write(buffer, 0, len);
                }
                is.close();//关闭
                os.close();
                JSONObject root = new JSONObject(os.toString());   //将缓冲区的内容转换为字符串，然后字符串构建JSON对象
                respon = root.getJSONObject("data").getString("current_value");
                Log.e("返回数据",""+root);
            }else {
                //返回码不是200，网络异常
            }
        }  catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return respon;
    }

    public String Gethumi(String humi) {  //获取数据流zzz的数据，返回zzz的当前值，默认是数值型
        String respon = "";
        try {
            URL url = new URL("http://api.heclouds.com/devices/" + DeviceID + "/datastreams/"+humi);//1创建一个URL对象，并传入目标网络地址
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();      //2然后用openConnection方法
            conn.setConnectTimeout(15 * 1000);   //设置连接超时的时间
            conn.setRequestMethod("GET");      //3HTTP请求的方法是GET
            conn.setRequestProperty("api-key", ApiKey); //4消息头
            if (conn.getResponseCode() == 200) {  //返回码是200，网络正常
                InputStream is = conn.getInputStream();            //读取获得的输入流
                ByteArrayOutputStream os = new ByteArrayOutputStream();//字节数组输出流在内存中创建一个字节数组缓冲区，
                int len = 0;                                          //所有发送到输出流的数据保存在该字节数组缓冲区中。
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {        // // 将内容读到buffer中，读到末尾为-1
                    os.write(buffer, 0, len);
                }
                is.close();//关闭
                os.close();
                JSONObject root = new JSONObject(os.toString());   //将缓冲区的内容转换为字符串，然后字符串构建JSON对象
                respon = root.getJSONObject("data").getString("current_value");
                Log.e("返回数据",""+root);
            }else {
                //返回码不是200，网络异常
            }
        }  catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return respon;
    }
    public String Getfire(String fire) {  //获取数据流zzz的数据，返回zzz的当前值，默认是数值型
        String respon = "";
        try {
            URL url = new URL("http://api.heclouds.com/devices/" + DeviceID + "/datastreams/"+fire);//1创建一个URL对象，并传入目标网络地址
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();      //2然后用openConnection方法
            conn.setConnectTimeout(15 * 1000);   //设置连接超时的时间
            conn.setRequestMethod("GET");      //3HTTP请求的方法是GET
            conn.setRequestProperty("api-key", ApiKey); //4消息头
            if (conn.getResponseCode() == 200) {  //返回码是200，网络正常
                InputStream is = conn.getInputStream();            //读取获得的输入流
                ByteArrayOutputStream os = new ByteArrayOutputStream();//字节数组输出流在内存中创建一个字节数组缓冲区，
                int len = 0;                                          //所有发送到输出流的数据保存在该字节数组缓冲区中。
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {        // // 将内容读到buffer中，读到末尾为-1
                    os.write(buffer, 0, len);
                }
                is.close();//关闭
                os.close();
                JSONObject root = new JSONObject(os.toString());   //将缓冲区的内容转换为字符串，然后字符串构建JSON对象
                respon = root.getJSONObject("data").getString("current_value");
                Log.e("返回数据",""+root);
            }else {
                //返回码不是200，网络异常
            }
        }  catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return respon;
    }
    public String Getfan(String fan) {  //获取数据流zzz的数据，返回zzz的当前值，默认是数值型
        String respon = "";
        try {
            URL url = new URL("http://api.heclouds.com/devices/" + DeviceID + "/datastreams/"+fan);//1创建一个URL对象，并传入目标网络地址
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();      //2然后用openConnection方法
            conn.setConnectTimeout(15 * 1000);   //设置连接超时的时间
            conn.setRequestMethod("GET");      //3HTTP请求的方法是GET
            conn.setRequestProperty("api-key", ApiKey); //4消息头
            if (conn.getResponseCode() == 200) {  //返回码是200，网络正常
                InputStream is = conn.getInputStream();            //读取获得的输入流
                ByteArrayOutputStream os = new ByteArrayOutputStream();//字节数组输出流在内存中创建一个字节数组缓冲区，
                int len = 0;                                          //所有发送到输出流的数据保存在该字节数组缓冲区中。
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {        // // 将内容读到buffer中，读到末尾为-1
                    os.write(buffer, 0, len);
                }
                is.close();//关闭
                os.close();
                JSONObject root = new JSONObject(os.toString());   //将缓冲区的内容转换为字符串，然后字符串构建JSON对象
                respon = root.getJSONObject("data").getString("current_value");
                Log.e("返回数据",""+root);
            }else {
                //返回码不是200，网络异常
            }
        }  catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return respon;
    }
    public String Getbeep(String beep) {  //获取数据流zzz的数据，返回zzz的当前值，默认是数值型
        String respon = "";
        try {
            URL url = new URL("http://api.heclouds.com/devices/" + DeviceID + "/datastreams/"+beep);//1创建一个URL对象，并传入目标网络地址
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();      //2然后用openConnection方法
            conn.setConnectTimeout(15 * 1000);   //设置连接超时的时间
            conn.setRequestMethod("GET");      //3HTTP请求的方法是GET
            conn.setRequestProperty("api-key", ApiKey); //4消息头
            if (conn.getResponseCode() == 200) {  //返回码是200，网络正常
                InputStream is = conn.getInputStream();            //读取获得的输入流
                ByteArrayOutputStream os = new ByteArrayOutputStream();//字节数组输出流在内存中创建一个字节数组缓冲区，
                int len = 0;                                          //所有发送到输出流的数据保存在该字节数组缓冲区中。
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {        // // 将内容读到buffer中，读到末尾为-1
                    os.write(buffer, 0, len);
                }
                is.close();//关闭
                os.close();
                JSONObject root = new JSONObject(os.toString());   //将缓冲区的内容转换为字符串，然后字符串构建JSON对象
                respon = root.getJSONObject("data").getString("current_value");
                Log.e("返回数据",""+root);
            }else {
                //返回码不是200，网络异常
            }
        }  catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return respon;
    }
    public void postcmd (String cmd)
    {
        byte[] data = cmd.getBytes();
        try
        {
            URL url=new URL("http://api.heclouds.com/cmds?device_id=38508878&qos=1&timeout=300&type=0");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(15 * 1000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("api-key", ApiKey);
            conn.setRequestProperty("Content-Length", String.valueOf(data.length));
            conn.setChunkedStreamingMode(5);
            conn.connect();
            OutputStream outStream = conn.getOutputStream();
            outStream.write(data);
            outStream.flush();
            outStream.close();
            if (conn.getResponseCode() == 200) {
                InputStream is = conn.getInputStream();
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                int len = 0;
                byte buffer[] = new byte[1024];
                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }
                is.close();
                os.close();
               // respon = os.toString();
                //正常则返回{"errno":0,"error":"succ"}，此函数为void，用不上这个
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
}
