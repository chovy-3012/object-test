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

    @Override
    public FileObject getFileObjectWithVersion(String fileId, int verson) {
        // TODO 获取文件历史版本元信息和数据
        return null;
    }

    @Override
    public void rollBack(String fileId, int version) {
        FileObject versionFile = getFileObjectWithVersion(fileId, version);
        FileObject fileObject = getFileObject(fileId);
        // TODO 将最新文件元信息替换为老版本文件信息,存储不用栋
    }
}
