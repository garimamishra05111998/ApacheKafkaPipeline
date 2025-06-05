package Repository;
import Bean.TradeStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TradeRepository extends MongoRepository<TradeStatus, String> {
}
