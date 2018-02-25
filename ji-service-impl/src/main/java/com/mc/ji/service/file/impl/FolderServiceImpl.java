package com.mc.ji.service.file.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.vo.FolderVO;
import com.mc.ji.dao.file.FolderMapper;
import com.mc.ji.model.file.FolderDO;
import com.mc.ji.service.file.IFolderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件夹的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class FolderServiceImpl extends BaseServiceImpl<FolderMapper, FolderDO> implements IFolderService {

    @Override
    public List<FolderVO> getFolderVOList(FolderVO VO) throws Exception {
        if (VO.getPageIndex() == 0 && VO.getPageSize() > 0) {
            PageHelper.startPage(VO.getPageIndex(), VO.getPageSize());
        } else if (VO.getPageIndex() > 0 && VO.getPageSize() > 0) {
            PageHelper.offsetPage(VO.getPageIndex(), VO.getPageSize());
        }
        return getMapper().getFolderVOList(VO.getName(), VO.getFolderName(), VO.getCreateAccount(), VO.getCreateTimeBegin(), VO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("f", VO.getSort()), VO.getOrder());
    }
}
