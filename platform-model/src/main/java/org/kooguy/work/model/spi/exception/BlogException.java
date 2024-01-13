package org.kooguy.work.model.spi.exception;

import org.kooguy.work.model.spi.error.ErrorCode;
import org.kooguy.work.model.spi.error.ErrorLevel;

import java.io.IOException;

public class BlogException extends IOException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public BlogException() {
        super();
    }

    private Object data;

    public BlogException(ErrorCode invalidParamter, ErrorLevel error) {
        super();
    }

    public BlogException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogException(String message) {
        super(message);
    }

    public BlogException(Throwable cause) {
        super(cause);
    }

    public BlogException(Object data, String message, Throwable cause) {
        super(message, cause);
        this.data = data;
    }

    /**
     * Gets the value of data
     *
     * @return the value of data
     */
    public Object getData() {
        return data;
    }
}

