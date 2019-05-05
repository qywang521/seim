package com.wzh.seim.util;

import java.util.Iterator;
import java.util.List;

public class UtilTools {
    public static boolean isNullOrEmpty(String instr)
    {
        boolean result=false;
        if(instr==null||instr==""){
            result=true;
        }
        return result;
    }

    public static String listToString(List list){
        StringBuilder sb=new StringBuilder();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            sb.append(next.toString());
        }
        return sb.toString();
    }
}
