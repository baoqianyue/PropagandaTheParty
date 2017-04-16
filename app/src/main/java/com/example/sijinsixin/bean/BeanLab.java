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
        Bean bean3 = new Bean();
        bean3.setTitle("3、毛泽东思想的活的灵魂有三个基本方面，即(  )。");
        bean3.setA("A、实事求是 群众路线 独立自主");
        bean3.setB("B、辩证法 唯物论 实事求是");
        bean3.setC("C、实事求是 解放思想 独立自主");
        bean3.setD(null);
        bean3.setAnswer(bean3.getA());
        mBeans.add(bean3);
        Bean bean4 = new Bean();
        bean4.setTitle("4、（）是发展中国特色社会主义的强大动力。");
        bean4.setA("A、解放思想 ");
        bean4.setB("B、改革开放");
        bean4.setC("C、科学发展");
        bean4.setD("D、社会和谐");
        bean4.setAnswer(bean4.getB());
        mBeans.add(bean4);
        Bean bean5 = new Bean();
        bean5.setTitle("5、新时期最鲜明的特点是(  ), 新时期最显著的成就是( ), " +
                "新时期最突出的标志是( )。");
        bean5.setA("A、改革开放，快速发展，与时俱进 ");
        bean5.setB("B、改革开放，与时俱进，快速发展");
        bean5.setC("C、快速发展，与时俱进，改革开放");
        bean5.setD(null);
        bean5.setAnswer(bean5.getA());
        mBeans.add(bean5);
        Bean bean6 = new Bean();
        bean6.setTitle("6、十七大报告指出：(  ) ，关系人心向背和党的生死存亡" +
                "，是党必须始终 抓好的重大政治任务。");
        bean6.setA("A、发扬社会主义民主 ");
        bean6.setB("B、依靠群众");
        bean6.setC("C、坚决惩治和有效预防腐败");
        bean6.setD(null);
        bean6.setAnswer(bean6.getC());
        mBeans.add(bean6);
        Bean bean7 = new Bean();
        bean7.setTitle("7、求和平谋发展促合作成为不可阻挡的时代潮流，当今的时代主题仍然是()");
        bean7.setA("A、经济全球化");
        bean7.setB("B、和平与发展");
        bean7.setC("C、战争与和平");
        bean7.setD(null);
        bean7.setAnswer(bean7.getB());
        mBeans.add(bean7);
        Bean bean8 = new Bean();
        bean8.setTitle("8、在五千多年的发展中，中华民族形成了以（  ）为核心的团结统一、" +
                "爱好和平、勤劳勇敢、自强不息的伟大民族精神。");
        bean8.setA("A、爱国主义");
        bean8.setB("B、集体主义");
        bean8.setC("C、社会主义");
        bean8.setD(null);
        bean8.setAnswer(bean8.getA());
        mBeans.add(bean8);
        Bean bean9 = new Bean();
        bean9.setTitle("9、中国共产党最早的组织是由（ ）等发起，在上海首先建立的。");
        bean9.setA("A．陈独秀");
        bean9.setB("B、瞿秋白");
        bean9.setC("C、李大钊");
        bean9.setD(null);
        bean9.setAnswer(bean9.getA());
        mBeans.add(bean9);
        Bean bean10 = new Bean();
        bean10.setTitle("10、1921年7月23日，中国共产党第一次全国代表大会在上海召开，" +
                "大会最后一天的会议转移到（  ）举行。党的一大宣告了中国共产党的成立。");
        bean10.setA("A、上海崇明");
        bean10.setB("B、嘉兴南湖");
        bean10.setC("C、无锡太湖");
        bean10.setD(null);
        bean10.setAnswer(bean10.getB());
        mBeans.add(bean10);
        Bean bean11 = new Bean();
        bean11.setTitle("11、中共二大的历史贡献是确定了党的（  ）。");
        bean11.setA("A、最高纲领和最低纲领");
        bean11.setB("B、三民主义的政策");
        bean11.setC("C、统一战线的方针政策");
        bean11.setD(null);
        bean11.setAnswer(bean11.getA());
        mBeans.add(bean11);
        Bean bean12 = new Bean();
        bean12.setTitle("12、“中华人民共和国”这个名号是（  ）提出的。");
        bean12.setA("A、张奚若");
        bean12.setB("B、陶行知");
        bean12.setC("C、黄炎培");
        bean12.setD(null);
        bean12.setAnswer(bean12.getA());
        mBeans.add(bean12);
        Bean bean13 = new Bean();
        bean13.setTitle("13、一九一九年五四运动标志着中国(  )的开端。");
        bean13.setA("A、旧民主主义革命");
        bean13.setB("B、新民主主义革命 ");
        bean13.setC("C、社会主义革命");
        bean13.setD(null);
        bean13.setAnswer(bean13.getB());
        mBeans.add(bean13);
        Bean bean14 = new Bean();
        bean14.setTitle("14、党的(  )正式宣告了中国共产党的成立。");
        bean14.setA("A、一大");
        bean14.setB("B、二大");
        bean14.setC("C、三大");
        bean14.setD(null);
        bean14.setAnswer(bean14.getA());
        mBeans.add(bean14);
        Bean bean15 = new Bean();
        bean15.setTitle("15、世界上第一个工人阶级政党是（  ）");
        bean15.setA("A、正义者同盟 ");
        bean15.setB("B、巴黎公社 ");
        bean15.setC("C、共产主义者同盟");
        bean15.setD(null);
        bean15.setAnswer(bean15.getC());
        mBeans.add(bean15);
        Bean bean16 = new Bean();
        bean16.setTitle("16.党员如果没有正当理由，连续几个月不参加" +
                "党的组织生活，或不交纳党费，或不做党所分配的工作，" +
                "就被认为是自行脱党。（）");
        bean16.setA("A.4个月");
        bean16.setB("B.6个月");
        bean16.setC("C.8个月");
        bean16.setD("D.10个月");
        bean16.setAnswer(bean16.getB());
        mBeans.add(bean16);
        Bean bean17 = new Bean();
        bean17.setTitle("17.预备党员的预备期为几年？（）");
        bean17.setA("A.一年");
        bean17.setB("B.两年");
        bean17.setC("C.三年");
        bean17.setD(null);
        bean17.setAnswer(bean17.getA());
        mBeans.add(bean17);
        Bean bean18 = new Bean();
        bean18.setTitle("18、中国共产党的阶级基础是（）");
        bean18.setA("A.农民阶级");
        bean18.setB("B.地主阶级");
        bean18.setC("C.工人阶级");
        bean18.setD("D.资产阶级");
        bean18.setAnswer(bean18.getC());
        mBeans.add(bean18);
        Bean bean19 = new Bean();
        bean19.setTitle("19、发展党员，是党组织建设一项（）" +
                "的工作，也是党内一项十分严肃的政治任务。");
        bean19.setA("A.阶级性");
        bean19.setB("B.不经常");
        bean19.setC("C.经常性");
        bean19.setD("D.严肃性");
        bean19.setAnswer(bean19.getA());
        mBeans.add(bean19);
        Bean bean20 = new Bean();
        bean20.setTitle("20、党章是党内的根本大法，是立党、治党、管党的()");
        bean20.setA("A.总章程");
        bean20.setB("B.基本方针");
        bean20.setC("C.重要内容");
        bean20.setD("D.政治方向");
        bean20.setAnswer(bean20.getA());
        mBeans.add(bean20);
        Bean bean21 = new Bean();
        bean21.setTitle("21、党章体现党的集体利益和意志，具有最大的（B）");
        bean21.setA("A.指导性");
        bean21.setB("B.权威性");
        bean21.setC("C.先进性");
        bean21.setD("D.纯洁性");
        bean21.setAnswer(bean21.getB());
        mBeans.add(bean21);
        Bean bean22 = new Bean();
        bean22.setTitle("22、一九一九年五四运动标志着中国(  )的开端。");
        bean22.setA("A、旧民主主义革命");
        bean22.setB("B、新民主主义革命");
        bean22.setC("B、新民主主义革命");
        bean22.setD(null);
        bean22.setAnswer(bean22.getC());
        mBeans.add(bean22);
        Bean bean23 = new Bean();
        bean23.setTitle("23、党章是制定党内其他规章制定的依据和基础，因而党章具有最高的（）");
        bean23.setA("A.权威性");
        bean23.setB("B.分量");
        bean23.setC("C.法规权利");
        bean23.setD("D.约束力");
        bean23.setAnswer(bean23.getC());
        mBeans.add(bean23);
        Bean bean24 = new Bean();
        bean24.setTitle("24、党的最高理想和最终目标是（）");
        bean24.setA("A.实现共产主义");
        bean24.setB("B.建设社会主义");
        bean24.setC("C.全面建设小康社会");
        bean24.setD("D.共同富裕");
        bean24.setAnswer(bean24.getA());
        mBeans.add(bean24);
        Bean bean25 = new Bean();
        bean25.setTitle("25、中国共产党建立的阶级基础是（  ）");
        bean25.setA("A、马克思主义的广泛传播");
        bean25.setB("B、工人阶级队伍的壮大及工人运动发展");
        bean25.setC("C、共产主义小组建立");
        bean25.setD(null);
        bean25.setAnswer(bean25.getB());
        mBeans.add(bean25);
        Bean bean26 = new Bean();
        bean26.setTitle("26、党员对党的决议和政策有不同意见，（  ）。");
        bean26.setA("A、可以公开发表");
        bean26.setB("B、可以不执行");
        bean26.setC("C、在坚决执行的前提下，可以声明保留");
        bean26.setD(null);
        bean26.setAnswer(bean26.getC());
        mBeans.add(bean26);
        Bean bean27 = new Bean();
        bean27.setTitle("27、党的纪律处分中，最高的是（  ）");
        bean27.setA("A、严重警告");
        bean27.setB("B、撤销党内职务");
        bean27.setC("C、开除党籍");
        bean27.setD(null);
        bean27.setAnswer(bean27.getC());
        mBeans.add(bean27);
        Bean bean28 = new Bean();
        bean28.setTitle("28、“十二五规划”的时间跨度：（）");
        bean28.setA("A.2010-2015 ");
        bean28.setB("B.2010-2014");
        bean28.setC("C.2011-2015");
        bean28.setD("D.2011-2016");
        bean28.setAnswer(bean28.getC());
        mBeans.add(bean28);
        Bean bean29 = new Bean();
        bean29.setTitle("29.“十二五规划”的主题是：（）");
        bean29.setA("A.科学发展");
        bean29.setB("B.改革开放");
        bean29.setC("C.建设“资源节约型、环境友好型”的两型社会");
        bean29.setD("D.科教兴国、人才强国");
        bean29.setAnswer(bean29.getA());
        mBeans.add(bean29);
        Bean bean30 = new Bean();
        bean30.setTitle("30、现任全国人大常委会委员长是（  ）");
        bean30.setA("A、贾庆林");
        bean30.setB("B、习近平");
        bean30.setC("C、吴邦国 ");
        bean30.setD("D、李长春");
        bean30.setAnswer(bean30.getC());
        mBeans.add(bean30);


    }

    public List<Bean> getBeans() {
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
