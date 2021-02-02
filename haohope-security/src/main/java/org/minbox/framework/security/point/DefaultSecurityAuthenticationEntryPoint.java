package org.minbox.framework.security.point;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.minbox.framework.security.SecurityResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The {@link AuthenticationEntryPoint} implement class
 * <p>
 * The default implementation class of {@link AuthenticationEntryPoint} provided by ApiBoot
 * @author 恒宇少年
 */
public class DefaultSecurityAuthenticationEntryPoint implements AuthenticationEntryPoint {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(DefaultSecurityAuthenticationEntryPoint.class);

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        logger.error("Unauthorized", e);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpStatus.FORBIDDEN.value());
        // Security Result
        SecurityResult result = SecurityResult.builder().errorMessage(HttpStatus.UNAUTHORIZED.getReasonPhrase()).errorCode(String.valueOf(HttpStatus.UNAUTHORIZED.value())).build();
        // return json
        response.getWriter().write(new ObjectMapper().writeValueAsString(result));
    }
}
