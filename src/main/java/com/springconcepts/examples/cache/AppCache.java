package com.springconcepts.examples.cache;

import com.springconcepts.examples.entity.CacheEntity;
import com.springconcepts.examples.repository.CacheRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class AppCache {


    @Autowired
    public CacheRepository CacheRespository;

  public Map<String,String> appCacheMap=new HashMap<>();

    @PostConstruct
    public void init()

    {
       log.info("App Cache post construct");
        List<CacheEntity> all=CacheRespository.findAll();

        for(CacheEntity cacheEntity:all) {

            log.info("Inside cache Entity");
            appCacheMap.put(cacheEntity.getKey(), cacheEntity.getValue());
          log.info(cacheEntity.getKey());
            log.info(appCacheMap.get("TEST_KEY"));
        }

    }
}
