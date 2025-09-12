package Test;

public class TestDemo1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "巫师3";
    public void ziShow() {
        //如何打印Fu
        System.out.println(super.name);//Fu
        //如何打印Zi
        System.out.println(name);
        System.out.println(this.name);
        //如何打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        //如何打印巫师3
        System.out.println(game);
        System.out.println(this.game);
    }
}
