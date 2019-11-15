package com.quinn.app.sharp.keygenerate;

/**
 * @author Quinn
 * @date 2018/3/2
 * @package com.quinn.keygenerate
 */
public enum KeyGenerateEnum {
   U("用户id"),P("支付单号");

    private String message;

    KeyGenerateEnum(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
