package Bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "trade_status")
public class TradeStatus {
    @Id
    private String id;
    private String tradeId;
    private String status;
    private LocalDateTime updatedAt;
}
