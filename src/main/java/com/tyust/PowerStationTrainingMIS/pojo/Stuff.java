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
public class Stuff {
    private Long s_id;
    private String s_name;
    private String s_no;
    private char s_sex;
    private String s_birth;
    private Long p_id;
    private String p_major;
    private String post;

    @Override
    public String toString() {
        return "Stuff{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_no='" + s_no + '\'' +
                ", s_sex=" + s_sex +
                ", s_birth='" + s_birth + '\'' +
                ", p_id=" + p_id +
                ", p_major='" + p_major + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_no() {
        return s_no;
    }

    public void setS_no(String s_no) {
        this.s_no = s_no;
    }

    public char getS_sex() {
        return s_sex;
    }

    public void setS_sex(char s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Stuff(Long s_id, String s_name, String s_no, char s_sex, String s_birth, Long p_id, String p_major, String post) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_no = s_no;
        this.s_sex = s_sex;
        this.s_birth = s_birth;
        this.p_id = p_id;
        this.p_major = p_major;
        this.post = post;
    }

    public Stuff() {
    }
}