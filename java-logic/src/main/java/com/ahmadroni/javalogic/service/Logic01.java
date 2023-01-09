package com.ahmadroni.javalogic.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Logic01 {
    public Map<Character, Integer> soal01(String param){
        param.replace(" ","");
        char[] params = param.toCharArray();

        Map<Character, Integer> result = new HashMap<>();
        for(char item: params){
            Integer value = result.containsKey(item) ?  result.get(item) + 1 : 1;
            result.put(item, value);
        }
        return result;
    }
}
