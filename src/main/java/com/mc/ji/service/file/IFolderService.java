package com.mc.ji.service.file;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.common.vo.FolderVO;
import com.mc.ji.model.file.FolderDO;

import java.util.List;

/**
 * 文件夹的服务接口
 * @author mc
 * @date 2017-8-17
 */
public interface IFolderService extends IBaseService<FolderDO> {

    /**
     * 根据条件获取文件夹VO列表,关联查询，并分页显示
     * modify by mc 2017-9-4
     * @param VO
     * @return
     * @throws Exception
     */
    List<FolderVO> getFolderVOList(FolderVO VO) throws Exception;
}
