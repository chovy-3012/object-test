package service;

import entity.User;

/**
 * 负责用户登录、信息等
 * */
public interface UserService {

    /**
     * 登录
     */
    void login(String username, String password);

    /**
     * 注册
     */
    void register(User user);

    /**
     * 获取用户信息
     */
    User getUserInfo(String userId);

    /**
     * 删除用户
     * */

    /**
     * 用户修改信息
     *
     * */
}
