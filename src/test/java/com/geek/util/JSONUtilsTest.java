package com.geek.util;

import com.geek.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Liuqi
 * Date: 2016/10/24.
 */
public class JSONUtilsTest {
    @Test
    public void toCollection() throws Exception {

    }

    @Test
    public void toObject() throws Exception {
        String str=" {\"name\":\"你好\",\"password\":\"好的\"}";
        User user=JSONUtils.toObject(str, User.class);
        System.out.println(user.getName()+ " --------"+user.getPassword());
    }

    @Test
    public void toJSONString() throws Exception {
        System.out.println(JSONUtils.toJSONString(new User("你好","好的")));

    }

}