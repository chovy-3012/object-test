package controller;

import entity.FileObject;
import service.FileSystemService;

public class FileSystemController {
    private FileSystemService fileSystemService;

    /**
     * 上传文件接口
     */
    public FileObject upload(String userId, String path, byte[] data) {
        return fileSystemService.upload(userId, path, data);
    }

    /**
     * 重命名文件
     */
    public FileObject rename(String userId, String fileId, String newname) {
        return fileSystemService.rename(userId, fileId, newname);
    }
}
