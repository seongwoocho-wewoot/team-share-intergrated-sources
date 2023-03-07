package team.share.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SearchView {

    private Long id;
    private String name;
    private String type;

    @Builder
    public SearchView(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
