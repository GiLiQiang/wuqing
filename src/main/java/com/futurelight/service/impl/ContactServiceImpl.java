package com.futurelight.service.impl;

import com.futurelight.mapper.ContactMapper;
import com.futurelight.poio.ContactInfo;
import com.futurelight.service.ContactService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public PageInfo<ContactInfo> query() {
        PageHelper.startPage(1,2);
        List<ContactInfo> query = contactMapper.query();
        return new PageInfo<>(query);
    }
}
