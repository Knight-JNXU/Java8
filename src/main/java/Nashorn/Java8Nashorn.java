package Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Knight_JXNU on 2016/12/13.
 * java 8 使用 Nashorn取代Rhino（java 6、java 7）的JavaScript引擎
 */
public class Java8Nashorn {
    public static void main(String[] args){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "Runoob";
        Integer result = null;
        try {
            nashorn.eval("print('"+name+"')");
            result = (Integer)nashorn.eval("10+2");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }
}
