package com.mc.ji.controller.system;

import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.system.SysUserDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统用户的Controller
 * @author mc
 * @date 2017-8-8
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController extends BaseController<IBaseService<SysUserDO>, SysUserDO> {
}
