package com.uniksoft.struts2;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException; 

import com.opensymphony.xwork2.ActionSupport;

public class uploadFile extends ActionSupport{
   private File file;
   private String contentType;
   private String fileName;
   private String destPath;

   public void setUpload(File file) {
       this.file = file;
   }
   
   @Override
   public String execute() throws Exception
   {
      /* Copy file to a safe location */
      destPath = "/home/plasante/Downloads/temp/";

      try{
         System.out.println("get file");
      }catch(Exception e){
         e.printStackTrace();
         return ERROR;
      }

      return SUCCESS;
   }

   public void setUploadContentType(String contentType) {
      this.contentType = contentType;
   }

   public void setUploadFileName(String fileName) {
      this.fileName = fileName;
   }
}