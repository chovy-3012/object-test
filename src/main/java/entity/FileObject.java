package entity;

import java.util.Date;

public class FileObject {
    private String fileSystemId;
    private String filename;
    private int version;
    // 文件或者文件夹
    private String type;
    private int size;
    private String path;
    private byte[] data;
    // 存储路径，可以是ceph、本地文件、minio的存储id
    private String storagePath;
    private Date time;


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileSystemId() {
        return fileSystemId;
    }

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
