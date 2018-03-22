package com.chaoqi.demo.dao.mapper;

import com.chaoqi.demo.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicInfoDAO {
    @ResultMap("BaseResultMap")
    @Select("SELECT * FROM music_info")
    List<MusicInfo> selectAll();
}
