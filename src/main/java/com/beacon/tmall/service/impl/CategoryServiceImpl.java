package com.beacon.tmall.service.impl;

import com.beacon.tmall.mapper.CategoryMapper;
import com.beacon.tmall.pojo.Category;
import com.beacon.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
