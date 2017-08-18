package com.mc.ji.dao.file;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.FileVO;
import com.mc.ji.model.file.FileDO;

import java.util.List;

/**
 * 文档的数据访问层Mapper
 * @author mc
 * @date 2017-8-17
 */
public interface FileMapper extends JiMapper<FileDO> {

    List<FileVO> getFileVoList();

    List<FileVO> getFileVoListByTitle(String title);
}