package com.mapper.rest;

import com.mapper.dto.Source;
import com.mapper.dto.Target;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.mapper.util.SourceToTargetConverter.convertToTarget;

/**
 * Created by evgen on 13.10.16.
 */
@RestController
public class Controller {

    @RequestMapping("/convert")
    public List<Target> convertList(@RequestBody List<Source> sourceList){

        List<Target> list = new ArrayList<>();
        for(Source source : sourceList){
            list.add(convertToTarget(source));
        }

        return list;
    }
}
