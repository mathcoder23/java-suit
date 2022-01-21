package com.pettyfox.utils;


import org.apache.commons.lang3.StringUtils;

/**
 * 文本安全隐藏工具
 *
 * @author Petty Fox
 */
public class SecretTextUtil {
    public static String phone(String phone) {
        if (StringUtils.isNotBlank(phone)) {
            return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
        return phone;
    }

    public static String cardId(String cardId) {
        if (StringUtils.isNotBlank(cardId)) {
            return cardId.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1*****$2");
        }
        return cardId;
    }


    public static String email(String email) {
        if (StringUtils.isNotBlank(email)) {
            return email.replaceAll("(\\w?)(\\w+)(\\w)(@\\w+\\.[a-z]+(\\.[a-z]+)?)", "$1****$3$4");
        }
        return email;
    }
}
