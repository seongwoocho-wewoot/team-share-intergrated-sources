package team.share.config.formatter;

import team.share.constant.SearchType;
import org.springframework.core.convert.converter.Converter;

public class SearchTypeConverter implements Converter<String, SearchType> {

    @Override
    public SearchType convert(String source) {

        return SearchType.from(source);
    }
}
