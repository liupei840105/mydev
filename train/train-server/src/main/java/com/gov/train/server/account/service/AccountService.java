package com.gov.train.server.account.service;

import com.gov.train.common.account.AccountDm;

/**
 * Created by liupei on 2017/8/1.
 */
public interface AccountService {

    /**
     * Get account by logon name
     * @param accountName
     * @return
     */
    AccountDm getAccountByName(String accountName);
}
