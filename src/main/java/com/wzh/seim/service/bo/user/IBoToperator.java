package com.wzh.seim.service.bo.user;

import com.wzh.seim.service.entity.user.TOperator;

public interface IBoToperator {
    TOperator selectByPrimaryKey(Long foperatorid) throws Exception;

}
