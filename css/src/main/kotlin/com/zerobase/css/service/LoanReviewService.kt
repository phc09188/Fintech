package com.zerobase.css.service

import com.zerobase.css.dto.LoanRequestDto
import com.zerobase.css.dto.LoanResultDto
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class LoanReviewService {
    fun loanReview(loanRequestDto: LoanRequestDto.RequestInputDto): LoanResultDto.ResponseDto{
        if(loanRequestDto.userIncomeAmount <0) throw RuntimeException("Invalid userIncomeAmount Param")
        if(loanRequestDto.userIncomeAmount <10000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        if(loanRequestDto.userIncomeAmount <20000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        if(loanRequestDto.userIncomeAmount <30000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        if(loanRequestDto.userIncomeAmount <40000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        if(loanRequestDto.userIncomeAmount <50000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        if(loanRequestDto.userIncomeAmount >=50000000) return LoanResultDto.ResponseDto(loanRequestDto.userKey,0.0,10000000)
        throw RuntimeException("Invalid userIncomeAmount Param")
    }
}