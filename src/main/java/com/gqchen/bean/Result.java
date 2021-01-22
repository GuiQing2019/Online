package com.gqchen.bean;

import java.util.List;

/**
 * @program: online
 * @description: 返回前端界面类型
 * @author: GuiQingChen
 * @create: 2021-01-15 16:07
 **/
public class Result<T> {
    public Result() {
    }

    public Result(int CODE, String MSG, int COUNT, List<T> DATA) {
        this.CODE = CODE;
        this.MSG = MSG;
        this.COUNT = COUNT;
        this.DATA = DATA;
    }

    private int CODE;    //0成功,1失败
    private String MSG;   //返回成功/失败提示
    private int COUNT;
    private List<T> DATA;  //返回JSON数据

    public int getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }

    public int getCODE() {
        return CODE;
    }

    public void setCODE(int CODE) {
        this.CODE = CODE;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public List<T> getDATA() {
        return DATA;
    }

    public void setDATA(List<T> DATA) {
        this.DATA = DATA;
    }
}
