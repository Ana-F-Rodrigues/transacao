//package br.com.zupacademy.ana.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.support.converter.JsonMessageConverter;
//
////@Configuration
//public class KafkaConfiguration {
//
////    private final KafkaProperties kafkaProperties;
////
////    public KafkaConfiguration(KafkaProperties kafkaProperties) {
////        this.kafkaProperties = kafkaProperties;
////    }
//
////    public Map<String, Object> consumerConfigurations() {
////        Map<String, Object> properties = new HashMap<>();
////        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
////        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, kafkaProperties.getConsumer().getKeyDeserializer());
////        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, kafkaProperties.getConsumer().getValueDeserializer());
////        properties.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaProperties.getConsumer().getGroupId());
////        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, kafkaProperties.getConsumer().getAutoOffsetReset());
////        return properties;
////    }
////
////    @Bean
////    public ConsumerFactory<String, EventoTransacao> transactionConsumerFactory() {
////        StringDeserializer stringDeserializer = new StringDeserializer();
////        JsonDeserializer<EventoTransacao> jsonDeserializer = new JsonDeserializer<>(EventoTransacao.class, false);
////
////        return new DefaultKafkaConsumerFactory<>(consumerConfigurations(), stringDeserializer, jsonDeserializer);
////    }
////
////    @Bean
////    public ConcurrentKafkaListenerContainerFactory<String, EventoTransacao> kafkaListenerContainerFactory() {
////        ConcurrentKafkaListenerContainerFactory<String, EventoTransacao> factory = new ConcurrentKafkaListenerContainerFactory<>();
////        factory.setConsumerFactory(transactionConsumerFactory());
////        return factory;
////    }
//	
//	
//
//
//}
//
//
