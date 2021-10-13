package org.wzx.model;

import lombok.*;

/**
 * @description: 客户端注册基本信息类
 * @return:
 * @author: 鱼头(韦忠幸)
 * @since: 2021-10-11 14:33
 * @version: 0.0.1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientRegister {
    private String protocol;
    private String host;
    private String port;
}
