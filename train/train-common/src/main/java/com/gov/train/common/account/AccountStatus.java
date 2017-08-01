package com.gov.train.common.account;

import java.lang.annotation.ElementType;

/**
 * Created by liupei on 2017/8/1.
 */
public enum  AccountStatus {
    NORMAL(1),DELETE(2),LOCK(3);

    private int code;
    private AccountStatus(int code) {
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static AccountStatus getAccountStatusByCode(int code) {
        for (AccountStatus status : AccountStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return  null;
    }

}
