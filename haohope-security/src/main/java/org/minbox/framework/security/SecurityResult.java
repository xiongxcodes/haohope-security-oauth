package org.minbox.framework.security;

import lombok.Builder;
import lombok.Data;

/**
 * 接口返回对象
 *
 * @author 恒宇少年
 */
@Data
@Builder
public class SecurityResult {
    /**
     * 返回数据内容
     */
    private Object data;
    /**
     * 遇到业务异常或者系统异常时的错误码
     */
    private String errorCode;
    /**
     * 遇到业务异常或者系统异常时的错误消息提示内容
     */
    private String errorMessage;
}
