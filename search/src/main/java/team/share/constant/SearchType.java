package team.share.constant;

import java.util.Arrays;

public enum SearchType {

    TYPE_A("Type-A"),
    TYPE_B("Type-B"),
    TYPE_C("Type-C");


    private final String value;

    SearchType(String value) {
        this.value = value;
    }

    public static SearchType from(String string) {

        return Arrays.stream(values())
                .filter(searchType -> searchType.value.equalsIgnoreCase(string.toLowerCase()))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
