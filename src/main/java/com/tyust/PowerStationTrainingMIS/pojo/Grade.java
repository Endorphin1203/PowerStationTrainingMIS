/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.pojo;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
public class Grade {
    private Long g_id;
    private String s_name;
    private Long p_id;
    private String p_major;
    private int attend_grade;
    private int test_grade;

    @Override
    public String toString() {
        return "Grade{" +
                "g_id=" + g_id +
                ", s_name='" + s_name + '\'' +
                ", p_id=" + p_id +
                ", p_major='" + p_major + '\'' +
                ", attend_grade=" + attend_grade +
                ", test_grade=" + test_grade +
                '}';
    }

    public Long getG_id() {
        return g_id;
    }

    public void setG_id(Long g_id) {
        this.g_id = g_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Long getP_id() {
        return p_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }

    public String getP_major() {
        return p_major;
    }

    public void setP_major(String p_major) {
        this.p_major = p_major;
    }

    public int getAttend_grade() {
        return attend_grade;
    }

    public void setAttend_grade(int attend_grade) {
        this.attend_grade = attend_grade;
    }

    public int getTest_grade() {
        return test_grade;
    }

    public void setTest_grade(int test_grade) {
        this.test_grade = test_grade;
    }

    public Grade(Long g_id, String s_name, Long p_id, String p_major, int attend_grade, int test_grade) {
        this.g_id = g_id;
        this.s_name = s_name;
        this.p_id = p_id;
        this.p_major = p_major;
        this.attend_grade = attend_grade;
        this.test_grade = test_grade;
    }

    public Grade() {
    }
}
