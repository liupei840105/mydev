package com.gov.train.server.account.dao;

import com.gov.train.common.account.AccountDm;

/**
 * Created by liupei on 2017/8/1.
 */
public interface AccountDao {

    AccountDm getAccountByName(String accountName);
}
