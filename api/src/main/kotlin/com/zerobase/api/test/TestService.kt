package com.zerobase.api.test

import com.zerobase.domain.domain.UserInfo
import com.zerobase.domain.repository.UserInfoRepository
import org.springframework.stereotype.Service

@Service
class TestService(
        private val userInfoRepository: UserInfoRepository
) {
    fun testGetService(usrKey : String) = userInfoRepository.findByUserKey(usrKey).toDto()

    fun UserInfo.toDto() = TestDto.UserInfoDto(userKey, userRegistrationNumber, userName, userIncomeAmount)
}