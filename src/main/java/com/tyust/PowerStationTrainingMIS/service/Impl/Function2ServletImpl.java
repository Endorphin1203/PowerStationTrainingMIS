/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service.Impl;

import com.tyust.PowerStationTrainingMIS.mapper.GradeMapper;
import com.tyust.PowerStationTrainingMIS.pojo.Grade;
import com.tyust.PowerStationTrainingMIS.service.Function2Service;
import com.tyust.PowerStationTrainingMIS.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public class Function2ServletImpl implements Function2Service {
    @Override
    public List<Grade> selectGrade(Long p_id) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        List<Grade> grades = gradeMapper.selectGrade(p_id);
        sqlSession.close();
        return grades;
    }

    @Override
    public List<Grade> selectByGradeId(Long g_id) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        List<Grade> grades = gradeMapper.selectByGradeId(g_id);
        sqlSession.close();
        return grades;
    }

    @Override
    public void updateGrade(Long g_id, String s_name, String p_major, int attend_grade, int test_grade) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        gradeMapper.updateGrade(g_id,s_name,p_major,attend_grade,test_grade);
        sqlSession.commit();
        sqlSession.close();
    }
}
