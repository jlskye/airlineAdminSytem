package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.adminInfo;

import java.util.List;

public interface SystemService {
    List<adminInfo> findAllAdmin();
    adminInfo findAdmin(Integer id);
    void updateById(adminInfo adminInfo);
    void deleteById(int admin_id);
}
