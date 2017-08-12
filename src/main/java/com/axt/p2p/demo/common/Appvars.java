package com.axt.p2p.demo.common;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by daniel on 12/08/2017.
 */
public class Appvars {
    @Value("${com.axt.website.domain:51anxintou.com}")
    public static String domain;
}
