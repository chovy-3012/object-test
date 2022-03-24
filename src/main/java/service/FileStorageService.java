package service;

/**
 * 负责和具体存储打交道，比如minio、oss、ceph等。
 * 如果要换存储或者有多种存储，只需要将这个类按照接口重新实现一遍即可。
 */
public interface FileStorageService {

    /**
     * 上传文件，返回存储的文件id
     */
    String uploadFile(byte[] data);

    /**
     *
     * 删除文件、下载文件
     *
     * */
}
