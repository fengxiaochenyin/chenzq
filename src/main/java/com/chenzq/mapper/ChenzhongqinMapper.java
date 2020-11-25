package com.chenzq.mapper;

import com.chenzq.entity.Chenzhongqin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2020-09-06
 */

//@Repository
@Mapper
public interface ChenzhongqinMapper extends BaseMapper<Chenzhongqin> {

    //查询所有信息
    @Select("select * from chenzhongqin")
    List<Chenzhongqin> queryChenzhongqinList();

    //根据id查询所有信息
    @Select("select * from chenzhongqin where id = #{id}")
    Chenzhongqin queryChenzhongqinById(int id);

    //添加信息
    @Insert("insert into chenzhongqin(name,age,sex) values(#{name},#{age},#{sex})")
    int addChenzhongqin(Chenzhongqin chenzhongqin);

    //修改信息
    @Update("update chenzhongqin set (name=#{name},age=#{age},sex=#{sex})")
    int  updateChenzhongqin(Chenzhongqin chenzhongqin);

    @Delete("delete from chenzhongqin where id = #{id}")
    int deleteChenzhongqin(int id);

}
