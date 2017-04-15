package com.example.sijinsixin.bean;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class BeanLab {
    private static BeanLab sBeanLab;
    private List<Bean> mBeans;
    public int index1;

    public static BeanLab get(Context context) {
        if (sBeanLab == null) {
            sBeanLab = new BeanLab(context);
        }
        return sBeanLab;
    }

    private BeanLab(Context context) {
        mBeans = new ArrayList<>();
        Bean bean1 = new Bean();
        bean1.setTitle("1、党的十七大，是我们党在（）关键阶段召开的一次十分重要代表大会。");
        bean1.setA("A、改革发展");
        bean1.setB("B、改革调整");
        bean1.setC("C、开放巩固");
        bean1.setD(null);
        bean1.setAnswer(bean1.getA());
        mBeans.add(bean1);
        Bean bean2 = new Bean();
        bean2.setTitle("2、十七大报告指出：必须坚持以人为本。全心全意为人民服务是党的根本宗旨，" +
                " 党的一切奋斗和工作都是为了造福人民。要始终把 最广大人民的根本利 益作为党和" +
                "国家一切工作的出发点和落脚点。（）");
        bean2.setA("A、实现好、保障好、落实好");
        bean2.setB("B、实现好、维护好、发展 好");
        bean2.setC("C、发展好、实施好、保证好");
        bean2.setD(null);
        bean2.setAnswer(bean2.getB());
        mBeans.add(bean2);
    }
    public List<Bean> getBeans(){
        return mBeans;
    }

    public Bean getBean(UUID id) {
        for (Bean bean : mBeans) {
            if (bean.getId().equals(id)) {
                return bean;
            }
        }
        return null;
    }
}
