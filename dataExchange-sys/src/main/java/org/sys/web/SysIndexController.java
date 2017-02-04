package org.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sys.entity.UserTest;
import org.sys.service.SysIndexService;

/**
 * Created by Administrator on 2017-02-04.
 */
@Controller
public class SysIndexController {

    @Autowired
    private SysIndexService sysIndexService;

    @RequestMapping("sysindex.html")
    public String index(ModelMap views){
        UserTest userTestById = sysIndexService.getUserTestById(1);
        views.addAttribute("userTest",userTestById);

        return "sysindex";
    }

}
