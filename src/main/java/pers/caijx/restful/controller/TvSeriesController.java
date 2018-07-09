package pers.caijx.restful.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.dto.TvseriesDto;

import java.util.*;

/**
 * Created by Administrator on 2018/7/9/009.
 */
@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TvSeriesController.class);

    @GetMapping
    public List<TvseriesDto> getAll() {
        LOGGER.info("getALL()被调用 begin");
        List<TvseriesDto> list = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.set(2016,Calendar.OCTOBER,2,0,0);
        list.add(new TvseriesDto(1,"WestLand",1,cal.getTime()));
        cal.set(2011,Calendar.SEPTEMBER,2,0,0);
        list.add(new TvseriesDto(2,"Person of Interest",5,cal.getTime()));
        LOGGER.info("getAll()被调用 end");
        return list;
    }
}
