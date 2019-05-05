package com.wzh.seim.service.bo.user.impl;

import com.wzh.seim.service.bo.user.IBoToperator;
import com.wzh.seim.service.entity.user.TOperator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BoToperatorImpl implements IBoToperator {

    @Resource
    com.wzh.seim.service.dao.user.TOperatorMapper TOperatorMapper;

    @Override
    public TOperator selectByPrimaryKey(Long foperatorid) throws Exception  {
        TOperator tOperator=null;
        try {
            tOperator= TOperatorMapper.selectByPrimaryKey(foperatorid);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return tOperator;
    }
}
