package com.blog.myblog1.exception;

import com.blog.myblog1.payload.ErrorsDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorsDetails> handleResourceNotFoundException(
            ResourceNotFoundException e,
            WebRequest webRequest)
    {
        ErrorsDetails errorsDetails=new ErrorsDetails(e.getMessage(),new Date(),webRequest.getDescription(true));
        return new ResponseEntity<>(errorsDetails, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
