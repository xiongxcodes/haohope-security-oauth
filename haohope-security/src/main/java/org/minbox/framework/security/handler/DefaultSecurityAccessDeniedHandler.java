package org.minbox.framework.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.minbox.framework.security.SecurityResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@link AccessDeniedHandler} exception handler
 * <p>
 * Implement authentication exception custom return format content to front end
 *
 * @author 恒宇少年
 */
public class DefaultSecurityAccessDeniedHandler implements AccessDeniedHandler {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(DefaultSecurityAccessDeniedHandler.class);

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        logger.error("ApiBoot Default AccessDeniedHandler.", e);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpStatus.OK.value());
        // Security Result
        SecurityResult result = SecurityResult.builder().errorMessage(HttpStatus.FORBIDDEN.getReasonPhrase()).errorCode(String.valueOf(HttpStatus.FORBIDDEN.value())).build();
        // return json
        response.getWriter().write(new ObjectMapper().writeValueAsString(result));
    }
}
