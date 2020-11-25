package com.chenzq.controller;


import com.chenzq.common.Result;
import com.chenzq.config.CorsConfig;
import com.chenzq.entity.Chenzhongqin;
import com.chenzq.mapper.ChenzhongqinMapper;
import com.chenzq.service.ChenzhongqinService;
import com.chenzq.service.impl.ChenzhongqinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2020-09-06
 */
@RestController
@RequestMapping("/chenzhongqin")
public class ChenzhongqinController {


    @Autowired
    ChenzhongqinServiceImpl chenzhongqinServiceImpl;

    @RequestMapping("/user")
    public Result queryChenzhongqinList(){
        List<Chenzhongqin> chenzhongqin = chenzhongqinServiceImpl.queryChenzhongqinList();
        return Result.success(chenzhongqin);
    }
    @GetMapping("/byid/{id}")
    public Result queryChenzhongqinById(Integer id){
        return Result.success(chenzhongqinServiceImpl.queryChenzhongqinById(id));
    }

    @PostMapping("/addChen")
    public Result addChenzhongqin(HttpServletRequest request, @RequestBody Chenzhongqin chenzhongqin) {

        return Result.success(chenzhongqinServiceImpl.addChenzhongqin(chenzhongqin));
    }

    @PostMapping("/updateChen")
    public Result updateChenzhongqin(Chenzhongqin chenzhongqin){

        return Result.success(chenzhongqinServiceImpl.updateChenzhongqin(chenzhongqin));
    }

    @GetMapping("/deleteChen/{id}")
    public Result deleteChenzhongqin(int id) {
        int chenzhongqin = chenzhongqinServiceImpl.deleteChenzhongqin(id);

        Assert.notNull(chenzhongqin, "已被删除");

        return Result.success(chenzhongqin);
    }

}
