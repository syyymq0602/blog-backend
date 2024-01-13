package org.kooguy.work.model.rest;

import lombok.ToString;
import org.kooguy.work.model.spi.error.ErrorCode;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@ToString
public class ApiResult implements Serializable {

    private static final long serialVersionUID = 1L;


    private static final String SUCCESS = "success";

    private static final String CODE = "code";

    private static final String MESSAGE = "message";

    private static final String TIMESTAMP = "timestamp";

    private static final String RESULT = "result";

    private static final String DEFAULT_ERROR_DATA = "err";

    private static final String DEFAULT_SUCCESS_DATA = "ok";

    private static final String LOGIC_CODE = "logiccode";

    /**
     * 消息头meta 存放状态信息       L code message
     */
    private Map<String, Object> meta = new HashMap<String, Object>();
    /**
     * 消息内容  存储实体交互数据
     */
    private Map<String, Object> data = new HashMap<String, Object>();


    public Map<String, Object> getMeta() {
        return meta;
    }

    public ApiResult setMeta(Map<String, Object> meta) {
        this.meta = meta;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public ApiResult setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public ApiResult addMeta(String key, Object object) {
        this.meta.put(key, object);
        return this;
    }

    public ApiResult addData(String key, Object object) {
        this.data.put(key, object);
        return this;
    }

    public ApiResult success(int statusCode, String statusMsg) {
        this.addMeta(SUCCESS, Boolean.TRUE);
        this.addMeta(CODE, statusCode);
        this.addMeta(MESSAGE, statusMsg);
        this.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        return this;
    }

    public ApiResult successLogicError(int statusCode, String statusMsg, Object data, int logicCode) {
        this.addMeta(SUCCESS, Boolean.TRUE);
        this.addMeta(CODE, statusCode);
        if (StringUtils.isEmpty(statusMsg) && logicCode == 200) {
            statusMsg = "执行成功";
        }
        this.addMeta(MESSAGE, statusMsg);
        this.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));

        this.addMeta(LOGIC_CODE, logicCode);
        this.addData(RESULT, data);

        return this;
    }

    public ApiResult successLogicErrorByException(int statusCode, Exception exception, Object data, int logicCode) {
        this.addMeta(SUCCESS, Boolean.TRUE);
        this.addMeta(CODE, statusCode);
        String stackInfo = "";
        int maxLength = 3;
        if (exception.getStackTrace() != null && exception.getStackTrace().length > 0) {
            for (int i = 0; i < exception.getStackTrace().length; i++) {
                String errInfoStep = exception.getStackTrace()[i] == null ? "err-unknow-0x01" : exception.getStackTrace()[i].toString();
                System.out.println(errInfoStep);
                if (StringUtils.isEmpty(errInfoStep)) {
                    continue;
                }

                if (i >= maxLength) {
                    break;
                }

                if (i > 1) {
                    stackInfo += "。";
                }
                stackInfo += errInfoStep;
            }
        }
        //String statusMsg = exception.getMessage().concat(exception.toString()).concat(stackInfo);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(exception.getMessage());
        stringBuilder.append(stackInfo);
        String statusMsg = stringBuilder.toString();

        this.addMeta(MESSAGE, statusMsg);
        this.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));

        this.addMeta(LOGIC_CODE, logicCode);
        this.addData(RESULT, data);

        return this;
    }

    public ApiResult error(int statusCode, String statusMsg) {
        this.addMeta(SUCCESS, Boolean.FALSE);
        this.addMeta(CODE, statusCode);
        this.addMeta(MESSAGE, statusMsg);
        this.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        return this;
    }

    public static ApiResult unauthorized(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.Unauthorized.getCode());
        result.addMeta(MESSAGE, ErrorCode.Unauthorized.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("Unauthorized", data);
        return result;
    }

    public static ApiResult forbidden(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.Forbidden.getCode());
        result.addMeta(MESSAGE, ErrorCode.Forbidden.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("Forbidden", data);
        return result;
    }


    public static ApiResult timeout(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.RequestTimeout.getCode());
        result.addMeta(MESSAGE, ErrorCode.RequestTimeout.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("RequestTimeout", data);
        return result;
    }

    public static ApiResult internalServerError(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.InternalServerError.getCode());
        result.addMeta(MESSAGE, ErrorCode.InternalServerError.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("InternalServerError", data);
        return result;
    }

    public static ApiResult notFound(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.NotFound.getCode());
        result.addMeta(MESSAGE, ErrorCode.NotFound.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("NotFound", data);
        return result;
    }

    public static ApiResult badRequest(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, ErrorCode.NotFound.getCode());
        result.addMeta(MESSAGE, ErrorCode.NotFound.getMessage());
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData("NotFound", data);
        return result;
    }

    public static ApiResult ok(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.TRUE);
        result.addMeta(CODE, "200");
        result.addMeta(MESSAGE, "ok");
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData(DEFAULT_SUCCESS_DATA, data);
        return result;
    }

    public static ApiResult err(Object data) {
        ApiResult result = new ApiResult();
        result.addMeta(SUCCESS, Boolean.FALSE);
        result.addMeta(CODE, "500");
        result.addMeta(MESSAGE, "err");
        result.addMeta(TIMESTAMP, new Timestamp(System.currentTimeMillis()));
        result.addData(DEFAULT_ERROR_DATA, data);
        return result;
    }

    /**
     * 判断返回结果
     *
     * @return
     */
    public Boolean isSuccess() {
        return (getMeta() != null && getMeta().containsKey(SUCCESS)) ? (Boolean) getMeta().get(SUCCESS) : Boolean.FALSE;
    }

    /**
     * 获取默认key返回对象
     * @return
     */
//    public Object getObjectFromData() {
//        return getObjectFromData(RESULT);
//    }

    /**
     * 根据key获取返回对象
     * @param key
     * @return
     */
//    public Object getObjectFromData(String key) {
//        return (getData() != null && getData().containsKey(key)) ? getData().get(key) : null;
//    }

}

