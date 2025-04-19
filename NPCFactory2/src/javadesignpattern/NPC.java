package javadesignpattern;

public abstract class NPC implements Cloneable {
    public abstract void speak();

    @Override
    public NPC clone() {
        try {
            return (NPC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
