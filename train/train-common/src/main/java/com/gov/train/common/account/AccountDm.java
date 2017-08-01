package com.gov.train.common.account;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by liupei on 2017/8/1.
 */
public class AccountDm implements Serializable{
    /**
     * auto-increment int id
     */
    private Integer id;
    /**
     * account name
     */
    private String accountName;
    /**
     * some description
     */
    private String description;
    /**
     * email
     */
    private String email;
    /**
     * create time of this account
     */
    private LocalDateTime createDate;
    /**
     * update time
     */
    private LocalDateTime updateDate;
    /**
     * password of this account
     */
    private String password;

    /**
     * account status
     */
    private AccountStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

}
