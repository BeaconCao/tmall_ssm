package com.beacon.tmall.controller;


import com.beacon.tmall.pojo.Category;
import com.beacon.tmall.service.CategoryService;
import com.beacon.tmall.util.Page;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/admin_category_list")
    public String adminCategoryList(Model model) {

        List<Category> cs = categoryService.list();
        model.addAttribute("cs", cs);
        return "admin/listCategory";
    }

}
