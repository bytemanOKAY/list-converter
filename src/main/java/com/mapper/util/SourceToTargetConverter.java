package com.mapper.util;

import com.mapper.dto.Source;
import com.mapper.dto.Target;

/**
 * Created by evgen on 13.10.16.
 */
public class SourceToTargetConverter {

    public static Target convertToTarget(Source source){

        Target target = new Target();

        target.setFullName(source.getFirstName() + " " + source.getLastName());
        target.setAge(source.getAge());

        return target;
    }

}
