package pers.caijx.restful.controller;

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

    @GetMapping
    public List<TvseriesDto> getAll() {
        List<TvseriesDto> list = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.set(2016,Calendar.OCTOBER,2,0,0);
        list.add(new TvseriesDto(1,"WestLand",1,cal.getTime()));
        return list;
    }
}
