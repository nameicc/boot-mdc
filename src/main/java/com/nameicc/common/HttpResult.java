package com.nameicc.common;

import lombok.Data;
import org.slf4j.MDC;

import java.io.Serializable;

@Data
public class HttpResult<T> implements Serializable {

    private boolean success = true;

    private String code = "200";

    private String message = "请求成功";

    private T data;

    private String requestSeq = MDC.get("_traceId");

}
