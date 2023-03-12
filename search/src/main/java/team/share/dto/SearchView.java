package team.share.dto;

import team.share.constant.SearchType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SearchView {

    private Long id;
    private String name;
    private SearchType type;

    @Builder

    public SearchView(Long id, String name, SearchType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
