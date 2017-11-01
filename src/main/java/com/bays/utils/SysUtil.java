package com.bays.utils;

import java.util.UUID;

/**
 * Created by yinpeng on 2017/11/1.
 */
public class SysUtil {


    public static final String heng = "-";
    /**
     * 产生随机UUID可充当ID 或者验证信息来使用
     * @return
     */
    public static String randomUUID(){
        String uid = UUID.randomUUID().toString();
        return uid.replaceAll(SysUtil.heng,"");
    }
    public static String strUUID(String str){
        String uid = UUID.nameUUIDFromBytes(str.getBytes()).toString();
        return uid.replaceAll(SysUtil.heng,"");
    }

}