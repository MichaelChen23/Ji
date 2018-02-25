package com.mc.ji.service.file.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.common.vo.FileVO;
import com.mc.ji.dao.file.FileMapper;
import com.mc.ji.model.file.FileDO;
import com.mc.ji.service.file.IFileService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文档的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class FileServiceImpl extends BaseServiceImpl<FileMapper, FileDO> implements IFileService {

    @Override
    public List<FileVO> getFileVOList(FileVO VO) throws Exception {
        if (VO.getPageIndex() == 0 && VO.getPageSize() > 0) {
            PageHelper.startPage(VO.getPageIndex(), VO.getPageSize());
        } else if (VO.getPageIndex() > 0 && VO.getPageSize() > 0) {
            PageHelper.offsetPage(VO.getPageIndex(), VO.getPageSize());
        }
        return getMapper().getFileVOList(VO.getTitle(), VO.getCreateAccount(), VO.getCreateTimeBegin(), VO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("f", VO.getSort()), VO.getOrder());
    }

}
