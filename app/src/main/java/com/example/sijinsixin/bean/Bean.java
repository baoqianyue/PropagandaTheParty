package com.example.sijinsixin.bean;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class Bean implements Serializable {
    private UUID mId;
    private String mTitle;
    private String A;
    private String B;
    private String C;
    private String D;
    private String mAnswer;


    public Bean() {
        mId = UUID.randomUUID();
    }


//    public Bean(int id, String title, String a, String b, String c, String d,
//                String answer) {
//        mId = id;
//        mTitle = title;
//        A = a;
//        B = b;
//        C = c;
//        D = d;
//        mAnswer = answer;
//    }

    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }
}
