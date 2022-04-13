package com.zarisa.bankaccountmanagement.data_base

import androidx.room.*

@Dao
interface AccountDao {
    @Query("SELECT * FROM UserAccount")
    fun getAll(): List<UserAccount>
    @Query("SELECT * FROM UserAccount where cardNumber=:cardNumber")
    fun getAccount(cardNumber: Int): UserAccount

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg userAccount: UserAccount)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userAccount: UserAccount)

    @Delete
    fun delete(userAccount: UserAccount)

}