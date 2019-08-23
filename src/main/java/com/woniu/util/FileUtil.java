package com.woniu.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	 /**
     * 第一步：判断文件是否为空   true：返回提示为空信息   false：执行第二步
     * 第二步：判断目录是否存在   不存在：创建目录
     * 第三部：通过输出流将文件写入硬盘文件夹并关闭流
     * @param file
     * @return
     */
    public static String uploadFile(MultipartFile file,String path){
    	String newname = UUID.randomUUID().toString();
        String fileName = file.getOriginalFilename();
        int wezhi = fileName.lastIndexOf(".");
        String str = fileName.substring(wezhi);
        newname = newname+str;
        //String filePath = "D:\\img\\";
        File targetFile = new File(path);
        //第一步：判断文件是否为空
        if(file.isEmpty())return null;
        //第二步：判断目录是否存在   不存在：创建目录
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        //第三部：通过输出流将文件写入硬盘文件夹并关闭流
        BufferedOutputStream stream = null;
        try {
            stream = new BufferedOutputStream(new FileOutputStream(path+newname));
            stream.write(file.getBytes());
            stream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (stream != null) stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return newname;
    }


}
