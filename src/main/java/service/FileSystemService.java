package service;

import entity.FileObject;
import entity.FileSystem;

/**
 * 这一层主要是用户空间的信息，用户空间和用户接口直接交互
 * <p>
 * 主要和fileobjectservice的交互
 */
public interface FileSystemService {

    /**
     * 获取用户存储空间
     */
    FileSystem getFileSystem(String userId);

    /**
     * 上传文件
     * userId:用户id
     * path:路径
     * data：数据内容
     */
    FileObject upload(String userId, String path, byte[] data);


    /**
     * 只需要修改文件属性信息即可
     */
    FileObject rename(String userId, String fileId, String newname);

    /**
     *
     * 设备配额、下载文件、重命名文件等等
     *
     * */
}
