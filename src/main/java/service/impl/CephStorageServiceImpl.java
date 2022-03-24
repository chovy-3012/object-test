package service.impl;

import service.FileStorageService;

public class CephStorageServiceImpl implements FileStorageService {

    @Override
    public String uploadFile(byte[] data) {
        // 调用ceph客户端上传文件
        String storageId = "ttt";
        return storageId;
    }
}
