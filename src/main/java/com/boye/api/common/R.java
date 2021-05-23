package com.boye.api.common;

/**
 * @author 阿捷
 * @create 2021-04-06 10:38
 * @function controller 万能返回
 */


import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {
    
    public R() {
        this.put((String)"code", 0);
    }

    public R(String code, String msg) {
        this.put((String)"code", code);
        this.put((String)"msg", msg);
    }

    public static com.boye.api.common.R ok() {
        return new com.boye.api.common.R();
    }

    public static com.boye.api.common.R ok(String msg) {
        com.boye.api.common.R r = new com.boye.api.common.R();
        r.put((String)"msg", msg);
        return r;
    }

    public static com.boye.api.common.R ok(Map<String, Object> map) {
        com.boye.api.common.R r = new com.boye.api.common.R();
        r.putAll(map);
        return r;
    }

    public static com.boye.api.common.R fail(String code, String msg) {
        com.boye.api.common.R r = new com.boye.api.common.R(code, msg);
        return r;
    }

    public com.boye.api.common.R puts(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public com.boye.api.common.R data(Object data) {
        return this.puts("data", data);
    }
}
