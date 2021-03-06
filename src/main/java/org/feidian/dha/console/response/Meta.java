package org.feidian.dha.console.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yinchao
 * @Date 2020/1/22 16:55
 */
@AllArgsConstructor
@Data
public class Meta {
    private Integer code;
    private String message;
}
