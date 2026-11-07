package Social;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String author;
    private String text;
    private List<Comment> comments;

    public Publication(String author, String text, List<Comment> comments){
        this.author = author;
        this.text = text;
        this.comments = new ArrayList<>(comments);
    }


}
