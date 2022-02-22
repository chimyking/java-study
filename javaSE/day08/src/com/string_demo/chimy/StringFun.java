package com.string_demo.chimy;

public class StringFun {
    public static void main(String[] args) {
        String ss = "abcdefg ";
        System.out.println("length():" + ss.length());
        System.out.println("isEmpty():" + ss.isEmpty());
        System.out.println("charAt():" + ss.charAt(6));
        System.out.println("codePointAt():" + ss.codePointAt(6));
        System.out.println("codePointBefore():" + ss.codePointBefore(6));
        System.out.println("codePointCount():" + ss.codePointCount(1,5));
        System.out.println("offsetByCodePoints():" + ss.offsetByCodePoints(2,1));
        System.out.println("substring():" + ss.substring(2,5));
        System.out.println("concat():" + ss.concat("2,5"));
        System.out.println("replace():" + ss.replace("ab","AB"));
//        System.out.println("matches():" + ss.matches());
//        System.out.println("replaceFirst():" + ss.replaceFirst());
//        System.out.println("replaceAll():" + ss.replaceAll());
//        System.out.println("contains():" + ss.contains());
//        System.out.println("join():" + ss.join());
//        System.out.println("join():" + ss.join());
        System.out.println("split():" + ss.split("d"));
        System.out.println("toLowerCase():" + ss.toLowerCase());
        System.out.println("toUpperCase():" + ss.toUpperCase());
        System.out.println("trim():" + ss.trim());
        System.out.println("toString():" + ss.toString());
        System.out.println("toCharArray():" + ss.toCharArray().toString());
//        System.out.println("format():" + ss.format());
//        System.out.println("valueOf():" + ss.valueOf());
//        System.out.println("copyValueOf():" + ss.copyValueOf());

        String s2 = "abcdefG";
        System.out.println("equals():" + ss.equals(s2));
        System.out.println("equalsIgnoreCase():" + ss.equalsIgnoreCase(s2));
        System.out.println("compareTo():" + ss.compareTo(s2));
        System.out.println("indexOf():" + ss.indexOf(103));


    }
}
