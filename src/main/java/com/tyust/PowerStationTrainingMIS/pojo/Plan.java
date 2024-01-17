/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.pojo;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/10
 */
public class Plan {
    private Long id;
    private String p_name;
    private String p_time;
    private String p_major;
    private String P_aim;
    private String p_contain;
    private int p_period;
    private String p_teacher;

    public Plan() {
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                ", p_time='" + p_time + '\'' +
                ", p_major='" + p_major + '\'' +
                ", P_aim='" + P_aim + '\'' +
                ", p_contain='" + p_contain + '\'' +
                ", p_period=" + p_period +
                ", p_teacher='" + p_teacher + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_time() {
        return p_time;
    }

    public void setP_time(String p_time) {
        this.p_time = p_time;
    }

    public String getP_major() {
        return p_major;
    }

    public void setP_major(String p_major) {
        this.p_major = p_major;
    }

    public String getP_aim() {
        return P_aim;
    }

    public void setP_aim(String p_aim) {
        P_aim = p_aim;
    }

    public String getP_contain() {
        return p_contain;
    }

    public void setP_contain(String p_contain) {
        this.p_contain = p_contain;
    }

    public int getP_period() {
        return p_period;
    }

    public void setP_period(int p_period) {
        this.p_period = p_period;
    }

    public String getP_teacher() {
        return p_teacher;
    }

    public void setP_teacher(String p_teacher) {
        this.p_teacher = p_teacher;
    }

    public Plan(Long id, String p_name, String p_time, String p_major, String p_aim, String p_contain, int p_period, String p_teacher) {
        this.id = id;
        this.p_name = p_name;
        this.p_time = p_time;
        this.p_major = p_major;
        P_aim = p_aim;
        this.p_contain = p_contain;
        this.p_period = p_period;
        this.p_teacher = p_teacher;
    }
}
