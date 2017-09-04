package com.mc.ji.controller.file;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.vo.FolderVO;
import com.mc.ji.model.file.FolderDO;
import com.mc.ji.service.file.IFolderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件夹的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/folder")
public class FolderController extends BaseController<IFolderService, FolderDO> {

    private static final Logger logger = LoggerFactory.getLogger(FolderController.class);

    @RequestMapping(value = "/getFolderVOList", method = RequestMethod.POST)
    public PageInfo<FolderVO> getFileVOList(@RequestBody FolderVO VO) {
        try {
            if (VO == null) return null;
            List<FolderVO> list = getServiceImpl().getFolderVOList(VO);
            return new PageInfo<FolderVO>(list);
        } catch (Exception e) {
            logger.error("get FolderVO list fail(获取文件夹列表失败)——"+VO.toString()+":{}", e.getMessage());
            return null;
        }
    }
}
