package com.mc.ji.service.file.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.base.BaseServiceImpl;
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
    public List<FileVO> getFileVoList(Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getFileVoList();
    }

    @Override
    public List<FileVO> getFileVoListByTitle(String title, Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getFileVoListByTitle(title);
    }
}
