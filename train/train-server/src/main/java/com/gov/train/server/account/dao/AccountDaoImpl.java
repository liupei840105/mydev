package com.gov.train.server.account.dao;

import com.gov.train.common.account.AccountDm;
import com.gov.train.common.account.AccountStatus;
import com.gov.train.common.joop.tables.Account;
import com.gov.train.common.joop.tables.records.AccountRecord;
import com.gov.train.common.convertor.DateTimeConvertor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.function.Function;

/**
 * Created by liupei on 2017/8/1.
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private DSLContext dslContext;
    @Override
    public AccountDm getAccountByName(String accountName) {
        Result<Record>  records= dslContext.select().from(Account.ACCOUNT).where(Account.ACCOUNT.ACCOUNT_NAME.eq(accountName)).fetch();
        if (records != null&&records.size()>0) {
            return records.stream().findFirst().map(transferAccount).get();
        }
        return null;
    }


  private  static  Function<Record,AccountDm> transferAccount=(record) ->{
      AccountDm dm=new AccountDm();
      AccountRecord input=(AccountRecord)record;
      dm.setAccountName(input.getAccountName());
      dm.setId(input.getId());
      dm.setCreateDate(input.getValue(Account.ACCOUNT.CREATEDATE,new DateTimeConvertor()));
      dm.setDescription(input.getDescription());
      dm.setEmail(input.getEmail());
      dm.setPassword(input.getPassword());
      dm.setStatus(AccountStatus.getAccountStatusByCode(input.getStatus()));
      dm.setUpdateDate(input.getValue(Account.ACCOUNT.UPDATEDATE,new DateTimeConvertor()));
      return  dm;
  };
}
