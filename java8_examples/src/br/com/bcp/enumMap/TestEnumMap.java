package br.com.bcp.enumMap;

import java.util.EnumMap;


public class TestEnumMap {
    public static void main(String args[]) {
        EnumMap<DayOfWeek, String> activityMap = new EnumMap<>(DayOfWeek.class);
        activityMap.put(DayOfWeek.MONDAY, "Soccer");
        activityMap.put(DayOfWeek.TUESDAY, "Basketball");

        
        System.out.println(activityMap.size());
        System.out.println(activityMap.get(DayOfWeek.MONDAY));
        System.out.println(activityMap.get(DayOfWeek.TUESDAY));
    }
}