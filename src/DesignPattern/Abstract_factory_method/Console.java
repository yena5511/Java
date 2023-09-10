package DesignPattern.Abstract_factory_method;

import com.sun.prism.Texture;

class Console {

    private ComFactory lightCompFactory = new LightCompFactory();
    private ComFactory darkCompFactory = new DarkCompFactory();

    Component comp1;
    ComFactory comp2;
    Component comp3;

    void withFactory (){
    comp1 = lightCompFactory.getComp(Texture.Usage.PRESS);
    comp2 = lightCompFactory.getComp(Texture.Usage.TPGGLE);
    comp3 = lightCompFactory.getComp(Texture.Usage.EXPAND);

        // 라이트 버튼 생성
        // 라이트 스위치 생성
        // 라이트 드랍다운 생성

        comp1 = darkCompFactory.getComp(Texture.Usage.PRESS);
        comp2 = darkCompFactory.getComp(Texture.Usage.TOGGLE);
        comp3 = darkCompFactory.getComp(Texture.Usage.EXPAND);

        // 다크 버큰 생성
        // 다크 스위치 생성
        // 다크 드랍다운 생성

    }
}

enum Usage {
    PRESS, TOGGLE, EXPAND
}