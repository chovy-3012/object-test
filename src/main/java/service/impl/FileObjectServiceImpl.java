package service.impl;

import entity.FileObject;
import service.FileObjectService;
import service.FileStorageService;

public class FileObjectServiceImpl implements FileObjectService {
    private FileStorageService fileStorageService;

    @Override
    public void createFile(FileObject file) {
        // 1. 保存文件到存储
        String fileId = fileStorageService.uploadFile(file.getData());
        // 2. 文件属性信息保存到数据库
        file.setStoragePath(fileId);
        // 保存元数据到数据库
    }

    @Override
    public FileObject getFileObject(String fileId) {
        return null;
    }
}
