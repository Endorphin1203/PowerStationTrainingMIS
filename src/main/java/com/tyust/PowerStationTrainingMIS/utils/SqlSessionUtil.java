/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/11/22
 * mybatis工具类
 */
public class SqlSessionUtil {
    //工具类的方法都是私有化的，工具类中的所有的方法都是静态的，直接采用类名即可调用，不需要new对象
    //
    private SqlSessionUtil(){}
    private static SqlSessionFactory sqlsessionFactory;
    static {
        try {
            sqlsessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*创建SqlSession线程，实现事务*/
    /*private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();*/
    //获取会话对象，返回会话对象
    public static SqlSession openSession(){
        /*SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = sqlsessionFactory.openSession();
            local.set(sqlSession);
        }*/
        SqlSession sqlSession = sqlsessionFactory.openSession();
        return sqlSession;
    }

    public static void close(SqlSession sqlSession){
        /*if (sqlSession != null) {
            sqlSession.close();
            local.remove();
        }*/
        sqlSession.close();
    }
}
