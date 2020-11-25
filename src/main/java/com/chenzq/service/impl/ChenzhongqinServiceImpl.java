package com.chenzq.service.impl;

import com.chenzq.entity.Chenzhongqin;
import com.chenzq.mapper.ChenzhongqinMapper;
import com.chenzq.service.ChenzhongqinService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2020-09-06
 */
@Service
public class ChenzhongqinServiceImpl extends ServiceImpl<ChenzhongqinMapper, Chenzhongqin> implements ChenzhongqinService {

    @Resource
    ChenzhongqinMapper chenzhongqinMapper;

    //查询
    public List<Chenzhongqin> queryChenzhongqinList() {
        //List<Chenzhongqin> chenzhongqin = ;
        return chenzhongqinMapper.queryChenzhongqinList();
    }
    //根据id查询

    public Chenzhongqin queryChenzhongqinById(int id) {
        //List<Chenzhongqin> chenzhongqin = ;
        return chenzhongqinMapper.queryChenzhongqinById(id);
    }

    //添加
    public int addChenzhongqin(Chenzhongqin chenzhongqin) {
        return chenzhongqinMapper.addChenzhongqin(chenzhongqin);
    }

    //修改
    public int updateChenzhongqin(Chenzhongqin chenzhongqin) {
        return chenzhongqinMapper.updateChenzhongqin(chenzhongqin);
    }

    // 通过id删除
    public int deleteChenzhongqin(int id) {
        return chenzhongqinMapper.deleteChenzhongqin(id);
    }
}
