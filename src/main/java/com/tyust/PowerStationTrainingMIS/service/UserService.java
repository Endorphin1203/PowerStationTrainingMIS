/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service;

import com.tyust.PowerStationTrainingMIS.Exception.UserNotFoundException;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/9
 */
public interface UserService {
    /**
     * 验证账号密码是否正确
     * @param username
     * @param password
     */
    void login(String username,String password) throws UserNotFoundException;
}
