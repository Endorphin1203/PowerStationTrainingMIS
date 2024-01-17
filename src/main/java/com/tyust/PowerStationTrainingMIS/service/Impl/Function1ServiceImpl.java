/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyust.PowerStationTrainingMIS.Exception.FailAddException;
import com.tyust.PowerStationTrainingMIS.Exception.FailUpdateException;
import com.tyust.PowerStationTrainingMIS.mapper.PlanMapper;
import com.tyust.PowerStationTrainingMIS.pojo.Plan;
import com.tyust.PowerStationTrainingMIS.service.Function1Service;
import com.tyust.PowerStationTrainingMIS.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/10
 */
public class Function1ServiceImpl implements Function1Service {

    public void insertPlan(String p_name, String p_time, String p_major, String p_aim, String p_contain, int p_period, String p_teacher) throws FailAddException {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        PlanMapper planMapper = sqlSession.getMapper(PlanMapper.class);
        int count = planMapper.addPlan(p_name, p_time, p_major, p_aim, p_contain, p_period, p_teacher);
        if (count == 0) {
            throw new FailAddException("添加失败");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    public List<Plan> selectPlan(String p_time, String p_major, String p_name) {
        /*ObjectMapper objectMapper = new ObjectMapper();*/
        SqlSession sqlSession = SqlSessionUtil.openSession();
        PlanMapper planMapper = sqlSession.getMapper(PlanMapper.class);
        List<Plan> plans = planMapper.selectPlan(p_time, p_major, p_name);
        sqlSession.close();
        return plans;
    }

    public void updatePlan(Long id, String p_name,  String p_time, String p_major, String p_aim, String p_contain, int p_period,  String p_teacher) throws FailUpdateException {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        PlanMapper planMapper = sqlSession.getMapper(PlanMapper.class);
        int count = planMapper.updatePlan(id, p_name, p_time, p_major, p_aim, p_contain, p_period, p_teacher);
        if (count == 0){
            throw new FailUpdateException("更新失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deletePlan(Long id) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        PlanMapper planMapper = sqlSession.getMapper(PlanMapper.class);
        int count = planMapper.deletePlan(id);
        sqlSession.commit();
        sqlSession.close();
    }
}
