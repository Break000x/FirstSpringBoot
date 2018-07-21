package com.weik.services.busi;

import com.weik.Mapping.WeContextMapping;
import com.weik.enitiy.WeContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class GetHomeContextServiceImpl {
    @Autowired
    WeContextMapping weContextMapping;

    @Transactional
    public List<WeContext> getHotContext(){
        List<WeContext> weContextList = weContextMapping.getAllContext();
        return weContextList;
    }
}
