package com.gov.train.server.account.service;

import com.gov.train.common.account.AccountDm;
import com.gov.train.server.account.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liupei on 2017/8/1.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public AccountDm getAccountByName(String accountName) {
        return accountDao.getAccountByName(accountName);
    }
}
