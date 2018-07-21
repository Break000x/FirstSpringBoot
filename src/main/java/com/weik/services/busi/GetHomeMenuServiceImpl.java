package com.weik.services.busi;

import com.weik.Mapping.WeHomeMapping;
import com.weik.Mapping.WeMenuMapping;
import com.weik.enitiy.WeMenu;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GetHomeMenuServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(GetHomeMenuServiceImpl.class);

    @Autowired
    private WeMenuMapping weMenuMapping;

    @Transactional
    public List<WeMenu> getAllMenu(){
        List<WeMenu> weMenusList = weMenuMapping.getAllClass();
        logger.info(String.valueOf(weMenusList));
        return weMenusList;
    }

}
