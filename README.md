# ๐ zerobase - assignment2

**"Spring boot์ Java๋ฅผ ํ์ฉํ์ฌ Account(๊ณ์ข ๊ด๋ฆฌ) ์์คํ ๊ตฌํ" <br>**
Spring boot ํ์ต์ ๋ชฉ์ ์ผ๋ก ๊ฐ์๋ฅผ ๋ฐ๋ผํ๋ฉฐ ์งํํ ๊ณผ์ ์๋๋ค.


## ๐ฐ๏ธ ๊ฐ๋ฐ ๊ธฐ๊ฐ 
* 22.11.10 - 22.11.26


### โ๏ธ ๊ฐ๋ฐ ํ๊ฒฝ
- `Java 11`
- `JDK 11`
- **IDE** :  Eclipse
- **Database** : H2 DB




## ๐ ์ฃผ์ ๊ธฐ๋ฅ

- #### ๊ณ์ข ๊ด๋ จ API
    - #### ๊ณ์ข ์์ฑ
    - #### ๊ณ์ข ํด์ง
    - #### ๊ณ์ข ํ์ธ

- #### ๊ฑฐ๋ ๊ด๋ จ API
    - #### ์์ก ์ฌ์ฉ
    - #### ์์ก ์ฌ์ฉ ์ทจ์
    - #### ๊ฑฐ๋ ํ์ธ

## ๐ API Documentation

https://documenter.getpostman.com/view/17844607/2s8YstTswo 


## ๐ ํด๋ ๊ตฌ์กฐ

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
