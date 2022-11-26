# 📋 zerobase - assignment2

**"Spring boot와 Java를 활용하여 Account(계좌 관리) 시스템 구현" <br>**
Spring boot 학습을 목적으로 강의를 따라하며 진행한 과제입니다.


### [구현 기능]
- 계좌 관련 API
    - 계좌 생성
    - 계좌 해지
    - 계좌 확인

- 거래 관련 API
    - 잔액 사용
    - 잔액 사용 취소
    - 거래 확인
  


## 🕰️ 개발 기간 
* 22.11.10 - 22.11.26


### ⚙️ 개발 환경
- `Java 11`
- `JDK 11`
- **IDE** :  Eclipse
- **Database** : H2 DB




## 📌 주요 기능

- #### 계좌 관련 API
    - #### 계좌 생성
    - #### 계좌 해지
    - #### 계좌 확인

- #### 거래 관련 API
    - #### 잔액 사용
    - #### 잔액 사용 취소
    - #### 거래 확인

## 📄 API Documentation

https://documenter.getpostman.com/view/17844607/2s8YstTswo 


## 📁 폴더 구조

```
.
|-- bin
|   |-- default
|   |-- main
|   |   |-- application.yml
|   |   |-- com
|   |   |   `-- example
|   |   |       `-- account
|   |   |           |-- AccountApplication.class
|   |   |           |-- aop
|   |   |           |   |-- AccountLock.class
|   |   |           |   `-- AccountLockIdInterface.class
|   |   |           |-- config
|   |   |           |   |-- JpaAuditingConfiguration.class
|   |   |           |   |-- LocalRedisConfig.class
|   |   |           |   `-- RedisRepositoryConfig.class
|   |   |           |-- controller
|   |   |           |   |-- AccountController.class
|   |   |           |   `-- TransactionController.class
|   |   |           |-- domain
|   |   |           |   |-- Account$AccountBuilder.class
|   |   |           |   |-- Account.class
|   |   |           |   |-- AccountUser$AccountUserBuilder.class
|   |   |           |   |-- AccountUser.class
|   |   |           |   |-- BaseEntity.class
|   |   |           |   |-- Transaction$TransactionBuilder.class
|   |   |           |   `-- Transaction.class
|   |   |           |-- dto
|   |   |           |   |-- AccountDto$AccountDtoBuilder.class
|   |   |           |   |-- AccountDto.class
|   |   |           |   |-- AccountInfo$AccountInfoBuilder.class
|   |   |           |   |-- AccountInfo.class
|   |   |           |   |-- CancelBalance$Request.class
|   |   |           |   |-- CancelBalance$Response$ResponseBuilder.class
|   |   |           |   |-- CancelBalance$Response.class
|   |   |           |   |-- CancelBalance.class
|   |   |           |   |-- CreateAccount$Request.class
|   |   |           |   |-- CreateAccount$Response$ResponseBuilder.class
|   |   |           |   |-- CreateAccount$Response.class
|   |   |           |   |-- CreateAccount.class
|   |   |           |   |-- DeleteAccount$Request.class
|   |   |           |   |-- DeleteAccount$Response$ResponseBuilder.class
|   |   |           |   |-- DeleteAccount$Response.class
|   |   |           |   |-- DeleteAccount.class
|   |   |           |   |-- ErrorResponse$ErrorResponseBuilder.class
|   |   |           |   |-- ErrorResponse.class
|   |   |           |   |-- QueryTransactionResponse$QueryTransactionResponseBuilder.class
|   |   |           |   |-- QueryTransactionResponse.class
|   |   |           |   |-- TransactionDto$TransactionDtoBuilder.class
|   |   |           |   |-- TransactionDto.class
|   |   |           |   |-- UseBalance$Request.class
|   |   |           |   |-- UseBalance$Response$ResponseBuilder.class
|   |   |           |   |-- UseBalance$Response.class
|   |   |           |   `-- UseBalance.class
|   |   |           |-- exception
|   |   |           |   |-- AccountException$AccountExceptionBuilder.class
|   |   |           |   |-- AccountException.class
|   |   |           |   `-- GlobalExceptionHandler.class
|   |   |           |-- repository
|   |   |           |   |-- AccountRepository.class
|   |   |           |   |-- AccountUserRepository.class
|   |   |           |   `-- TransactionRepository.class
|   |   |           |-- service
|   |   |           |   |-- AccountService.class
|   |   |           |   |-- LockAopAspect.class
|   |   |           |   |-- LockService.class
|   |   |           |   `-- TransactionService.class
|   |   |           `-- type
|   |   |               |-- AccountStatus.class
|   |   |               |-- ErrorCode.class
|   |   |               |-- TransactionResultType.class
|   |   |               `-- TransactionType.class
|   |   |-- data.sql
|   |   `-- templates
|   `-- test
|       `-- com
|           `-- example
|               `-- account
|                   |-- controller
|                   |   |-- AccountControllerTest.class
|                   |   `-- TransactionControllerTest.class
|                   `-- service
|                       |-- AccountServiceTest.class
|                       |-- LockAopAspectTest.class
|                       |-- LockServiceTest.class
|                       `-- TransactionServiceTest.class
|-- build.gradle
|-- gradle
|   `-- wrapper
|       |-- gradle-wrapper.jar
|       `-- gradle-wrapper.properties
|-- gradlew
|-- gradlew.bat
|-- settings.gradle
`-- src
    |-- main
    |   |-- java
    |   |   `-- com
    |   |       `-- example
    |   |           `-- account
    |   |               |-- AccountApplication.java
    |   |               |-- aop
    |   |               |   |-- AccountLock.java
    |   |               |   `-- AccountLockIdInterface.java
    |   |               |-- config
    |   |               |   |-- JpaAuditingConfiguration.java
    |   |               |   |-- LocalRedisConfig.java
    |   |               |   `-- RedisRepositoryConfig.java
    |   |               |-- controller
    |   |               |   |-- AccountController.java
    |   |               |   `-- TransactionController.java
    |   |               |-- domain
    |   |               |   |-- Account.java
    |   |               |   |-- AccountUser.java
    |   |               |   |-- BaseEntity.java
    |   |               |   `-- Transaction.java
    |   |               |-- dto
    |   |               |   |-- AccountDto.java
    |   |               |   |-- AccountInfo.java
    |   |               |   |-- CancelBalance.java
    |   |               |   |-- CreateAccount.java
    |   |               |   |-- DeleteAccount.java
    |   |               |   |-- ErrorResponse.java
    |   |               |   |-- QueryTransactionResponse.java
    |   |               |   |-- TransactionDto.java
    |   |               |   `-- UseBalance.java
    |   |               |-- exception
    |   |               |   |-- AccountException.java
    |   |               |   `-- GlobalExceptionHandler.java
    |   |               |-- repository
    |   |               |   |-- AccountRepository.java
    |   |               |   |-- AccountUserRepository.java
    |   |               |   `-- TransactionRepository.java
    |   |               |-- service
    |   |               |   |-- AccountService.java
    |   |               |   |-- LockAopAspect.java
    |   |               |   |-- LockService.java
    |   |               |   `-- TransactionService.java
    |   |               `-- type
    |   |                   |-- AccountStatus.java
    |   |                   |-- ErrorCode.java
    |   |                   |-- TransactionResultType.java
    |   |                   `-- TransactionType.java
    |   `-- resources
    |       |-- application.yml
    |       |-- data.sql
    |       |-- static
    |       `-- templates
    `-- test
        `-- java
            `-- com
                `-- example
                    `-- account
                        |-- controller
                        |   |-- AccountControllerTest.java
                        |   `-- TransactionControllerTest.java
                        `-- service
                            |-- AccountServiceTest.java
                            |-- LockAopAspectTest.java
                            |-- LockServiceTest.java
                            `-- TransactionServiceTest.java
```
