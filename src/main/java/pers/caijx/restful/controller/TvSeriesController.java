package pers.caijx.restful.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
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
        list.add(createWestWorld());
        cal.set(2011,Calendar.SEPTEMBER,2,0,0);
        list.add(createPoi());
        LOGGER.info("getAll()被调用 end");
        return list;
    }

    @GetMapping("/{id}")
    public TvseriesDto getOne(@PathVariable int id) {
        LOGGER.info("getOne " + id + " begin");
        if (id == 101) {
            return createWestWorld();
        } else if (id == 102) {
            return createPoi();
        } else {
            throw new ResourceNotFoundException("找不到哦",null);
        }
//        LOGGER.info("getOne " + id + " end");
    }

    @PostMapping
    public TvseriesDto insertOne(@RequestBody TvseriesDto tvseriesDto) {
        LOGGER.info("insertOne begin");
        tvseriesDto.setId(9999);
        return tvseriesDto;
    }

    @PutMapping("/{id}")
    public TvseriesDto updateOne(@PathVariable int id,@RequestBody TvseriesDto tvseriesDto) {
        LOGGER.info("updateOne begin ");
        if (id == 101 || id == 102) {
            return createPoi();
        } else {
            throw new ResourceNotFoundException("更新电影异常",null);
        }
    }

    private TvseriesDto createPoi() {
        Calendar cal = Calendar.getInstance();
        cal.set(2011,Calendar.SEPTEMBER,2,0,0);
        return new TvseriesDto(2,"Person of Interest",5,cal.getTime());
    }

    private TvseriesDto createWestWorld() {
        Calendar cal = Calendar.getInstance();
        cal.set(2016,Calendar.OCTOBER,2,0,0);
        return new TvseriesDto(1,"WestLand",1,cal.getTime());
    }
}
