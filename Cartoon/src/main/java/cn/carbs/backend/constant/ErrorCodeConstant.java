package cn.carbs.backend.constant;

import java.util.HashMap;

/**
 * Created by carbs on 2018/9/8.
 */
public class ErrorCodeConstant {

    public static final int OK = 0;
    public static final int ERROR_NO_RESOURCE = 1;

    public static final HashMap<Integer, String> messages = new HashMap<>();

    static {
        messages.put(OK, "ok");
        messages.put(ERROR_NO_RESOURCE, "no such resource");
    }
}
