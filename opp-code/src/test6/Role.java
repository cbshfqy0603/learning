package test6;

import java.util.Random;

public class Role {
    //成员变量
    private String name;
    private int blood;
    private char gender;
    private String face;
    //用于记录长相信息
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美轮美奂", "沉鱼落雁", "婷婷玉立", "身材姣好", "相貌平平", "相貌粗犷", "不忍直视"};
    //用来记录出招信息
    String[] attack_desc = {
            "%s使用了一招【背心订】，转到对方的身后，一掌向%s的背心的灵台穴拍去",
            "%s使用了一招【游空探爪】，飞起身形自半空为爪锁向%s",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，锤向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s",
            "%s阴手翻起阳收跟进，一招【没遮拦】，结结实实的摔向%s",
            "%s上步抢身，招中套招，一招【披挂连环】，连环攻击向%s"
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
            //从boyfaces中随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            //从girlfaces中随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }

    }
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "使用拳头攻击了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩" + role.getBlood() + "点血量");
    }
    //用于显示角色信息
    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }
}
