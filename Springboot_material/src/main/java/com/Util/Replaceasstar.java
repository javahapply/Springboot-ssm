package com.Util;

import org.apache.commons.lang3.StringUtils;

public class Replaceasstar {

	
	/**
     * 如用户身份证号码的打码隐藏加星号加*
     *  参数异常直接返回null
     *
     * @param idCardNum 需要隐藏的字符串
     * @param front     需要显示前几位
     * @param end       需要显示末几位
     * @return 处理完成的身份证
     */
    public static String idMask(String idCardNum, int front, int end) {
        //身份证不能为空
        if (StringUtils.isBlank(idCardNum)) {
            return null;
        }
        //需要截取的长度不能大于身份证号长度
        if ((front + end) > idCardNum.length()) {
            return null;
        }
        //需要截取的不能小于0
        if (front < 0 || end < 0) {
            return null;
        }
        //计算*的数量
        int asteriskCount = idCardNum.length() - (front + end);
        StringBuffer asteriskStr = new StringBuffer();
        for (int i = 0; i < asteriskCount; i++) {
            asteriskStr.append("*");
        }
        String regex = "(\\w{" + String.valueOf(front) + "})(\\w+)(\\w{" + String.valueOf(end) + "})";
        return idCardNum.replaceAll(regex, "$1" + asteriskStr + "$3");
    }
    
    public static void main(String[] args) {
        String idCard =  idMask("421081199809085538",4,3);
        System.out.println(idCard);
    }

}
