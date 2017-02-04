package org.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sys.dao.UserTestDao;
import org.sys.entity.UserTest;

/**
 * Created by Administrator on 2017-02-04.
 */
@Service
public class SysIndexService {

    @Autowired
    private UserTestDao userTestDao;

    public UserTest getUserTestById(Integer id){
        return userTestDao.queryById(id);
    }

}
