package com.example.demo.service.Impl;

import com.example.demo.dao.CodeDao;
import com.example.demo.model.CodeVo;
import com.example.demo.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "codeService")
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeDao codeDao;

    @Override
    public List<CodeVo> getCodeLists() {
        return codeDao.getcodeLists();
    }
}
