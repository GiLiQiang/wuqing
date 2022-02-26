package com.futurelight.service;

import com.futurelight.poio.ContactInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ContactService {
    PageInfo<ContactInfo> query();
}
