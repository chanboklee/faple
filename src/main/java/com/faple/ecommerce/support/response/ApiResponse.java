package com.faple.ecommerce.support.response;

import com.faple.ecommerce.support.error.ErrorMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class ApiResponse<T> {

    private final ResultType result;
    private final T data;
    private final ErrorMessage<T> error;

    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>(ResultType.SUCCESS, data, null);
    }

    public static ApiResponse<?> success(){
        return new ApiResponse<>(ResultType.SUCCESS, null, null);
    }

    public static <T> ApiResponse<T> error(ErrorMessage<T> errorMessage){
        return new ApiResponse<>(ResultType.ERROR, null, errorMessage);
    }
}
