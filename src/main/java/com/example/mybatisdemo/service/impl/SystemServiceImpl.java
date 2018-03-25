package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.adminInfo;
import com.example.mybatisdemo.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    com.example.mybatisdemo.mapper.SystemMapper SystemMapper;

    public List<adminInfo> findAllAdmin() {
        return SystemMapper.findAllAdmin();
    }
    public adminInfo findAdmin(Integer id){return SystemMapper.findAdmin(id);}
    public void updateById(adminInfo adminInfo){ SystemMapper.updateById(adminInfo);}
    public void deleteById(int admin_id){SystemMapper.deleteById(admin_id);}
}
