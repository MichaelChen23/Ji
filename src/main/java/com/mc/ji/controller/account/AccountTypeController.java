package com.mc.ji.controller.account;

import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.account.AccountTypeDO;
import com.mc.ji.service.account.IAccountTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账目类型的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/acc-type")
public class AccountTypeController extends BaseController<IAccountTypeService, AccountTypeDO> {
}
