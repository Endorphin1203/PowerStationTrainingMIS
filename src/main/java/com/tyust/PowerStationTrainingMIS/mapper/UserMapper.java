/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.mapper;

import com.tyust.PowerStationTrainingMIS.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/9
 */
public interface UserMapper {
    User selectLogin(@Param("username") String username, @Param("password") String password);
}
