package javadesignpattern;

public class ThiefNPC extends NPC {
    @Override
    public void speak() {
        System.out.println("窃贼：嘘，小声点，别让人发现！");
    }
}
