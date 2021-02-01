package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Banner;
import com.kbk.model.Work;
import com.kbk.service.BannerService;
import com.kbk.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WorkController {
    @Autowired
    private WorkService workService;

    /**
     * get
     * 查询work列表接口
     *
     * @return work
     */
    @GetMapping("/api/work/{id}")
    public Map<String, Object> Work(@PathVariable Long id) {
        Work work = workService.selectWorksById(id);
        if (work != null) {
            return Restful.set(200, "查询work成功", work);

        } else {
            return Restful.set(404, "查询work失败");
        }
    }
}
