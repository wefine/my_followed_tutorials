package com.wefine.mybatis.mapper;

import com.wefine.mybatis.entity.Tutor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TutorMapper {

    Tutor findWithRefById(Long id);
}
