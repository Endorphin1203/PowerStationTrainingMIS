/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.Exception;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/9
 */
public class UserNotFoundException extends Exception{
    public UserNotFoundException() {

    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
