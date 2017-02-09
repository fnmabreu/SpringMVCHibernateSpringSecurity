package org.delta.springmvc.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * Wrapper class for File
 * 
 * Spring provides org.springframework.web.multipart.MultipartFile which is a representation of an uploaded file received 
 * in a multipart request. It provides handy methods like getName(), getContentType(), getBytes(), getInputStream(), etc.. 
 * which make life bit easier while retrieving information about file being uploaded
 *
 */
public class FileBucket {

	MultipartFile file;
    
    String description;
 
    public MultipartFile getFile() {
        return file;
    }
 
    public void setFile(MultipartFile file) {
        this.file = file;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
    
}
