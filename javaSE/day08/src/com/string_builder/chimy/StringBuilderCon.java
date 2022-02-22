package com.string_builder.chimy;

public class StringBuilderCon {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("AAA");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.length());
        System.out.println("append():"+sb2.append("123456789"));
        System.out.println("delete():"+sb2.delete(1,3));
        System.out.println("deleteCharAt():"+sb2.deleteCharAt(1));
        System.out.println("replace():"+sb2.replace(1,4,"b"));
        char[] chars = {'a','b'};
//        System.out.println("insert():"+sb2.insert(1,chars,2,1));

        String s3 = "abc";
        StringBuilder sb3 = new StringBuilder(s3);
        System.out.println(sb3);
    }
}
