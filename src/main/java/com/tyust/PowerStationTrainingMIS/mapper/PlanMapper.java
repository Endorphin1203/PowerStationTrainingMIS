/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.mapper;

import com.tyust.PowerStationTrainingMIS.pojo.Plan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/10
 */
public interface PlanMapper {
    int addPlan(@Param("p_name") String p_name,@Param("p_time") String p_time, @Param("p_major") String p_major, @Param("p_aim") String p_aim, @Param("p_contain") String p_contain, @Param("p_period") int p_period, @Param("p_teacher") String p_teacher);
    List<Plan> selectPlan(@Param("p_time") String p_time,@Param("p_major") String p_major,@Param("p_name") String p_name);
    int updatePlan(@Param("id") Long id,@Param("p_name") String p_name,@Param("p_time") String p_time, @Param("p_major") String p_major, @Param("p_aim") String p_aim, @Param("p_contain") String p_contain, @Param("p_period") int p_period, @Param("p_teacher") String p_teacher);
    int deletePlan(@Param("id") Long id);
}
