package chap_03;

import javax.swing.*;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        System.out.println(s);
        

        //문자열의 길이
        System.out.println(s.length());
        
        //대소문자 변환
        System.out.println(s.toUpperCase());// 대문자
        System.out.println(s.toLowerCase());//소문지

        //포함관계
        System.out.println(s.contains("Java"));//포함 = ture
        System.out.println(s.contains("c#"));//포함되지 않음 = false-
        System.out.println(s.indexOf("Java"));//위치 졍보 7
        System.out.println(s.indexOf("c#"));//포함되지 않는 다면 -1
        System.out.println(s.indexOf("and"));//처음 일치하는 위치정보
        System.out.println(s.lastIndexOf("and"));//마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I Like"));//이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));//이 문자렬로 끝나면 true
    }
}
