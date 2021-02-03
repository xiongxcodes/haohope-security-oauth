package org.minbox.framework.oauth.passwordencoder;

import org.springframework.security.crypto.password.PasswordEncoder;

public class OauthPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        // TODO Auto-generated method stub
         return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // TODO Auto-generated method stub
         return false;
    }

}
