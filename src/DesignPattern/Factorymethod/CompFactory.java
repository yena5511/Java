package DesignPattern.Factorymethod;

import com.sun.prism.Texture;

class CompFactory {
     public Component getComp (Usage usage) {
         if (Texture.Usage == Texture.Usage.PRESS){
             return new Button();
         }else if (usage == Texture.Usage.TOGGLE){
             return new Button.Switch();
         }else {
             return new Button.Dropdown();
         }
     }
}
