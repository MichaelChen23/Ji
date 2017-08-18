package com.mc.ji.service.file.impl;

import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.file.FolderMapper;
import com.mc.ji.model.file.FolderDO;
import com.mc.ji.service.file.IFolderService;
import org.springframework.stereotype.Service;

/**
 * 文件夹的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class FolderServiceImpl extends BaseServiceImpl<FolderMapper, FolderDO> implements IFolderService {
}
