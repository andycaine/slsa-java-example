package com.andycaine.slsa;

import org.apache.commons.codec.digest.DigestUtils;

public class Hash {

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
