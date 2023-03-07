package team.share.config;

import constant.SearchType;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import team.share.config.formatter.SearchTypeConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {

//        registry.addConverter(String.class, SearchType.class, SearchType::from);
        registry.addConverter(new SearchTypeConverter());
    }
}
