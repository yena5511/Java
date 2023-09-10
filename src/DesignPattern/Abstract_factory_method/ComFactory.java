package DesignPattern.Abstract_factory_method;

import com.sun.prism.Texture;

interface ComFactory {
     public Component getComp (Texture.Usage usage);
}

//라이트 테마 공장
class LightCompFactory implements ComFactory{

    @Override
    public Component getComp (Texture.Usage usage){
        if (usage == Texture.Usage.PRESS){
            return new LightButton();
        } else if (usage == Texture.Usage.TOGGLE){
            return new LightSwitch();
        } else {
            return new LightDropdown();
        }
    }
}

// 다크 테마 공장

class DarkCompFactory implements ComFactory{

    @Override
    public Component getComp (Texture.Usage usage){
        if (usage == Texture.Usage.PRESS){
            return new DarkButton();
         } else if (usage == Texture.Usage.TOGGLE){
            return new DarkSwitch();
        } else {
            return new DarkDropdown();
        }
    }
}