package com.mc.ji.service.file;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.common.vo.FileVO;
import com.mc.ji.model.file.FileDO;

import java.util.List;

/**
 * 文档的服务接口
 * @author mc
 * @date 2017-8-17
 */
public interface IFileService extends IBaseService<FileDO> {

    /**
     * 根据条件获取文档VO列表,关联查询，并分页显示
     * modify by mc 2017-9-3
     * @param VO
     * @return
     * @throws Exception
     */
    List<FileVO> getFileVOList(FileVO VO) throws Exception;

}
