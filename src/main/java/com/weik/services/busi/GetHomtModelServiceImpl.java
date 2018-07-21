package com.weik.services.busi;

import com.weik.Mapping.WeHomeMapping;
import com.weik.enitiy.WeHome;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class GetHomtModelServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(GetHomtModelServiceImpl.class);


    @Autowired
    private WeHomeMapping weHomeMapping;

    @Transactional
    public List<WeHome> getHomeModel(){
        List<WeHome> weHomeList = weHomeMapping.getAll();
        logger.info(weHomeList.toString());
        return weHomeList;
    }
}
