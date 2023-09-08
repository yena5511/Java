package DesignPattern.Facade;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Json {
    public Map<String, Object> parse(String str){
        Map<String, Object> result = new HashMap<>();
        result.put("addess", "서울시 개발구 객체동");
        return result;
    }
}
