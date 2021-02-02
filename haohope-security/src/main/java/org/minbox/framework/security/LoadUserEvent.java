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

package org.minbox.framework.security;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 加载用户信息事件
 *
 * @author 恒宇少年
 */
@Getter
public class LoadUserEvent extends ApplicationEvent {
    /**
     * 获取用户信息的用户名
     */
    private String username;

    public LoadUserEvent(Object source, String username) {
        super(source);
        this.username = username;
    }
}
