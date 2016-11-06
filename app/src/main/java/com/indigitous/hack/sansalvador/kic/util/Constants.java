package com.indigitous.hack.sansalvador.kic.util;


public class Constants {

    public static final String APP_LOG = "kic_indigitous_2016";
    public static final String KIC_TOKEN = "user_token";
    public static final String DIGITS_TWITTER = "digits";

    /**
     * Will handle all related to http request via retrofit
     */
    public class Network {

        public static final String API_BASE_URL = "http://192.168.0.109/";

    }

    /**
     * Will handle Web responses
     */
    public class Web {

        public static final int UNAUTHORIZED_RESPONSE_CODE = 401;
        public static final int OK_RESPONSE_CODE = 200;
        public static final int FORBIDDEN_RESPONSE_CODE = 403;

        public static final String LOG = "HTTP";

    }
}
