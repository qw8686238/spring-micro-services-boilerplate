package com.saintdan.framework.exception;

import com.saintdan.framework.enums.ErrorType;

import java.io.Serializable;

/**
 * Signature exception.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 8/19/15
 * @since JDK1.8
 */
public class SignatureException extends SystemException implements Serializable {

    private static final long serialVersionUID = 7181248738252641022L;

    private final static ErrorType ERROR_TYPE = ErrorType.SGN0001;

    public SignatureException(ErrorType msg, Throwable t) {
        super(msg, t);
    }

    public SignatureException(ErrorType msg) {
        super(msg);
    }

    public SignatureException() {
        super(ERROR_TYPE);
    }
}