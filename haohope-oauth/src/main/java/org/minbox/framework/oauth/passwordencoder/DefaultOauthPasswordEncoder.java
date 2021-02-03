package org.minbox.framework.oauth.passwordencoder;

public class DefaultOauthPasswordEncoder extends OauthPasswordEncoder {

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
