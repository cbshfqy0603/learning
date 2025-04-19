package javadesignpattern;

public class GatekeeperNPC extends NPC {
    @Override
    public void speak() {
        System.out.println("城门官：停！你没有通行证不能进入！");
    }
}
