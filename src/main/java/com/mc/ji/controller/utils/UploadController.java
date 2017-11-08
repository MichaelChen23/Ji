package com.mc.ji.controller.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 上传文件的Controller
 * @author mc
 * @date 2017-11-8
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    @Value("${uploadpath}")
    private String uploadPath;

    /**
     * 使用Ajax异步上传图片
     *
     * @param request
     * @param response
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping(value = "/uploadPic", method = RequestMethod.POST)
    public void uploadPic(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            MultipartFile file = multipartRequest.getFile("file");
            // 获取图片原始文件名
            String originalFilename = file.getOriginalFilename();
            // 文件名使用uuid，设置唯一的文件名
            String name = UUID.randomUUID().toString();
            // 获取上传图片的扩展名(jpg/png/...)
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
            // 图片上传的相对路径（因为相对路径放到页面上就可以显示图片）
            String path = uploadPath + name + suffix;

             //图片上传的绝对路径
            String rootPath = request.getSession().getServletContext().getRealPath("") + uploadPath;
            File dir = new File(rootPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            //上传图片全路径
            String allPath = rootPath + name + suffix;
            // 上传图片
            file.transferTo(new File(allPath));
            // 将相对路径写回（json格式）
            JSONObject jsonObject = new JSONObject();
            // 将图片上传到本地
            jsonObject.put("picPath", path);

            // 设置响应数据的类型json
            response.setContentType("application/json; charset=utf-8");
            // 返回前端
            response.getWriter().write(jsonObject.toString());

        } catch (Exception e) {
            throw new RuntimeException("服务器繁忙，上传图片失败");
        }
    }

}
