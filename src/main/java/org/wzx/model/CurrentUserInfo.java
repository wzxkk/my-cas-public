package org.wzx.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 当前用户信息类
 * @return:
 * @author: 鱼头(韦忠幸)
 * @since: 2021-10-13 16:33
 * @version: 0.0.1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUserInfo {
    private String username;
}
