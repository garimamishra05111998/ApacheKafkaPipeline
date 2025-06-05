package Kafka_Producer;

import Bean.TradeStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TradeProducer {
    @Autowired
    private KafkaTemplate<String, TradeStatus> kafkaTemplate;

    public void sendTradeStatus(TradeStatus tradeStatus) {
        kafkaTemplate.send("trade-status", tradeStatus);
    }
}
