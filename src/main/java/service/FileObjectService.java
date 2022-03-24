package service;

import entity.FileObject;

/**
 * 这一层主要是维护文件/文件夹元数据，以及与存储的关系
 * 主要和fileStorageService交互
 */
public interface FileObjectService {

    /**
     * 创建文件
     */
    void createFile(FileObject file);

    /**
     * 获取文件
     */
    FileObject getFileObject(String fileId);

    /**
     * 删除文件、修改文件权限、等
     *
     * */
}
