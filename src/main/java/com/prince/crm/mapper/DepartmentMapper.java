package com.prince.crm.mapper;

import com.prince.crm.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    Department selectByPrimaryKey(Long id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);

    List<Department> getDepartmentIdNames();
}