package com.kafka.producer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.Nullable;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.kafka.consumer.Listenserconsumer;

@RestController
@RequestMapping("/kafka")
public class CollectController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private KafkaTemplate kafkaTemplate;

	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String sendKafka(HttpServletRequest request, HttpServletResponse response) {
		try {
			String message = request.getParameter("message");
			logger.info("kafka的消息={}", message);
			/*
			 * this.defaultTopic, partition, key, data public ListenableFuture<SendResult<K,
			 * V>> sendDefault(K key, @Nullable V data) { return send(this.defaultTopic,
			 * key, data); }
			 */
			kafkaTemplate.send("XML2DIP", "key", message);
			logger.info("发送kafka成功.");
			System.out.println("-----------监听开始---------------");
			return "Kafka发送信息成功";
		} catch (Exception e) {
			logger.error("发送kafka失败", e);
			return "Kafka发送信息失败";
		}

	}

}
