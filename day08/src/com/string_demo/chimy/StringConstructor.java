package com.string_demo.chimy;

import java.util.Arrays;

public class StringConstructor {
    public static void main(String[] args) {
        String s1 = "abc";

        char[] chars = {'a','b','c'};
        String s2 = new String(chars);

        char value[] = Arrays.copyOf(chars, chars.length);

        byte[] bytes = {97,98,99};
        String s3 = new String(bytes);
        int[] bytes2 = {97,98,99};
        String s32 = new String(bytes);
        System.out.println("s1:" + s1);
        System.out.println("s1.hash:"+s1.hashCode());
        System.out.println("s2:" + s2);
        System.out.println("s2:"+Arrays.copyOf(chars, chars.length));
        System.out.println("s3:"+s3);
        System.out.println("s32:"+s32);


    }


}
