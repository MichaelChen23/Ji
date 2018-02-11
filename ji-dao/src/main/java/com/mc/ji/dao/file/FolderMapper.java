package com.mc.ji.dao.file;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.FolderVO;
import com.mc.ji.model.file.FolderDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文件夹的数据访问层Mapper
 * @author mc
 * @date 2017-8-17
 */
public interface FolderMapper extends JiMapper<FolderDO> {

    List<FolderVO> getFolderVOList(@Param("name")String name, @Param("folderName")String folderName, @Param("createAccount")String createAccount, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}