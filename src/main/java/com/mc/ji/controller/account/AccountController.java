package com.mc.ji.controller.account;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
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
    public PageInfo<AccountVO> getAccountList(@RequestBody AccountVO VO) {
        try {
            if (VO == null) return null;
            List<AccountVO> list = getServiceImpl().getAccountVOList(VO);
            return new PageInfo<AccountVO>(list);
        } catch (Exception e) {
            logger.error("get account VO list fail(获取账目列表失败) -- "+VO.toString()+":{}", e.getMessage());
            return null;
        }
    }

}
