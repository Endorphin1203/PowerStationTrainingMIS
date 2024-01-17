/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.mapper;

import com.tyust.PowerStationTrainingMIS.pojo.Stuff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public interface StuffMapper {
    int addStuff(@Param("s_name") String s_name, @Param("s_no") String s_no,@Param("s_sex") char s_sex,@Param("s_birth") String s_birth,@Param("p_id") Long p_id,@Param("p_major") String p_major,@Param("post") String post);
    int updateStuff(@Param("s_id") Long s_id,@Param("s_name") String s_name, @Param("s_no") String s_no,@Param("s_sex") char s_sex,@Param("s_birth") String s_birth,@Param("p_id") Long p_id,@Param("p_major") String p_major,@Param("post") String post);
    List<Stuff> selectStuff(@Param("s_no") String s_no,@Param("p_major") String p_major,@Param("s_name") String s_name);
    int deleteStuff(@Param("s_id") Long s_id);
}
