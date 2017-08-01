package com.gov.train.client.controller.account;

import com.gov.train.common.account.AccountDm;
import com.gov.train.common.utils.ResponseEntity;
import com.gov.train.server.account.service.AccountService;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liupei on 2017/7/18.
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getAccountByName(Model model, HttpServletRequest request) {
        String aa= request.getRequestURL().toString() ;
        try {
            AccountDm accountDm = this.accountService.getAccountByName("aa");
            model.addAttribute("account", accountDm);
        } catch (Exception e) {
            logger.error("get account by name failed, account name is {},exception is {]", "aa", e);
        }
        return new ModelAndView("account/changepwd");
    }
}
