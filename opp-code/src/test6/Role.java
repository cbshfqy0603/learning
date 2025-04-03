package test6;

import java.util.Random;

public class Role {
    //成员变量
    private String name;
    private int blood;
    private char gender;
    private String face;
    //用于记录长相信息
    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美轮美奂", "沉鱼落雁", "婷婷玉立", "身材姣好", "相貌平平", "相貌粗犷", "不忍直视"};
    //用来记录出招信息
    String[] attack_desc = {
            "%s使用了一招【背心订】，转到对方的身后，一掌向%s的背心的灵台穴拍去",
            "%s使用了一招【游空探爪】，飞起身形自半空为爪锁向%s",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，锤向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s",
            "%s阴手翻起阳收跟进，一招【没遮拦】，结结实实的摔向%s",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻击向%s"
    };
    String[] injures_desc = {
            "结果%s后退半步，毫发无损",
            "结果给%s造成了一处瘀伤",
            "结果一击命中，%s痛的弯下了腰",
            "结果%s痛苦地闷哼了一声，显然受了一点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果【轰的】的一声， %s口中鲜血狂喷而出",
            "结果%s一声惨叫，像瘫软泥一样瘫了下去"
    };
    //空参构造
    public Role() {

    }
    //带参构造
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            //从boyFaces中随机长相
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            //从girlFaces中随机长相
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        }

    }
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attack_desc.length);
        String KunFu = attack_desc[index];
        System.out.printf(KunFu, this.getName(), role.getName());
        System.out.println();
        //Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        //受伤的描述：
        //>90：索引0
        //80 ~ 90：索引1
        //70 ~ 80：索引2
        //50 ~ 70；索引3
        //30 ~ 50：索引4
        //10 ~ 30：索引5
        //0 ~20：索引6
        if (role.getBlood() > 90) {
            System.out.printf(injures_desc[0], role.getName());
        } else if (role.getBlood() > 80 && role.getBlood() <= 90) {
            System.out.printf(injures_desc[1], role.getName());
        } else if (role.getBlood() > 70 && role.getBlood() <= 80) {
            System.out.printf(injures_desc[2], role.getName());
        } else if (role.getBlood() > 50 && role.getBlood() <= 70) {
            System.out.printf(injures_desc[3], role.getName());
        } else if (role.getBlood() > 30 && role.getBlood() <= 50) {
            System.out.printf(injures_desc[4], role.getName());
        } else if (role.getBlood() > 10 && role.getBlood() <= 30) {
            System.out.printf(injures_desc[5], role.getName());
        } else {
            System.out.printf(injures_desc[6], role.getName());
        }
        System.out.println();
//        System.out.println(this.getName() + "使用拳头攻击了" + role.getName() + "一下，" +
//                "造成了" + hurt + "点伤害，" + role.getName() + "还剩" + role.getBlood() + "点血量");
    }
    //用于显示角色信息
    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }
}
