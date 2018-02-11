package com.mc.ji.controller.account;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.Constant;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.common.vo.BaseCountAccountVO;
import com.mc.ji.common.vo.CountAccountVO;
import com.mc.ji.model.account.AccountDO;
import com.mc.ji.service.account.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    public PageInfo<AccountVO> getAccountList(@RequestBody AccountVO accountVO) {
        try {
            List<AccountVO> list = getServiceImpl().getAccountVOList(accountVO);
            return new PageInfo<AccountVO>(list);
        } catch (Exception e) {
            logger.error("get account VO list fail(获取账目列表失败) -- "+accountVO.toString()+":{}", e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/countAccount", method = RequestMethod.POST)
    public CountAccountVO countAccount(@RequestBody AccountVO accountVO) {
        try {
            List<BaseCountAccountVO> list = getServiceImpl().countAccountByActionType(accountVO);
            CountAccountVO totalCountVO = new CountAccountVO();
            BigDecimal totalAmount = new BigDecimal(0);
            if (list != null && list.size() > 0) {
                List<BaseCountAccountVO> earnList = new ArrayList<>();
                BigDecimal totalEarnAmount = new BigDecimal(0);
                Integer totalEarnCount = 0;
                List<BaseCountAccountVO> payList = new ArrayList<>();
                BigDecimal totalPayAmount = new BigDecimal(0);
                Integer totalPayCount = 0;
                for (BaseCountAccountVO countAccountVO : list) {
                    BaseCountAccountVO countVO = new BaseCountAccountVO();
                    countVO.setAction(countAccountVO.getAction());
                    countVO.setAccountTypeName(countAccountVO.getAccountTypeName());
                    countVO.setAllAmount(countAccountVO.getAllAmount());
                    countVO.setCount(countAccountVO.getCount());
                    if (Constant.ACCOUNT_EARN.equals(countAccountVO.getAction())) {
                        totalEarnAmount = totalEarnAmount.add(countAccountVO.getAllAmount());
                        totalEarnCount += countVO.getCount();
                        earnList.add(countVO);
                    } else if (Constant.ACCOUNT_PAY.equals(countAccountVO.getAction())) {
                        totalPayAmount = totalPayAmount.add(countAccountVO.getAllAmount());
                        totalPayCount += countVO.getCount();
                        payList.add(countVO);
                    }
                }
                totalCountVO.setEarnList(earnList);
                totalCountVO.setTotalEarnAmount(totalEarnAmount);
                totalCountVO.setTotalEarnCount(totalEarnCount);
                totalCountVO.setPayList(payList);
                totalCountVO.setTotalPayAmount(totalPayAmount);
                totalCountVO.setTotalPayCount(totalPayCount);
                totalAmount = totalAmount.add(totalEarnAmount);
                totalAmount = totalAmount.subtract(totalPayAmount);
                totalCountVO.setTotalAmount(totalAmount);
                totalCountVO.setTotalCount(totalEarnCount+totalPayCount);

                //查询账单上的统计开始日期和结束日期
//                Map<String,Object> dateMap = new HashMap<>();
//                dateMap = getServiceImpl().getCountDateMaxAndMin(accountVO);
//                Date maxDate = (Date) dateMap.get("max_date");
//                Date minDate = (Date) dateMap.get("min_date");
//                String beginDateStr = DateUtil.getDateStr(maxDate);
//                String endDateStr = DateUtil.getDateStr(minDate);
//                totalCountVO.setCountBeginDate(beginDateStr);
//                totalCountVO.setCountEndDate(endDateStr);
            }
            return totalCountVO;
        } catch (Exception e) {
            logger.error("count account  fail(统计账目列表失败) -- "+accountVO.toString()+":{}", e.getMessage());
            return null;
        }
    }
}
