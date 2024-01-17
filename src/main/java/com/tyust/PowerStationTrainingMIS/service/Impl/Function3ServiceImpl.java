/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.service.Impl;

import com.tyust.PowerStationTrainingMIS.mapper.StuffMapper;
import com.tyust.PowerStationTrainingMIS.pojo.Stuff;
import com.tyust.PowerStationTrainingMIS.service.Function3Service;
import com.tyust.PowerStationTrainingMIS.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public class Function3ServiceImpl implements Function3Service {
    @Override
    public void insertStuff(String s_name, String s_no, char s_sex, String s_birth, Long p_id, String p_major, String post) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StuffMapper stuffMapper = sqlSession.getMapper(StuffMapper.class);
        int count = stuffMapper.addStuff(s_name, s_no, s_sex, s_birth, p_id, p_major, post);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteStuff(Long s_id) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StuffMapper stuffMapper = sqlSession.getMapper(StuffMapper.class);
        int count = stuffMapper.deleteStuff(s_id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateStuff(Long s_id, String s_name, String s_no, char s_sex, String s_birth, Long p_id, String p_major, String post) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StuffMapper stuffMapper = sqlSession.getMapper(StuffMapper.class);
        int count = stuffMapper.updateStuff(s_id,s_name,s_no,s_sex,s_birth,p_id,p_major,post);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Stuff> selectStuff(String s_no, String p_major, String s_name) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StuffMapper stuffMapper = sqlSession.getMapper(StuffMapper.class);
        List<Stuff> stuffs = stuffMapper.selectStuff(s_no, p_major, s_name);
        sqlSession.close();
        return stuffs;
    }
}
