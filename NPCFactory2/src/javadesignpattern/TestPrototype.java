package javadesignpattern;

public class TestPrototype {
    public static void main(String[] args) {
        // 从配置文件中读取NPC类型
        String npcType = XMLUtil.getNPCType();

        // 使用原型工厂创建NPC
        NPC npc = NPCPrototypeFactory.createNPC(npcType);
        if (npc != null) {
            npc.speak();
        }
    }
}

