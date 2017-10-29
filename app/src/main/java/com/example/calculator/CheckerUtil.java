package com.example.calculator;

/**
 * Created by 贺华 on 2017/10/19.
 */

public class CheckerUtil {
            public boolean check(String inf){
                if(inf.length() == 0){
                    return false;
                }
                char c = inf.charAt(inf.length()-1);
                if(c>='0' && c<='9'){
                    return true;
                }else{
                    return false;
                }
            }
}
