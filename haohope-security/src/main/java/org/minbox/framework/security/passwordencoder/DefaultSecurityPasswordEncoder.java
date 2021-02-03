package org.minbox.framework.security.passwordencoder;

public class DefaultSecurityPasswordEncoder extends SecurityPasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        // TODO Auto-generated method stub
        return rawPassword.toString();
    }
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // TODO Auto-generated method stub
        return true;
    }


    
}
