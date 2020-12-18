package com.gzgz.learning.service;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @ClassName: WebHtmlCrawer
 * @Description:爬取目标网页源代码示例
 * @Author: pzl
 * @CreateDate: 2020/12/18 15:09
 * @Version: 1.0
 */
public class WebHtmlCrawer {
    public static void main(String[] args) {
        newFile();
    }
    public static String getConnection() {
        String path = "https://www.taobao.com/";
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(path).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            if (conn.getResponseCode() == 200) {
                InputStream xml = conn.getInputStream();
                byte[] data = read(xml);
                //System.out.println(xml);
                return new String(data);
            }else {
                System.out.println("连接失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //读取数据流,转换为字符串
    public static byte[] read(InputStream xml) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = xml.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);

        }
        xml.close();
        return outputStream.toByteArray();
    }
    public static void newFile() {
        String html = getConnection();
        String dir = "D:/javafile/";//定义创建目录位置
        File contents = new File(dir);
        contents.mkdirs();//创建文件目录
        try {
            byte bytes[] = {1, 2, 3, 4};
            File file = new File("D:/javafile/test.txt");
            //判断文件是否存在，如果不存在就创建
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("正在写入.....");
            bw.write(html);
            bw.close();
            System.out.println("录入完毕");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
