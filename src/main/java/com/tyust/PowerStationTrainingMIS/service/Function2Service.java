/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service;

import com.tyust.PowerStationTrainingMIS.pojo.Grade;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public interface Function2Service {
    List<Grade> selectGrade(Long p_id);
    List<Grade> selectByGradeId(Long g_id);
    void updateGrade(Long g_id,String s_name,String p_major,int attend_grade,int test_grade);
}
