package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.system.AdvertDO;
import com.mc.ji.service.system.IAdvertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 广告的Controller
 * @author mc
 * @date 2017-11-8
 */
@RestController
@RequestMapping("/advert")
public class AdvertController extends BaseController<IAdvertService, AdvertDO> {

    private static final Logger logger = LoggerFactory.getLogger(AdvertController.class);

    @RequestMapping(value = "/getAdvertList", method = RequestMethod.POST)
    public PageInfo<AdvertDO> getAdvertList(@RequestBody AdvertDO advertDO) {
        try {
            if (advertDO == null) {
                return null;
            }
            List<AdvertDO> list = getServiceImpl().getAdvertDOList(advertDO);
            return new PageInfo<AdvertDO>(list);
        } catch (Exception e) {
            logger.error("get advert list fail(获取广告列表失败) -- :{}", e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/getAdvertPage", method = RequestMethod.POST)
    public PageInfo<AdvertDO> getAdvertPage(@RequestBody AdvertDO advertDO) {
        try {
            List<AdvertDO> list = getServiceImpl().getAdvertPage(advertDO);
            return new PageInfo<AdvertDO>(list);
        } catch (Exception e) {
            logger.error("get advert page fail(获取广告可视分页失败) -- :{}", e.getMessage());
            return null;
        }
    }

}
