package org.minbox.framework.security.exception;

import lombok.NoArgsConstructor;

/**
 * The security exception
 * @author 恒宇少年
 */
@NoArgsConstructor
public class SecurityException extends RuntimeException{
    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(String message, Throwable cause) {
        super(message, cause);
    }
}
