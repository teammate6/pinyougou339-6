package cn.itcast.core.service;

import cn.itcast.core.pojo.specification.Specification;
import entity.PageResult;
import vo.SpecificationVo;

import java.util.List;
import java.util.Map;

public interface SpecificationService {
    PageResult search(Integer page, Integer rows, Specification specification);

    void add(SpecificationVo specificationvo);

    SpecificationVo findOne(Long id);

    void update(SpecificationVo specificationvo);

    void delete(Long[] ids);

    List<Map> selectOptionList();


    void updateStatus(Long[] ids, String status);

    void uploadExcelForStore(List<String[]> list);

}
