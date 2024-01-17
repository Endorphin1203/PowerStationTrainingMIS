/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service;

import com.tyust.PowerStationTrainingMIS.pojo.Stuff;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public interface Function3Service {
    void insertStuff(String s_name,String s_no,char s_sex,String s_birth,Long p_id,String p_major,String post);
    void deleteStuff(Long s_id);
    void updateStuff(Long s_id,String s_name,String s_no,char s_sex,String s_birth,Long p_id,String p_major,String post);
    List<Stuff> selectStuff(String s_no, String p_major, String s_name);
}
