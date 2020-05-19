package com.example.all.demo.mybatis.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 72082934
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultBody<T> implements Serializable {
    private static final long serialVersionUID = 5833672623155071180L;

    private int code;
    private String msg;
    private T data;

    public static void main(String[] args) {
        System.out.println(ResultBody.builder().code(200).msg("ok").data(null).build());
        ResultBody<Object> build = ResultBody.<Object>builder().code(200).build();
        System.out.println(build);

    }
}
