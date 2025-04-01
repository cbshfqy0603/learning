package test6;

import java.util.Random;

public class Role {
    //成员变量
    private String name;
    private int blood;
    //空参构造
    public Role() {

    }
    //带参构造
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = this.blood - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.blood = remainBlood;
        System.out.println(this.getName() + "使用拳头攻击了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩" + role.getBlood() + "点血量");
    }
}
