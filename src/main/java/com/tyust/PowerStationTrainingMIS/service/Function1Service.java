/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service;

import com.tyust.PowerStationTrainingMIS.Exception.FailAddException;
import com.tyust.PowerStationTrainingMIS.Exception.FailUpdateException;
import com.tyust.PowerStationTrainingMIS.pojo.Plan;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/10
 */
public interface Function1Service {
     void insertPlan(String p_name,String p_time,String p_major,String p_aim,String p_contain,int p_period,String p_teacher) throws FailAddException;
     List<Plan> selectPlan(String p_time, String p_major, String p_name);
     void updatePlan(Long id, String p_name,  String p_time, String p_major, String p_aim, String p_contain, int p_period,  String p_teacher) throws FailUpdateException;
     void deletePlan(Long id);
}
