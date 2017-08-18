package com.mc.ji.controller.account;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseDO;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.model.account.AccountDO;
import com.mc.ji.service.account.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 账目的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController<IAccountService, AccountDO> {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value = "/getAccountList", method = RequestMethod.POST)
    public PageInfo<AccountVO> getAccountList(@RequestBody BaseDO DO) {
        try {
            List<AccountVO> list = getServiceImpl().getAccountVoList(DO.getPage(), DO.getRows());
            return new PageInfo<AccountVO>(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/searchAccountListByTitle", method = RequestMethod.POST)
    public PageInfo<AccountVO> searchAccountList(@RequestBody BaseDO DO) {
        try {
            List<AccountVO> list = getServiceImpl().getAccountVoListByTitle(DO.getSearchValue(), DO.getPage(), DO.getRows());
            return new PageInfo<AccountVO>(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
