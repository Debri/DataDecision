package com.geek.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Liuqi
 * Date: 2016/10/24.
 */
public class EncryptUtilsTest {
    @Test
    public void encodeData() throws Exception {
        String string = EncryptUtils.encodeBase64("liuqi");
        System.out.println(string);
        assertEquals("liuqi",EncryptUtils.decodeBase64(string));
    }

    @Test
    public void decodeData() throws Exception {

    }
    @Test
    public void encodeMD5(){
        System.out.println(EncryptUtils.encodeMD5("liuqi"));

    }

}