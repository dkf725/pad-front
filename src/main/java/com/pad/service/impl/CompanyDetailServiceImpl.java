package com.pad.service.impl;

import com.pad.entity.CompanyDetail;
import com.pad.mapper.CompanyDetailMapper;
import com.pad.service.CompanyDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业用户详细信息表 服务实现类
 * </p>
 *
 * @author F4
 * @since 2022-09-12
 */
@Service
public class CompanyDetailServiceImpl extends ServiceImpl<CompanyDetailMapper, CompanyDetail> implements CompanyDetailService {

    @Autowired
    CompanyDetailMapper companyDetailMapper;

    @Override
    public CompanyDetail selectByFK(String cNo) {
        return companyDetailMapper.selectByFK(cNo);
    }
}
