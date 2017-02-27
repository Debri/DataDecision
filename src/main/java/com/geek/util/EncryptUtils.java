package com.geek.util;

/**
 * Created by Liuqi
 * Date: 2016/10/24.
 */


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import java.io.UnsupportedEncodingException;

/**
 * 加密工具类
 */
public class EncryptUtils {
    /**
     * 将数据加密为对称的BASE64
     */
    public static String encodeBase64(String data) {
        String str = null;
        Base64 base64 = new Base64();
        try {
            str = base64.encodeToString(data.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 将BASE64的密文解密
     */
    public static String decodeBase64(String data) {
        String str = null;
        Base64 base64 = new Base64();
        str = new String(base64.decode(data));
        return str;
    }

    /**
     * MD5的加密
     */
    public static String encodeMD5(String data) {
        return DigestUtils.md5Hex(data);
    }

}
