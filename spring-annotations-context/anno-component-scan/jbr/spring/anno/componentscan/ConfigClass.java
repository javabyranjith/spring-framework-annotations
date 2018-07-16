package jbr.spring.anno.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(includeFilters = {
    @ComponentScan.Filter(type = FilterType.REGEX, pattern = { "jbr.spring.anno.componentscan.service.*.Service",
        "jbr.spring.anno.componentscan.dao.*.Dao" }) }, excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = { Controller.class }) })
public class ConfigClass {

}
