package api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookBuilderRequest {
        public String userId;
        public ArrayList<CollectionOfIsbn> collectionOfIsbns;

}
