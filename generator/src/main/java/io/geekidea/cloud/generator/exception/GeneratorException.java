package io.geekidea.cloud.generator.exception;


import com.qt.common.api.ApiCode;
import com.qt.common.exception.ScpException;

/**
 * 代码生成异常
 *
 * @author geekidea
 * @date 2020/3/12
 */
public class GeneratorException extends ScpException {
    private static final long serialVersionUID = 2556853577480934761L;

    public GeneratorException(String message) {
        super(message);
    }

    public GeneratorException(Integer errorCode, String message) {
        super(errorCode, message);
    }

    public GeneratorException(ApiCode apiCode) {
        super(apiCode);
    }
}
