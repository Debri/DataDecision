package com.geek.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
public class JSONUtils {
    private static final ObjectMapper mapper;

    //private  static final String
    static {
        mapper = new ObjectMapper();
        //去掉默认的时间格式
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        //时间设置为东八区
        mapper.setTimeZone(TimeZone.getTimeZone("DMT-8"));
        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        //空值不进行序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //反序列化时属性不存在的兼容处理
        mapper.getDeserializationConfig().withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        //序列化时的时间统一格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //单引号处理
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    }

    /**
     * 将json串反序列化为collection
     */
    public static <T> T toCollection(String json, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(json, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json串反序列化为普通object对象
     */
    public static <T> T toObject(String json, Class<T> tClass) {
        try {

            return mapper.readValue(json, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将Object转化为json字符串并输出到浏览器
     */
    public static <T> void toJSON(T entity, HttpServletResponse response) {
        try {
            String data = mapper.writeValueAsString(entity);
            response.addHeader("Content-Type", "application/json;charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Method", "GET,POST");
            response.getWriter().write(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.getWriter().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将object转化为json字符串并返回
     */
    public static <T> String toJSONString(T entity) {
        try {
            return mapper.writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
