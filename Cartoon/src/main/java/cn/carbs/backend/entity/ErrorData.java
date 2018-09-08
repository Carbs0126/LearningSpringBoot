package cn.carbs.backend.entity;

/**
 * Created by carbs on 2018/9/8.
 */
public class ErrorData {

    public int errorCode;

    public String errorMessage;

    public ErrorData(int errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
