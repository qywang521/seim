package com.wzh.seim.service.dao.user;

import com.wzh.seim.service.entity.user.TOperator;


public interface TOperatorMapper {
    int deleteByPrimaryKey(Long foperatorid);

    int insert(TOperator record);

    int insertSelective(TOperator record);

    TOperator selectByPrimaryKey(Long foperatorid);

    int updateByPrimaryKeySelective(TOperator record);

    int updateByPrimaryKey(TOperator record);
}