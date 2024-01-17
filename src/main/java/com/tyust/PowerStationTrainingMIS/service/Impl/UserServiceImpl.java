/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service.Impl;

import com.tyust.PowerStationTrainingMIS.Exception.UserNotFoundException;
import com.tyust.PowerStationTrainingMIS.mapper.UserMapper;
import com.tyust.PowerStationTrainingMIS.pojo.User;
import com.tyust.PowerStationTrainingMIS.service.UserService;
import com.tyust.PowerStationTrainingMIS.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/9
 */
public class UserServiceImpl implements UserService {

    public void login(String username, String password) throws UserNotFoundException {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectLogin(username, password);
        if (user == null) {
            throw new UserNotFoundException("不存在该账号！");
        }
        sqlSession.close();
    }
}
