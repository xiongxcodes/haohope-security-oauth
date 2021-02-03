package org.minbox.framework.oauth.passwordencoder;

public class DefaultOauthPasswordEncoder extends OauthPasswordEncoder {


    public String encode(CharSequence rawPassword) {
        // TODO Auto-generated method stub
        return rawPassword.toString();
    }

    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // TODO Auto-generated method stub
        return true;
    }

}
