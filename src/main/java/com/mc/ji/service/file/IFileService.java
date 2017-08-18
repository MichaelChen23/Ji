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
     * 获取文档列表，分页显示
     * add by mc 2017-8-17
     * @param page 页码
     * @param rows 每页显示行数
     * @return
     */
    List<FileVO> getFileVoList(Integer page, Integer rows);

    /**
     * 根据文档题目，模糊查询文档列表，分页显示
     * add by mc 2017-8-17
     * @param title 文档题目
     * @param page
     * @param rows
     * @return
     */
    List<FileVO> getFileVoListByTitle(String title, Integer page, Integer rows);
}
