package com.mc.ji.controller.file;

import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.file.FolderDO;
import com.mc.ji.service.file.IFolderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件夹的Controller
 * @author mc
 * @date 2017-8-17
 */
@RestController
@RequestMapping("/folder")
public class FolderController extends BaseController<IFolderService, FolderDO> {
}
