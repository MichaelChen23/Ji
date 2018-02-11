package com.mc.ji.controller.file;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.vo.FileVO;
import com.mc.ji.model.file.FileDO;
import com.mc.ji.service.file.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文档的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/file")
public class FileController extends BaseController<IFileService, FileDO> {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/getFileList", method = RequestMethod.POST)
    public PageInfo<FileVO> getFileList(@RequestBody FileVO VO) {
        try {
            if (VO == null) {
                return null;
            }
            List<FileVO> list = getServiceImpl().getFileVOList(VO);
            return new PageInfo<FileVO>(list);
        } catch (Exception e) {
            logger.error("get fileVO list fail(获取文档列表失败)--"+VO.toString()+":{}", e.getMessage());
            return null;
        }
    }

}
