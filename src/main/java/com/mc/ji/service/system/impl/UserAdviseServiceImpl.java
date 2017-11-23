package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.Constant;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.system.UserAdviseMapper;
import com.mc.ji.model.system.UserAdviseDO;
import com.mc.ji.service.system.IUserAdviseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 用户建议的服务接口实现
 * @author mc
 * @date 2017-11-23
 */
@Service
public class UserAdviseServiceImpl extends BaseServiceImpl<UserAdviseMapper, UserAdviseDO> implements IUserAdviseService {

    @Override
    public List<UserAdviseDO> getUserAdviseDOList(UserAdviseDO userAdviseDO) throws Exception {
        if (userAdviseDO.getPageIndex() == 0 && userAdviseDO.getPageSize() > 0) {
            PageHelper.startPage(userAdviseDO.getPageIndex(), userAdviseDO.getPageSize());
        } else if (userAdviseDO.getPageIndex() > 0 && userAdviseDO.getPageSize() > 0) {
            PageHelper.offsetPage(userAdviseDO.getPageIndex(), userAdviseDO.getPageSize());
        }
        Example example = new Example(UserAdviseDO.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(userAdviseDO.getCreateAccount())) {
            criteria.andLike("createAccount", "%"+userAdviseDO.getCreateAccount()+"%");
        }
        if (userAdviseDO.getScore() != null) {
            criteria.andEqualTo("score", userAdviseDO.getScore());
        }
        if (StringUtils.isNotBlank(userAdviseDO.getAdvise())) {
            criteria.andLike("advise", "%"+userAdviseDO.getAdvise()+"%");
        }
        if (StringUtils.isNotBlank(userAdviseDO.getRemark())) {
            criteria.andLike("remark", "%"+userAdviseDO.getRemark()+"%");
        }
        if (StringUtils.isNotBlank(userAdviseDO.getCreateTimeBegin())) {
            criteria.andGreaterThanOrEqualTo("createTime", userAdviseDO.getCreateTimeBegin());
        }
        if (StringUtils.isNotBlank(userAdviseDO.getCreateTimeEnd())) {
            criteria.andLessThanOrEqualTo("createTime", userAdviseDO.getCreateTimeEnd());
        }
        if (StringUtils.isNotBlank(userAdviseDO.getStatus())) {
            criteria.andEqualTo("status", userAdviseDO.getStatus());
        }
        if (StringUtils.isNotBlank(userAdviseDO.getSort())) {
            if (Constant.ORDER_ASC.equals(userAdviseDO.getOrder())) {
                example.orderBy(userAdviseDO.getSort()).asc();
            } else if (Constant.ORDER_DESC.equals(userAdviseDO.getOrder())) {
                example.orderBy(userAdviseDO.getSort()).desc();
            } else {
                //默认降幂排序
                example.orderBy(userAdviseDO.getSort()).desc();
            }
        }
        return getMapper().selectByExample(example);
    }
}
