package com.zerobase.api.exception

import org.springframework.http.ResponseEntity
import java.time.LocalDateTime

class CustomResponse(
        private val customException: CustomException
) {
    fun toResponseEntity(): ResponseEntity<ErrorResponseDto>{
        return ResponseEntity
                .status(customException.customErrorCode.statusCod)
                .body(
                        ErrorResponseDto(
                                errorCode =  customException.customErrorCode.errorCode,
                                errorMessage = customException.customErrorCode.errorMessage
                        )
                )
    }


    data class ErrorResponseDto(
            val errorCode: String,
            val errorMessage: String
    ){
        val timeStamp = LocalDateTime.now()

    }
}