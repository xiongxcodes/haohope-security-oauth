/*
 * Copyright [2019] [恒宇少年 - 于起宇]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.minbox.framework.security.userdetails;

import lombok.Data;
import org.minbox.framework.security.enums.YesOrNo;
import org.minbox.framework.security.jdbc.DefaultSecurityUserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The default {@link UserDetails} implement class
 *
 * @author 恒宇少年
 * @see org.minbox.framework.security.delegate.DefaultSecurityStoreDelegate#loadUserByUsername(String)
 */
@Data
public class DefaultSecurityUserDetails extends DefaultSecurityUserEntity implements UserDetails {
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList() {
            {
                add((GrantedAuthority) () -> "ROLE_USER");
            }
        };
    }

    @Override
    public String getPassword() {
        return super.getUiPassword();
    }

    @Override
    public String getUsername() {
        return super.getUiUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return YesOrNo.NO.getValue().equals(super.getUiIsLocked());
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return YesOrNo.YES.getValue().equals(super.getUiIsEnabled());
    }
}
