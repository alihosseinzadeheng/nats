package ir.jibit.nats;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.nats.client.Connection;
import io.nats.client.Nats;
import io.nats.client.Options;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@SpringBootApplication
public class NatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatsApplication.class, args);
	}

//	@Bean(name = "NatsExecutorService", destroyMethod = "shutdown")
//	public ExecutorService getNatsExecutor() {
//		ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
//		threadFactoryBuilder.setNameFormat("nats-client-pool-%d");
//		return Executors.newCachedThreadPool(threadFactoryBuilder.build());
//	}
//	@Bean(destroyMethod = "close")
//	public Connection getNatsConnection(
//			@Value("${nats.servers}") String[] natsServers,
//			@Qualifier("NatsExecutorService") ExecutorService natsExecutor,
//			ApplicationContext applicationContext) {
//
//		Options o = new Options.Builder()
//				.servers(natsServers)
//				.maxReconnects(-1)
//				.executor(natsExecutor)
//				.build();
//		try {
//			return Nats.connect(o);
//		} catch (Exception e) {
//			log.error("An exception happened during listening to NATS", e);
//			SpringApplication.exit(applicationContext);
//			return null;
//		}
//	}
//
//	@Bean(name = "RequestHandlerExecutorService", destroyMethod = "shutdown")
//	public ExecutorService getRequestHandlerExecutorService() {
//		return Executors.newCachedThreadPool();
//	}

	@Bean
	Connection tt() throws IOException, InterruptedException {
		return Nats.connect();
	}
}
