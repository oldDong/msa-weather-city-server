package com.dongzj.spring.cloud.weather.controller;

import com.dongzj.spring.cloud.weather.service.CityDataService;
import com.dongzj.spring.cloud.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/8/31
 * Time: 14:47
 */
@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception{
        return cityDataService.listCity();
    }
}
