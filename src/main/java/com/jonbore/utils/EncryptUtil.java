package com.jonbore.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author bo.zhou
 * @date 2018/5/20
 */
public class EncryptUtil {

    /**
     * 使用uuid生成数据库id
     *
     * @return 不含连字符的全部字母大写的uuid
     */
    public static String generationID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    /**
     * 对输入字符串加密
     *
     * @param input
     * @return 加密后的32位字符串
     */
    public static String encryptStr(String input){
        BigInteger sha = null;
        byte[] inputData = input.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
        }catch (Exception e){
            e.printStackTrace();
        }
        return sha.toString(32);
    }
}
