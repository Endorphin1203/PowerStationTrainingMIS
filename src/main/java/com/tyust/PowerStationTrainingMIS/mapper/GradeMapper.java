/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.mapper;

import com.tyust.PowerStationTrainingMIS.pojo.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public interface GradeMapper {
    List<Grade> selectGrade(@Param("p_id")Long p_id);
    List<Grade> selectByGradeId(@Param("g_id") Long g_id);
    int insertGrade();
    int updateGrade(@Param("g_id") long g_id,@Param("s_name") String s_name,@Param("p_major") String p_major,@Param("attend_grade")int attend_grade,@Param("test_grade") int test_grade);
}
