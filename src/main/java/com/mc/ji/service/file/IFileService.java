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
     * 根据条件获取文档列表，并分页显示
     * add by mc 2017-9-3
     * @param pageIndex 页码
     * @param pageSize 每页显示行数
     * @param title 文件名
     * @param createAccount 创建用户
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     * @throws Exception
     */
    List<FileDO> getFileDOList(Integer pageIndex, Integer pageSize, String title, String createAccount, String createTimeBegin, String createTimeEnd, String sort, String order) throws Exception;


    /**
     * 根据条件获取文档VO列表,关联查询，并分页显示
     * modify by mc 2017-9-3
     * @param VO
     * @return
     * @throws Exception
     */
    List<FileVO> getFileVOList(FileVO VO) throws Exception;

    /**
     * 根据文档题目，模糊查询文档列表，分页显示
     * add by mc 2017-8-17
     * @param title 文档题目
     * @param page
     * @param rows
     * @return
     */
    List<FileVO> getFileVOListByTitle(String title, Integer page, Integer rows) throws Exception;
}
