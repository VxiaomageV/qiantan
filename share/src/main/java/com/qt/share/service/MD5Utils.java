package com.qt.share.service;

import java.security.MessageDigest;
import java.util.Objects;

/**
 * @description:
 * @author: mal
 * @date: 2020/10/29
 */
public class MD5Utils {

    private MD5Utils() { }

    private static final String ALGORITHM_MD5 = "MD5";

    private static final String UTF_8 = "UTF-8";

    /**
     * MD5 16bit 小写.
     * @param readyEncryptStr ready encrypt string
     * @return String encrypt result string
     * @throws
     * */
    public static String md5Bit16Lower(String readyEncryptStr) throws Exception {
        if (Objects.nonNull(readyEncryptStr)) {
            return MD5Utils.md5Bit32Lower(readyEncryptStr).substring(8, 24);
        } else {
            return null;
        }
    }


    /**
     * MD5 16bit 大写.
     * @param readyEncryptStr ready encrypt string
     * @return String encrypt result string
     * @throws
     * */
    public static String md5Bit16Upper(String readyEncryptStr) throws Exception {
        return md5Bit16Lower(readyEncryptStr).toUpperCase();
    }

    /**
     * MD5 32bit 小写.
     * @param readyEncryptStr ready encrypt string
     * @return String encrypt result string
     * @throws
     * */
    public static String md5Bit32Lower(String readyEncryptStr) throws Exception {
        if (Objects.nonNull(readyEncryptStr)) {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM_MD5);
            md.update(readyEncryptStr.getBytes(UTF_8));
            byte[] b = md.digest();
            StringBuilder su = new StringBuilder();
            for (int offset = 0, bLen = b.length; offset < bLen; offset++) {
                String haxHex = Integer.toHexString(b[offset] & 0xFF);
                if (haxHex.length() < 2) {
                    su.append("0");
                }
                su.append(haxHex);
            }
            return su.toString();
        } else {
            return null;
        }
    }

    /**
     * MD5 32bit 大写.
     * @param readyEncryptStr ready encrypt string
     * @return String encrypt result string
     * @throws
     * */
    public static String md5Bit32Upper(String readyEncryptStr) throws Exception {
        return md5Bit32Lower(readyEncryptStr).toUpperCase();
    }

}
