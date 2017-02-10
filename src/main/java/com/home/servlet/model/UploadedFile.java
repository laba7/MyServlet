package com.home.servlet.model;

import javax.persistence.*;

/**
 * Created by java on 20.08.2016.
 */
@Entity
@Table(name = "UPLOADED_FILES")
public class UploadedFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FILE_NAME", unique = true)
    private String fileName;
    @Column(name = "FILE_PATH")
    private String filePath;
    @Lob
    @Column(name = "DATA", columnDefinition = "MEDIUMBLOB")
    private byte[] data;

    public UploadedFile() {
    }

    public UploadedFile(String fileName, String filePath, byte[] data) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
