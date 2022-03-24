package service.impl;

import entity.FileObject;
import entity.FileSystem;
import service.FileObjectService;
import service.FileSystemService;

public class FileSystemServiceImpl implements FileSystemService {
    private FileObjectService fileObjectService;

    @Override
    public FileSystem getFileSystem(String userId) {
        return null;
    }

    @Override
    public FileObject upload(String userId, String path, byte[] data) {
        FileSystem fileSystem = getFileSystem(userId);

        FileObject fileObject = new FileObject();
        fileObject.setFileSystemId(fileSystem.getId());
        fileObject.setData(data);
        fileObject.setPath(path);
        fileObjectService.createFile(fileObject);
        return null;
    }

    @Override
    public FileObject rename(String userId, String fileId, String newname) {
        FileSystem fileSystem = getFileSystem(userId);

        FileObject fileObject = fileObjectService.getFileObject(fileId);
        fileObject.setFilename(newname);
        // TODO 保存元数据到数据
        return fileObject;
    }

    @Override
    public void rollBack(String userId, String fileId, int version) {
        fileObjectService.rollBack(fileId, version);
    }

}
