package org.wzx.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: API统一返回类
 * @return:
 * @author: 鱼头(韦忠幸)
 * @since: 2020/5/21 9:46
 * @version: 0.0.1
 */
@Data
@Builder
@NoArgsConstructor
public class Result<T> implements Serializable {
    private T data;

    private String message = "操作成功";

    private int code = 0;

    public Result(T data) {
        this.data = data;
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public Result(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
}
