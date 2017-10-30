package com.bays.utils;

public enum ReturnCode {

    //TODO： 工具类 全局返回信息完善
    SUCCESS_CODE("0000","success"),
    FAILD_CODE("0001","faild"),
    EXCEPTION_CODE("0002","exception"),
    ERROR_CODE("0003","error");


    String respCode;
    String respMsg;
    ReturnCode(String respCode,String respMsg) {
        this.respCode=respCode;
        this.respMsg=respMsg;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}
