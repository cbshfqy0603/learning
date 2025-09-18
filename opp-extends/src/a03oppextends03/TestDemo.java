package a03oppextends03;
/*
利用方法的重写设计继承结构
现在有三种动物：哈士奇、沙皮狗、中华田园犬
暂时不考虑属性，只要考虑行为。
请按照继承的思想特点进行继承体系的设计。
三种动物分别有以下的行为：
哈士奇：吃饭（吃狗粮）、喝水、看家、拆家
沙皮狗：吃饭（吃狗粮、吃骨头）、喝水、看家
中华田园犬：吃饭（吃剩饭）、喝水、看家
 */
public class TestDemo {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();
        TianYuan t = new TianYuan();
        t.eat();
        t.drink();
        t.lookHome();
    }
}

class NewDog {
    public void eat() {
        System.out.println("吃狗粮");
    }
    public void drink() {
        System.out.println("喝水");
    }
    public void lookHome() {
        System.out.println("看家");
    }
}

class Husky extends NewDog {
    public void breakHome() {
        System.out.println("拆家");
    }
}

class SharPei extends NewDog {
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}

class TianYuan extends NewDog {
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
