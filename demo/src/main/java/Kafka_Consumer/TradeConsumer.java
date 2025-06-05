package Kafka_Consumer;

import Bean.TradeStatus;
import Repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class TradeConsumer {
    @Autowired
    private TradeRepository repository;

    @KafkaListener(topics = "trade-status", groupId = "group_id")
    public void consume(TradeStatus status) {
        repository.save(status);  // Store in MongoDB
    }
}
