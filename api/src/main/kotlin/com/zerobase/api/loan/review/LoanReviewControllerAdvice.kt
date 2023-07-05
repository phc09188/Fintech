package com.zerobase.api.loan.review

import com.zerobase.api.exception.CustomException
import com.zerobase.api.exception.CustomResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice(basePackageClasses = [LoanReviewController::class])
class LoanReviewControllerAdvice{
    @ExceptionHandler(CustomException::class)
    fun customExceptionHandler(customException: CustomException) =
            CustomResponse(customException).toResponseEntity()
}