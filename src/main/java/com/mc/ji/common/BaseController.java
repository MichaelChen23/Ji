package com.mc.ji.common;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 基础Controller
 * @author mc
 * @date 2017-8-8
 */
public class BaseController<T extends IBaseService, M extends BaseDO> {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private T serviceImpl;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseResponse<Boolean> saveUser(@RequestBody M DO) {
        try {
            Boolean result = serviceImpl.saveByObj(DO);
            return BaseResponse.getRespByResultBool(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public BaseResponse<Boolean> removeUser(@RequestBody M DO) {//可通过id来删除，可通过其他条件是唯一性的来定位数据来删除，例如username是不相同，唯一的，就可以定位到唯一的数据
        try {
            Boolean result = serviceImpl.removeByObj(DO);
            return BaseResponse.getRespByResultBool(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResponse<Boolean> updateUser(@RequestBody M DO) {//一定要通过id来修改
        try {
            Boolean result = serviceImpl.updateByObj(DO);
            return BaseResponse.getRespByResultBool(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public BaseResponse<M> getUser(@RequestBody M DO) {//可以通过id来查找，也可以同唯一性的条件来查找出唯一的数据，例如username是不相同，唯一的，就可以定位到唯一的数据
        try {
            M result = (M) serviceImpl.getOneByObj(DO);
            return new BaseResponse<M>(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public PageInfo<M> getUserList(@RequestBody M DO) {//通过输入page页数和rows每页查询的行数来查询lsit，如果不输入，默认值查询第一页；如果改用select（Obj）方法输入唯一性字段来查询会查到相关唯一的记录。
        try {
            List<M> list = serviceImpl.getListByObj(DO);
            return new PageInfo<M>(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    public Integer getUserCount(@RequestBody M DO) {//输入为null，查询全部的数量，输入唯一性的字段，根据该字段数值查询唯一，数量为1
        try {
            Integer count = serviceImpl.getCount(DO);
            return count;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
