package wind.yang.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class KafkaTestRunner implements ApplicationRunner {
    @Autowired
    MessageProducer producer;

//    @Autowired
//    MessageListener listener;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        producer.sendMessage("Hello World");
//        listener.latch.await(10, TimeUnit.SECONDS);
    }
}
