package com.mc.ji.controller.account;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.account.AccountTypeDO;
import com.mc.ji.service.account.IAccountTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 账目类型的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/acc-type")
public class AccountTypeController extends BaseController<IAccountTypeService, AccountTypeDO> {

    private static final Logger logger = LoggerFactory.getLogger(AccountTypeController.class);

    @RequestMapping(value = "/getAccountTypeList", method = RequestMethod.POST)
    public PageInfo<AccountTypeDO> getRoleList(@RequestBody AccountTypeDO DO) {
        try {
            if (DO == null) return null;
            List<AccountTypeDO> list = getServiceImpl().getAccountTypeDOList(DO);
            return new PageInfo<AccountTypeDO>(list);
        } catch (Exception e) {
            logger.error("get account type list fail(获取账目类型列表失败) -- :{}", e.getMessage());
            return null;
        }
    }
}
